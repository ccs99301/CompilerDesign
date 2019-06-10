grammar Rose;

token:(BEGIN|DECLARE|ELSE|END|EXIT|FOR|IF|IN|INTEGER|IS|LOOP|PROCEDURE|READ|THEN|WRITE|ID|CONST|WHITESPACE|COMMENT|COL|DOT2|SCOL|ADD|SUB|MUL|DIV|MOD|EQ|NEQ|GT|GE|LT|LE|AND|OR|NOT|DEF|OPAREN|CPAREN)*;

program:PROCEDURE ID IS DECLARE variables BEGIN
	{int reg=0,label=1; System.out.println("\n\t.text\nmain:");} statements[reg,label] END SCOL;
variables:{System.out.println("\t.data");} variables2
	;
variables2:variable variables2
	|
	;
variable:ID COL INTEGER SCOL {System.out.println($ID.getText()+":\t.word 0");}
	;
statements[int reg,int label] returns[int nreg,int nlabel]:
	statements2[$reg,$label] {$nreg=$statements2.nreg; $nlabel=$statements2.nlabel;}
	;
statements2[int reg,int label] returns[int nreg,int nlabel]:
	statement[$reg,$label] statements2[$statement.nreg,$statement.nlabel] {$nreg=$statements2.nreg; $nlabel=$statements2.nlabel;}
	|{$nreg=$reg; $nlabel=$label;}
	;
statement[int reg,int label] returns[int nreg,int nlabel]:
	assignment_statement[$reg] {$nreg=$assignment_statement.nreg; $nlabel=$label;}
	|if_statement[$reg,$label] {$nreg=$if_statement.nreg; $nlabel=$if_statement.nlabel;}
	|for_statement[$reg,$label] {$nreg=$for_statement.nreg; $nlabel=$for_statement.nlabel;}
	|exit_statement {$nreg=$reg; $nlabel=$label;}
	|read_statement[$reg] {$nreg=$reg; $nlabel=$label;}
	|write_statement[$reg] {$nreg=$write_statement.nreg; $nlabel=$label;}
	;
assignment_statement[int reg] returns[int nreg]:ID DEF arith_expression[$reg] SCOL
	{System.out.println("\tla\t\$t"+$arith_expression.nreg+", "+$ID.getText());
	 System.out.println("\tsw\t\$t"+$arith_expression.place+", 0(\$t"+$arith_expression.nreg+")");
	 $nreg=$arith_expression.nreg-1;}
	;
if_statement[int reg,int label] returns[int nreg,int nlabel]:
	IF {int btrue=$label++; int bfalse=$label++; int Lnext;}
	bool_expression[$reg,$label,btrue,bfalse] THEN {System.out.println("L"+$bool_expression.tbtrue+":");}
	statements[$bool_expression.nreg,$bool_expression.nlabel] {Lnext=$bool_expression.nlabel++;}
	else_statement[$statements.nreg,$statements.nlabel,$bool_expression.tbfalse,Lnext]
	{$nreg=$else_statement.nreg; $nlabel=$else_statement.nlabel;}
	;
else_statement[int reg,int label,int bfalse,int Lnext] returns[int nreg,int nlabel]:
	{System.out.println("\tb\tL"+$Lnext); System.out.println("L"+$bfalse+":");} ELSE statements[$reg,$label] END IF SCOL
	{System.out.println("L"+$Lnext+":"); $nreg=$statements.nreg; $nlabel=$statements.nlabel;}
	|END IF SCOL {System.out.println("L"+$bfalse+":"); $nreg=$reg; $nlabel=$label;}
	;
for_statement[int reg,int label] returns[int nreg,int nlabel]: {int Lbegin=$label++; int btrue=$label++; int bfalse=$label++;}
	FOR ID IN arith_expression[$reg] {System.out.println("\tla\t\$t"+$arith_expression.nreg+", "+$ID.getText());
	System.out.println("\tsw\t\$t"+$arith_expression.place+", 0(\$t"+$arith_expression.nreg+")"); $nreg=$arith_expression.nreg-1;
	System.out.println("L"+Lbegin+":"); System.out.println("\tla\t\$t"+$nreg+", "+$ID.getText());
	System.out.println("\tlw\t\$t"+$nreg+", 0(\$t"+$nreg+")");} DOT2 arith_expression[$nreg+1]
	{System.out.println("\tble\t\$t"+$nreg+", \$t"+$arith_expression.place+", L"+btrue); System.out.println("\tb\tL"+bfalse);}
	LOOP {System.out.println("L"+btrue+":"); $nreg=$arith_expression.nreg-2;} statements[$nreg,$label]
	{$nreg=$statements.nreg; System.out.println("\tla\t\$t"+$nreg+", "+$ID.getText());
	 System.out.println("\tlw\t\$t"+$nreg+", 0(\$t"+$nreg+")"); System.out.println("\tli\t\$t"+($nreg+1)+", 1");
	 System.out.println("\tadd\t\$t"+$nreg+", \$t"+$nreg+", \$t"+($nreg+1));
	 System.out.println("\tla\t\$t"+($nreg+1)+", "+$ID.getText()); System.out.println("\tsw\t\$t"+$nreg+", 0(\$t"+($nreg+1)+")");}
	END LOOP SCOL
	{System.out.println("\tb\tL"+Lbegin); System.out.println("L"+bfalse+":"); $nreg=$statements.nreg; $nlabel=$statements.nlabel;}
	;
