grammar JCP;

start: PackageDec* ImportDec* ClassDec* EOF;

PackageDec: PACKAGE IDENTIFIER (DOT IDENTIFIER) SEMI;

ImportDec: IMPORT IDENTIFIER (DOT IDENTIFIER) SEMI;

ClassDec: Modifier CLASS IDENTIFIER Extends? Body;

Modifier: PUBLIC | PRIVATE | PROTECTED;

Extends: EXTENDS IDENTIFIER (DOT IDENTIFIER);

Body: LCUR BodyDec* RCUR;

BodyDec: MemberDec | ConstructorDec | MethodDec;

MethodDec: Modifier? Type IDENTIFIER Parameters Block;

Block: LCUR BlockDec* RCUR;

BlockDec: LocalDec | Statement;

LocalDec: Type IDENTIFIER SEMI;

MemberDec: Modifier LocalDec;

Type: PrimitiveType | ReferenceType;

PrimitiveType: NumericType | BOOL;

NumericType: IntegralType | FloatingPointType;

IntegralType: BYTE | SHORT | INT | LONG | CHAR;

FloatingPointType: FLOAT | DOUBLE;

ReferenceType: ClassType;

ClassType: IDENTIFIER;

ConstructorDec: Modifier IDENTIFIER Parameters ConstructorBody;

Parameters: LPAR Parameter? (COMMA Parameter) RPAR;

Parameter: Type IDENTIFIER;

ConstructorBody: LCUR ConstructorInvocation? Statement* RCUR;

ConstructorInvocation:
	SUPER LPAR Argument? (COMMA Argument)* RPAR;

Argument: IDENTIFIER;

Statement:
	Expression SEMI
	| IF LPAR Expression RPAR Statement (ELSE Statement)?
	| FOR LPAR ForInit? SEMI ForUpdate? RPAR Statement
	| WHILE LPAR Expression RPAR Statement
	| DO Statement WHILE LPAR Expression RPAR SEMI
	| BREAK SEMI
	| CONTINUE SEMI
	| RETURN Expression? SEMI
	| LCUR BlockDec* RCUR;

ForInit: LocalDec | Expression;
ForUpdate: Expression;

Expression: Assignment | ConditionalExpression;

Assignment: LeftHandSide ASSIGN Expression;

LeftHandSide: FieldAccess | ArrayAccess;

FieldAccess: IDENTIFIER (DOT IDENTIFIER)*;

ArrayAccess: IDENTIFIER LBRACK LITERAL RBRACK;

ConditionalExpression:
	OrExpression (QUESTION Expression COLON Expression)?;

OrExpression: AndExpression (OR AndExpression)*;

AndExpression: EqualityExpression (AND EqualityExpression)*;

EqualityExpression:
	RelationalExpression (
		EQUAL RelationalExpression
		| NOTEQUAL RelationalExpression
	)*;

RelationalExpression:
	AdditiveExpression (
		LESS AdditiveExpression
		| LESSEQUAL AdditiveExpression
		| GREATER AdditiveExpression
		| GREATEREQUAL AdditiveExpression
	)*;

AdditiveExpression:
	MultiplicativeExpression (
		PLUS MultiplicativeExpression
		| MINUS MultiplicativeExpression
	)*;

MultiplicativeExpression:
	UnaryExpression (
		MULTIPLY UnaryExpression
		| DIVIDE UnaryExpression
		| MOD UnaryExpression
	)*;

UnaireExpression:
	PrimaryExpression (
		PLUS UnaryExpression
		| MINUS UnaryExpression
	)*;

UnaryExpression:
	(PLUS UnaryExpression | MINUS UnaryExpression) UnaryExpression
	| (NOT UnaryExpression);

PrimaryExpression:
	LITERAL
	| IDENTIFIER
	| THIS
	| SUPER
	| LPAR Expression RPAR
	| NEW ClassType LPAR Argument? (COMMA Argument)* RPAR
	| NOT UnaryExpression
	| INCREMENT UnaryExpression
	| DECREMENT UnaryExpression
	| Type LPAR Expression RPAR;

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