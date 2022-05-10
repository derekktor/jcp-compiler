lexer grammar jcp;

WS: [ \t\r\n]+ -> skip;

//// Numbers
Num: [0-9]+;
FlPoint: Num '.' Num? | '.' Num;

//// Boolean
Bool: 'true' | 'false';

Letter: [a-zA-Z];
CharLiteral: '\'' Letter '\'';
StrLiteral: '\"' Letter+ '\"';

//// Separators

COMMA: ',';
DOT: '.';
SEMICOL: ';';
// parentheses
LPAR: '(';
RPAR: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';

//// Operators

// assignment ops
ASSIGN: '=';
ADDAS: '+=';
SUBAS: '-=';
MULAS: '*=';
DIVAS: '/=';
MODAS: '%=';

// logical ops
EQUAL: '==';
GT: '>';
LT: '<';
LE: '<=';
GE: '>=';
NOTEQ: '!=';
AND: '&&';
OR: '||';

// arithmetics
INC: '++';
DEC: '--';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';

// bitwise
BITAND: '&';
BITOR: '|';

//// Keywords

// data types
CHAR: 'char';
DOUBLE: 'double';
FLOAT: 'float';
INT: 'int';
SHORT: 'short';
LONG: 'long';
BOOLEAN: 'boolean';
BYTE: 'byte';
CONST: 'const';

// flow control
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';

// loop
DO: 'do';
WHILE: 'while';
CONTINUE: 'continue';
BREAK: 'break';
FOR: 'for';

// accesc modifiers
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';

// OOP
CLASS: 'class';
ENUM: 'enum';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
INTERFACE: 'interface';
PACKAGE: 'package';
THIS: 'this';
ABSTRACT: 'abstract';
FINAL: 'final';
SUPER: 'super';
IMPORT: 'import';

// error handling
ASSERT: 'assert';
CATCH: 'catch';
THROW: 'throw';
THROWS: 'throws';
TRY: 'try';
FINALLY: 'finally';

// others
NEW: 'new';
RETURN: 'return';
STATIC: 'static';
VOID: 'void';

//// Comments

// single line
SinComment: '//' .* -> channel(HIDDEN);
// multi line
MulComment: '/*' .* '*/' -> channel(HIDDEN);