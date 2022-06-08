grammar jcp;

start: packageDec* importDec* classDec* EOF;

packageDec: PACKAGE packageName (DOT IDENTIFIER)* SEMI;

packageName: IDENTIFIER;

importDec: IMPORT importName (DOT IDENTIFIER)* SEMI;

importName: IDENTIFIER;

classDec: modifier CLASS className extendsDec? body;

className: IDENTIFIER;

modifier: PUBLIC | PRIVATE | PROTECTED;

extendsDec: EXTENDS parentClassName (DOT IDENTIFIER)*;

parentClassName: IDENTIFIER;

body: LCUR bodyDec* RCUR;

bodyDec: memberDec | constructorDec | methodDec;

methodDec: modifier? STATIC? type methodName parameters block;

methodName: IDENTIFIER;

block: LCUR blockDec* RCUR;

blockDec: localDec | statement;

localDec: type IDENTIFIER assign? SEMI;

memberDec: modifier localDec;

type: primitiveType | referenceType;

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
	simpleStatement
	| ifStatement
	| forStatement
	| whileStatement
	| doStatement
	| breakStatement
	| continueStatement
	| returnStatement;

simpleStatement: expression SEMI;

ifStatement: IF condition statement elseStatement?;

condition: LPAR expression RPAR;

elseStatement: ELSE block;

forStatement: FOR forControl statement;

forControl:
	LPAR forInit? SEMI forCondition? SEMI forUpdate? RPAR;

forInit: localDec | expression;

forCondition: expression;

forUpdate: expression;

whileStatement: WHILE condition statement;

doStatement: DO statement WHILE condition;

breakStatement: BREAK SEMI;

continueStatement: CONTINUE SEMI;

returnStatement: RETURN expression? SEMI;

sout: SOUT LPAR expression RPAR SEMI;

expression:
	assignment
	| conditionalExpression
	| primaryExpression;

assignment: leftHandSide assign;

assign: ASSIGN rightHandSide;

rightHandSide: conditionalExpression | primaryExpression;

leftHandSide: fieldAccess | arrayAccess;

fieldAccess: IDENTIFIER (DOT IDENTIFIER)*;

arrayAccess: IDENTIFIER LBRACK LITERAL RBRACK;

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

primaryExpression:
	LITERAL
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

WS: [ \t\r\n]+ -> skip;
LITERAL: [0-9]+;
IDENTIFIER: [_a-zA-Z]+ [_a-zA-Z0-9]*;
