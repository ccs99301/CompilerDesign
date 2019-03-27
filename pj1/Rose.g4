grammar Rose;

token:(BEGIN|DECLARE|ELSE|END|EXIT|FOR|IF|IN|INTEGER|IS|LOOP|PROCEDURE|READ|THEN|WRITE|ID|CONST|WHITESPACE|COMMENT|COL|DOT2|SCOL|ADD|SUB|MUL|DIV|MOD|EQ|NEQ|GT|GE|LT|LE|AND|OR|NOT|DEF|OPAREN|CPAREN)*;

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