exit_statement:EXIT SCOL {System.out.println("\tli\t\$v0, 10\n\tsyscall");}
	;
read_statement[int reg]:READ ID SCOL
	{System.out.println("\tli\t\$v0, 5\n\tsyscall\n\tla\t\$t"+$reg+", "+$ID.getText()+"\n\tsw\t\$v0, 0(\$t"+$reg+")");}
	;
write_statement[int reg] returns[int nreg]:WRITE arith_expression[$reg] SCOL
	{System.out.println("\tmove\t\$a0, \$t"+$arith_expression.place+"\n\tli\t\$v0, 1\n\tsyscall"); $nreg=$arith_expression.nreg-1;}
	;
bool_expression[int reg,int label,int btrue,int bfalse] returns[int nreg,int nlabel,int tbtrue,int tbfalse]:
	bool_term[$reg,$label,$btrue,$bfalse] {$bool_term.nlabel++; $tbtrue=$bool_term.nlabel-3;}
	bool_expression2[$bool_term.nreg,$bool_term.nlabel,$bool_term.nlabel-3,$bool_term.nlabel-1]
	{$nreg=$bool_expression2.nreg; $nlabel=$bool_expression2.nlabel; $tbfalse=$bool_expression2.tbfalse;}
	;
bool_expression2[int reg,int label,int btrue,int bfalse] returns[int nreg,int nlabel,int tbfalse]:
	{System.out.println("L"+$bfalse+":");} OR bool_term[$reg,$label,$btrue,$bfalse] {$bool_term.nlabel++;}
	bool_expression2[$bool_term.nreg,$bool_term.nlabel,$btrue,$bool_term.nlabel-1]
	{$nreg=$bool_expression2.nreg; $nlabel=$bool_expression2.nlabel; $tbfalse=$bfalse;}
	|{$nreg=$reg; $nlabel=$label-1; $tbfalse=$bfalse-1;}
	;
bool_term[int reg,int label,int btrue,int bfalse] returns[int nreg,int nlabel]:
	bool_factor[$reg,$label,$btrue,$bfalse] {$bool_factor.nlabel++;}
	bool_term2[$bool_factor.nreg,$bool_factor.nlabel,$bool_factor.nlabel-1,$bfalse]
	{$nreg=$bool_term2.nreg; $nlabel=$bool_term2.nlabel;}
	;
bool_term2[int reg,int label,int btrue,int bfalse] returns[int nreg,int nlabel]:
	{System.out.println("L"+$btrue+":");} AND bool_factor[$reg,$label,$btrue,$bfalse] {$bool_factor.nlabel++;}
	bool_term2[$bool_factor.nreg,$bool_factor.nlabel,$bool_factor.nlabel-1,$bfalse]
	{$nreg=$bool_term2.nreg; $nlabel=$bool_term2.nlabel;}
	|{$nreg=$reg; $nlabel=$label-1;}
	;
bool_factor[int reg,int label,int btrue,int bfalse] returns[int nreg,int nlabel]:
	NOT bool_primary[$reg,$label,$bfalse,$btrue] {$nreg=$bool_primary.nreg; $nlabel=$bool_primary.nlabel;}
	|bool_primary[$reg,$label,$btrue,$bfalse] {$nreg=$bool_primary.nreg; $nlabel=$bool_primary.nlabel;}
	;
bool_primary[int reg,int label,int btrue,int bfalse] returns[int nreg,int nlabel]: {int oplace;}
	arith_expression[$reg] {oplace=$arith_expression.place;} relation_op arith_expression[$arith_expression.nreg]
	{System.out.println("\t"+$relation_op.op+"\t\$t"+oplace+", \$t"+$arith_expression.place+", L"+$btrue);
	 System.out.println("\tb\tL"+$bfalse); $nreg=$arith_expression.nreg-2; $nlabel=$label;}
	;
