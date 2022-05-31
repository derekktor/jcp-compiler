parser grammar attempt2;

options {   tokenVocab = attempt2Lexer; }

start: packageDec* importDec* classDec* EOF;

packageDec: PACKAGE IDENTIFIER (DOT IDENTIFIER) SEMI;

importDec: IMPORT IDENTIFIER (DOT IDENTIFIER) SEMI;

classDec: modifier CLASS IDENTIFIER extends? Body;

modifier: PUBLIC | PRIVATE | PROTECTED;

extends: EXTENDS IDENTIFIER (DOT IDENTIFIER)*;

Body: LCUR bodyDec* RCUR;

bodyDec: memberDec | constructorDec | methodDec;

methodDec: modifier? type IDENTIFIER parameters block;

block: LCUR blockDec* RCUR;

blockDec: localDec | statement;

localDec: type IDENTIFIER SEMI;

memberDec: modifier localDec;

type: primitiveType | feferenceType;

primitiveType: numericType | BOOL;

numericType: integralType | floatingPointType;

integralType: BYTE | SHORT | INT | LONG | CHAR;

floatingPointType: FLOAT | DOUBLE;

feferenceType: classType;

classType: IDENTIFIER;

constructorDec: modifier IDENTIFIER parameters constructorBody;

parameters: LPAR parameter? (COMMA parameter) RPAR;

parameter: type IDENTIFIER;

constructorBody: LCUR constructorInvocation? statement* RCUR;

constructorInvocation:
	SUPER LPAR argument? (COMMA argument)* RPAR;

argument: IDENTIFIER;

statement:
	expression SEMI |
	IF LPAR expression RPAR statement (ELSE statement)? |
	FOR LPAR forInit? SEMI forUpdate? RPAR statement |
	WHILE LPAR expression RPAR statement |
	DO statement WHILE LPAR expression RPAR SEMI |
	BREAK SEMI |
	CONTINUE SEMI |
	RETURN expression? SEMI |
	LCUR blockDec* RCUR;

forInit: localDec | expression;
forUpdate: expression;

expression:
	assignment |
	conditionalExpression;

assignment:
	leftHandSide ASSIGN expression;

leftHandSide:
	fieldAccess |
	arrayAccess;

fieldAccess:
	IDENTIFIER (DOT IDENTIFIER)*;

arrayAccess:
	IDENTIFIER LBRACK LITERAL RBRACK;

conditionalExpression:
	orExpression
	(QUESTION expression COLON expression)?;

orExpression:
	andExpression
	(OR andExpression)*;

andExpression:
	equalityExpression
	(AND equalityExpression)*;

equalityExpression:
	relationalExpression
	(EQUAL relationalExpression | NOTEQUAL relationalExpression)*;

relationalExpression:
	additiveExpression
	(LESS additiveExpression | LESSEQUAL additiveExpression | GREATER additiveExpression | GREATEREQUAL additiveExpression)*;

additiveExpression:
	multiplicativeExpression
	(PLUS multiplicativeExpression | MINUS multiplicativeExpression)*;

multiplicativeExpression:
	unaryExpression
	(MULTIPLY unaryExpression | DIVIDE unaryExpression | MOD unaryExpression)*;

unaireExpression:
	primaryExpression
	(PLUS unaryExpression | MINUS unaryExpression)*;

unaryExpression:
	(PLUS unaryExpression | MINUS unaryExpression) unaryExpression |
	(NOT unaryExpression );

primaryExpression:
	LITERAL |
	IDENTIFIER |
	THIS |
	SUPER |
	LPAR expression RPAR |
	NEW classType LPAR argument? (COMMA argument)* RPAR |
	NOT unaryExpression |
	INCREMENT unaryExpression |
	DECREMENT unaryExpression |
	type LPAR expression RPAR;


lexer grammar attempt2Lexer;
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
NEW: 'new';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';

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

WS : [ \t\r\n]+ -> skip;
LITERAL: [0-9]+;
IDENTIFIER: [_a-zA-Z]+ [_a-zA-Z0-9]*;