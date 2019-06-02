grammar Rose;

token:(BEGIN|DECLARE|ELSE|END|EXIT|FOR|IF|IN|INTEGER|IS|LOOP|PROCEDURE|READ|THEN|WRITE|ID|CONST|WHITESPACE|COMMENT|COL|DOT2|SCOL|ADD|SUB|MUL|DIV|MOD|EQ|NEQ|GT|GE|LT|LE|AND|OR|NOT|DEF|OPAREN|CPAREN)*;

program:PROCEDURE ID IS DECLARE variables BEGIN statements END SCOL;
variables:variables2
	;
variables2:variable variables2
	|
	;
variable:ID COL INTEGER SCOL
	;
statements:statements2
	;
statements2:statement statements2
	|
	;
statement:assignment_statement
	|if_statement
	|for_statement
	|exit_statement
	|read_statement
	|write_statement
	;
assignment_statement:ID DEF arith_expression SCOL
	;
if_statement:IF bool_expression THEN statements else_statement
	;
else_statement:ELSE statements END IF SCOL
	|END IF SCOL
	;
for_statement:FOR ID IN arith_expression DOT2 arith_expression LOOP statements END LOOP SCOL
	;
exit_statement:EXIT SCOL
	;
read_statement:READ ID SCOL
	;
write_statement:WRITE arith_expression SCOL
	;
bool_expression:bool_term bool_expression2
	;
bool_expression2:OR bool_term bool_expression2
	|
	;
bool_term:bool_factor bool_term2
	;
bool_term2:AND bool_factor bool_term2
	|
	;
bool_factor:NOT bool_primary
	|bool_primary
	;
bool_primary:arith_expression relation_op arith_expression
	;
relation_op:EQ
	|NEQ
	|GT
	|GE
	|LT
	|LE
	;
arith_expression:arith_term arith_expression2
	;
arith_expression2:ADD arith_term arith_expression2
	|SUB arith_term arith_expression2
	|
	;
arith_term:arith_factor arith_term2
	;
arith_term2:MUL arith_factor arith_term2
	|DIV arith_factor arith_term2
	|MOD arith_factor arith_term2
	|
	;
arith_factor:SUB arith_primary
	|arith_primary
	;
arith_primary:CONST
	|ID
	|OPAREN arith_expression CPAREN
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

ID:Head(Letter|'0'..'9')*;
fragment Head:[A-Z_];
fragment Letter:[a-zA-Z_];

CONST:Nonzero(INT)*|INT;
fragment Nonzero:[1-9];
fragment INT:[0-9];

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