relation_op returns[String op]:EQ {$op="beq";}
	|NEQ {$op="bne";}
	|GT {$op="bgt";}
	|GE {$op="bge";}
	|LT {$op="blt";}
	|LE {$op="ble";}
	;
arith_expression[int reg] returns[int nreg,int place]:arith_term[$reg] arith_expression2[$arith_term.nreg,$arith_term.place]
	{$nreg=$arith_expression2.nreg; $place=$arith_expression2.place;}
	;
arith_expression2[int reg,int oplace] returns[int nreg,int place]:
	ADD arith_term[$reg] {System.out.println("\tadd\t\$t"+$oplace+", \$t"+$oplace+", \$t"+$arith_term.place);
	$nreg=$arith_term.nreg-1; $place=$oplace;} arith_expression2[$nreg,$oplace]
	|SUB arith_term[$reg] {System.out.println("\tsub\t\$t"+$oplace+", \$t"+$oplace+", \$t"+$arith_term.place);
	$nreg=$arith_term.nreg-1; $place=$oplace;} arith_expression2[$nreg,$oplace]
	|{$nreg=$reg; $place=$oplace;}
	;
arith_term[int reg] returns[int nreg,int place]:arith_factor[$reg] arith_term2[$arith_factor.nreg,$arith_factor.place]
	{$nreg=$arith_term2.nreg; $place=$arith_term2.place;}
	;
arith_term2[int reg,int oplace] returns[int nreg,int place]:
	MUL arith_factor[$reg] {System.out.println("\tmul\t\$t"+$oplace+", \$t"+$oplace+", \$t"+$arith_factor.place);
	$nreg=$arith_factor.nreg-1; $place=$oplace;} arith_term2[$nreg,$oplace]
	|DIV arith_factor[$reg] {System.out.println("\tdiv\t\$t"+$oplace+", \$t"+$oplace+", \$t"+$arith_factor.place);
	$nreg=$arith_factor.nreg-1; $place=$oplace;} arith_term2[$nreg,$oplace]
	|MOD arith_factor[$reg] {System.out.println("\trem\t\$t"+$oplace+", \$t"+$oplace+", \$t"+$arith_factor.place);
	$nreg=$arith_factor.nreg-1; $place=$oplace;} arith_term2[$nreg,$oplace]
	|{$nreg=$reg; $place=$oplace;}
	;
arith_factor[int reg] returns[int nreg,int place]:
	SUB arith_primary[$reg] {System.out.println("\tneg\t\$t"+$arith_primary.place+", \$t"+$arith_primary.place);
	$nreg=$arith_primary.nreg; $place=$arith_primary.place;}
	|arith_primary[$reg] {$nreg=$arith_primary.nreg; $place=$arith_primary.place;}
	;
arith_primary[int reg] returns[int nreg,int place]:
	CONST {System.out.println("\tli\t\$t"+$reg+", "+$CONST.getText()); $place=$reg; $nreg=$reg+1;}
	|ID {System.out.println("\tla\t\$t"+$reg+", "+$ID.getText()); System.out.println("\tlw\t\$t"+$reg+", 0(\$t"+$reg+")");
	$place=$reg; $nreg=$reg+1;}
	|OPAREN arith_expression[$reg] CPAREN {$nreg=$arith_expression.nreg; $place=$arith_expression.place;}
	;

BEGIN:'begin';
DECLARE:'declare';
ELSE:'else';
END:'end';
EXIT:'exit';
FOR:'for';
IF:'if';
IN:'in';
INTEGER:'integer';
IS:'is';
LOOP:'loop';
PROCEDURE:'procedure';
READ:'read';
THEN:'then';
WRITE:'write';

ID:('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;

CONST:('1'..'9')('0'..'9')*|('0'..'9');

WHITESPACE:(' '|'\t'|'\n')+ -> skip;

COMMENT:'//' .*? '\n' -> skip;

COL:':';
DOT2:'..';
SCOL:';';
ADD:'+';
SUB:'-';
MUL:'*';
DIV:'/';
MOD:'%';
EQ:'=';
NEQ:'<>';
GT:'>';
GE:'>=';
LT:'<';
LE:'<=';
AND:'&&';
OR:'||';
NOT:'!';
DEF:':=';
OPAREN:'(';
CPAREN:')';
