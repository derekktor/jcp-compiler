grammar jcp;

start: packageDec* importDec* classDec* EOF;

packageDec: PACKAGE IDENTIFIER (DOT IDENTIFIER)* SEMI;

importDec: IMPORT IDENTIFIER (DOT IDENTIFIER)* SEMI;

classDec: modifier CLASS IDENTIFIER extendsDec? body;

modifier: PUBLIC | PRIVATE | PROTECTED;

extendsDec: EXTENDS IDENTIFIER (DOT IDENTIFIER)*;

body: LCUR bodyDec* RCUR;

bodyDec: memberDec | constructorDec | methodDec;

methodDec: modifier? STATIC? type IDENTIFIER parameters block;

block: LCUR blockDec* RCUR;

blockDec: localDec | statement;

localDec: type IDENTIFIER assign SEMI;

memberDec: modifier localDec;

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

parameter: type LBRACK? RBRACK? IDENTIFIER;

constructorBody: LCUR constructorInvocation? statement* RCUR;

constructorInvocation:
	SUPER LPAR argument? (COMMA argument)* RPAR;

argument: IDENTIFIER;

statement:
	sout SEMI
	| expression SEMI
	| IF LPAR expression RPAR statement (ELSE statement)?
	| FOR LPAR forInit? SEMI forUpdate? RPAR statement
	| WHILE LPAR expression RPAR statement
	| DO statement WHILE LPAR expression RPAR SEMI
	| BREAK SEMI
	| CONTINUE SEMI
	| returnStatement
	| LCUR blockDec* RCUR;

returnStatement:
	RETURN expression? SEMI;

sout: SOUT LPAR expression RPAR;

forInit: localDec | expression;

forUpdate: expression;

expression: 
	assignment 
	| conditionalExpression 
	| primaryExpression;

assignment: leftHandSide assign;

assign: ASSIGN rightHandSide;

rightHandSide:
	conditionalExpression 
	| primaryExpression;

leftHandSide: fieldAccess | arrayAccess;

fieldAccess: IDENTIFIER (DOT IDENTIFIER)*;

arrayAccess: IDENTIFIER LBRACK INT_LITERAL RBRACK;

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
	(PLUS unaryExpression | MINUS unaryExpression) unaryExpression
	| (NOT unaryExpression);

literal: INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | BOOL_LITERAL | CHAR_LITERAL;

primaryExpression:
	literal
	| IDENTIFIER
	| THIS
	| SUPER
	| LPAR expression RPAR
	| NEW classType LPAR argument? (COMMA argument)* RPAR
	| NOT unaryExpression
	| INCREMENT unaryExpression
	| DECREMENT unaryExpression
	| (type | classAccess) LPAR expression? RPAR;

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
NEW: 'new ';
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
TRUE: 'true';
FALSE: 'false';

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
QUOTE: '"';
SQUOTE: '\'';

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

WS: [ \t\r\n]+ -> skip;
INT_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]+'.'[0-9]+;
STRING_LITERAL: '"' ( ESC | ~[\\"\r\n] )* '"';
CHAR_LITERAL: SQUOTE [^SQUOTE] SQUOTE;
BOOL_LITERAL: TRUE | FALSE;
IDENTIFIER: [_a-zA-Z]+ [_a-zA-Z0-9]*;
