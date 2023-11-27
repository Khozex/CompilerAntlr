grammar Grammar;

PROGRAM : 'PROGRAM';
INTEGER : 'INTEGER';
BOOLEAN : 'BOOLEAN';
BEGIN   : 'BEGIN';
END     : 'END';
WHILE   : 'WHILE';
DO      : 'DO';
READ    : 'READ';
VAR     : 'VAR';
FALSE   : 'FALSE';
TRUE    : 'TRUE';
WRITE   : 'WRITE';
IF      : 'IF';
THEN    : 'THEN';
ELSE    : 'ELSE';
PVIG    : ';';
PONTO   : '.';
DPONTOS : ':';
VIG     : ',';
ABPAR   : '(';
FPAR    : ')';
ATRIB   : ':=';
OPAD    : '+' | '-';
OPMULT  : '*' | '/';
OPREL   : '>' | '<' | '>=' | '<=' | '==' | '<>';
OPNEG   : '~';
IDENTIFIER : Letter (Letter | [0-9])* { getText().length() <= 16 }?;
CTE        : ('+' | '-')? Digit+ { getText().length() <= 16 }?;
CADEIA     : '"' (~["\\] | '\\' .)* '"';
WS         : [ \t\r\n]+ -> skip ;
COMMENT    : '//' ~[\r\n]* -> skip ;

fragment Letter : [a-zA-Z];
fragment Digit  : [0-9];

prog : PROGRAM IDENTIFIER PVIG decls cmdComp PONTO;
decls : decl* ;
decl : VAR listDecl ;
listDecl : declTip (VIG declTip)* PVIG ;
declTip : listId DPONTOS tip ;
listId : IDENTIFIER (VIG IDENTIFIER)* ;
tip : INTEGER | BOOLEAN | STRING ;
cmdComp : BEGIN listCmd END;
listCmd : cmd (PVIG cmd)* PVIG? ;
cmd : cmdIf
    | cmdWhile
    | cmdRead
    | cmdWrite
    | cmdAtrib
    | cmdComp ;
cmdIf : IF expr THEN listCmd (ELSE listCmd)? END;
cmdWhile : WHILE expr DO cmdComp ;
cmdRead : READ ABPAR listId FPAR ;
cmdWrite : WRITE ABPAR listW FPAR ;
listW : elemW (VIG elemW)* ;
elemW : expr | CADEIA ;
cmdAtrib : IDENTIFIER ATRIB expr ;
expr : simpleExpr (OPREL simpleExpr)? ;
simpleExpr : term (OPAD term)* ;
term : factor (OPMULT factor)* ;
factor : IDENTIFIER
       | CTE
       | ABPAR expr FPAR
       | TRUE
       | FALSE
       | OPNEG factor ;



