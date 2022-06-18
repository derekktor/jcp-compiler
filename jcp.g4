grammar jcp;

start: packageDec* importDec* classDec* EOF;

packageDec: PACKAGE IDENTIFIER (DOT IDENTIFIER)* SEMI;

importDec: IMPORT IDENTIFIER (DOT IDENTIFIER)* SEMI;

classDec: modifier CLASS IDENTIFIER extendsDec? body;

modifier: PUBLIC | PRIVATE | PROTECTED;

extendsDec: EXTENDS IDENTIFIER (DOT IDENTIFIER)*;

body: LCUR bodyDec* RCUR;

bodyDec: memberDec | constructorDec | methodDec;

methodDec: modifier? STATIC? type arraySymbol? IDENTIFIER parameters block;

block: LCUR statement* RCUR;

localDec: type arraySymbol? IDENTIFIER assign?;

memberDec: modifier? localDec;

arraySymbol: LBRACK RBRACK;

type: VOID | primitiveType | referenceType;

primitiveType: numericType | BOOL;

numericType: integralType | floatingPointType;

integralType: BYTE | SHORT | INT | LONG | CHAR;

floatingPointType: FLOAT | DOUBLE;

referenceType: classType;

classType: IDENTIFIER;

classAccess: IDENTIFIER (DOT IDENTIFIER)*;

constructorDec: modifier IDENTIFIER parameters constructorBody;

parameters: LPAR parameter? (COMMA parameter)* RPAR;

parameter: type arraySymbol? IDENTIFIER;

constructorBody: LCUR constructorInvocation? statement* RCUR;

constructorInvocation:
	SUPER LPAR argument? (COMMA argument)* RPAR;

argument: literal | IDENTIFIER;

statement:
	sout
	| localDecStatement
	| expressionStatement
	| ifStatement
	| ifElseStatement
	| forStatement
	| forInCollectionStatement
	| whileStatement
	| switchStatement
	| DO statement WHILE LPAR expression RPAR SEMI
	| BREAK SEMI
	| CONTINUE SEMI
	| returnStatement
	| LCUR statement* RCUR;

localDecStatement: localDec SEMI;

ifStatement: IF LPAR expression RPAR statement;
elseStatement: ELSE statement;
ifElseStatement: ifStatement elseStatement;

forStatement: FOR LPAR forInit? SEMI forCondition? SEMI forUpdate? RPAR statement;
forInit: localDec | expression;
forUpdate: expression;
forCondition: expression;

forInCollectionStatement: FOR LPAR localDec COLON expression RPAR statement;

whileStatement: WHILE LPAR expression RPAR statement;

switchStatement: SWITCH LPAR expression RPAR LCUR switchCase* defaultCase? RCUR;
switchCase: CASE expression COLON statement+ BREAK SEMI;
defaultCase: DEFAULT COLON statement+;

expressionStatement: expression SEMI;

returnStatement:
	RETURN expression? SEMI;

sout: SOUT LPAR expression RPAR SEMI;

expression: 
	generalExpression
	| assignment;

assignment: leftHandSide assign;

assign: ASSIGN rightHandSide;

rightHandSide:
	generalExpression
	| arrayRightHandSide;

generalExpression:
	primaryExpression
	| conditionalExpression;

arrayRightHandSide: LCUR generalExpression (COMMA generalExpression)* RCUR;

leftHandSide: fieldAccess | arrayAccess;

fieldAccess: IDENTIFIER (DOT IDENTIFIER)*;

arrayAccess: IDENTIFIER LBRACK (INT_LITERAL | IDENTIFIER) RBRACK;

conditionalExpression:
	orExpression (QUESTION expression COLON expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression:
	relationalExpression (
		EQUAL relationalExpression
		| NOTEQUAL relationalExpression
	)*;

relationalExpression:
	additiveExpression (
		LESS additiveExpression
		| LESSEQUAL additiveExpression
		| GREATER additiveExpression
		| GREATEREQUAL additiveExpression
	)*;

additiveExpression:
	multiplicativeExpression (
		PLUS multiplicativeExpression
		| MINUS multiplicativeExpression
	)*;

multiplicativeExpression:
	unaryExpression (
		MULTIPLY unaryExpression
		| DIVIDE unaryExpression
		| MOD unaryExpression
	)*;

unaryExpression:
	(NOT | MINUS) unaryExpression
	| primaryExpression;

literal: INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | BOOL_LITERAL | CHAR_LITERAL;

lenght: fieldAccess DOT LENGHT;

primaryExpression:
	literal
	| IDENTIFIER (DOT IDENTIFIER)*
	| THIS
	| SUPER
	| LPAR expression RPAR
	| classType LPAR argument? (COMMA argument)* RPAR
	| NOT unaryExpression
	| INCREMENT unaryExpression
	| primaryExpression INCREMENT
	| DECREMENT unaryExpression
	| primaryExpression DECREMENT
	| (type | classAccess) arraySymbol? LPAR expression? RPAR
	| fieldAccess
	| arrayAccess
	| lenght;

// Tokens
PACKAGE: 'package';
IMPORT: 'import';
CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
EXTENDS: 'extends';
SUPER: 'super';
THIS: 'this';
NEW: 'new ' -> skip;
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
STATIC: 'static';
VOID: 'void';
LENGHT: 'length';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';

SOUT: 'System.out.println';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MOD: '%';
INCREMENT: '++';
DECREMENT: '--';

OR: '||';
AND: '&&';
NOT: '!';

EQUAL: '==';
NOTEQUAL: '!=';
LESS: '<';
LESSEQUAL: '<=';
GREATER: '>';
GREATEREQUAL: '>=';

DOT: '.';
COMMA: ',';
SEMI: ';';
COLON: ':';
QUESTION: '?';

LCUR: '{';
RCUR: '}';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

BOOL: 'boolean';
BYTE: 'byte';
SHORT: 'short';
LONG: 'long';
INT: 'int';
CHAR: 'char';
FLOAT: 'float';
DOUBLE: 'double';

fragment ESC : '\\"' | '\\\\' ;

INT_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]+'.'[0-9]+('f'?);
STRING_LITERAL: '"' ( ESC | ~[\\"\r\n] )* '"';
CHAR_LITERAL: '\'' ~['] '\'';
BOOL_LITERAL: 'true' | 'false';
IDENTIFIER: [_a-zA-Z]+ [_a-zA-Z0-9]*;

WS: [ \t\r\n]+ -> skip;
COMMENTSIMPLE: '//' (~'\n')* -> skip;
COMMENTMULTI: '/*' .*? '*/' -> skip;
