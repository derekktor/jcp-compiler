lexer grammar jcp2;

CompilationUnit:
	PackageDeclaration? ImportDeclaration* ClassDeclaration* EOF;

PackageDeclaration: 'package' IDENTIFIER (DOT IDENTIFIER)* SEMI;
// package pl.edu.(identifier)*.game;

ImportDeclaration: 'import' IDENTIFIER (DOT IDENTIFIER)* SEMI;
// import java.utils.(identifier)*; 

ClassDeclaration: Modifier? CLASS IDENTIFIER Body;
// public class ApplicationName {...}

Modifier: PUBLIC | PRIVATE | PROTECTED;

Body: LBRACE BodyDeclaration* RBRACE;
// {...}

BodyDeclaration: ConstructorDeclaration | MemberDeclaration;

ConstructorDeclaration: Modifier IDENTIFIER Parameters Body;
// public Student(String name, int age) {...}

Parameters: LPAREN Parameter (COMMA Parameter)* RPAREN;
// (Card[] cards, int size)

Parameter: Type IDENTIFIER;
// Card[] cards

Type: PrimitiveType | ReferenceType;

PrimitiveType: NumericType | BOOLEAN;

NumericType: IntegralType | FloatingPointType;

IntegralType: BYTE | SHORT | LONG | INT | CHAR;

FloatingPointType: FLOAT | DOUBLE;

ReferenceType: ClassType | ArrayType;

ClassType: IDENTIFIER;

ArrayType: (PrimitiveType | ClassType) Dims;
// int[]; Card[]

Dims: LBRACK RBRACK (LBRACK RBRACK)*;
// [][][]

MemberDeclaration: FieldDeclaration | MethodDeclaration;

FieldDeclaration: Modifier? Type VariableDeclarators SEMI;
// private int grade = 10;

VariableDeclarators:
	VariableDeclarator (COMMA VariableDeclarator)*;
// firstName, lastName, ...

VariableDeclarator:
	VariableDeclaratorId ('=' VariableInitializer)?;
// firstName = "John"

VariableDeclaratorId: IDENTIFIER Dims?;

VariableInitializer: Expression;
// "John"

Expression: ConditionalExpression | Assignment;

ConditionalExpression: OrExpression;

OrExpression: AndExpression | OrExpression '||' AndExpression;

AndExpression:
	EqualityExpression
	| AndExpression '&&' EqualityExpression;

EqualityExpression:
	RelationalExpression
	| EqualityExpression '==' RelationalExpression
	| EqualityExpression '!=' RelationalExpression;

RelationalExpression:
	ShiftExpression
	| RelationalExpression '<' ShiftExpression
	| RelationalExpression '>' ShiftExpression
	| RelationalExpression '<=' ShiftExpression
	| RelationalExpression '>=' ShiftExpression;

ShiftExpression:
	AdditiveExpression
	| ShiftExpression '<<' AdditiveExpression
	| ShiftExpression '>>' AdditiveExpression;

AdditiveExpression:
	MultiplicativeExpression
	| AdditiveExpression '+' MultiplicativeExpression
	| AdditiveExpression '-' MultiplicativeExpression;

MultiplicativeExpression:
	UnaryExpression
	| MultiplicativeExpression '*' UnaryExpression
	| MultiplicativeExpression '/' UnaryExpression
	| MultiplicativeExpression '%' UnaryExpression;

UnaryExpression:
	PreincrementExpression
	| PredecrementExpression
	| '+' UnaryExpression
	| '-' UnaryExpression
	| UnaryExpressionNotPlusMinus;

PreincrementExpression: '++' UnaryExpression;

PredecrementExpression: '--' UnaryExpression;

UnaryExpressionNotPlusMinus:
	PostfixExpression
	| '~' UnaryExpression
	| '!' UnaryExpression
	| CastExpression;

PostfixExpression: (Primary | ExpressionName) ('++' | '--')*;

Primary: (PrimaryNoNewArray_lfno | ArrayCreationExpression) (
		PrimaryNoNewArray_lf
	)*;

PrimaryNoNewArray_lfno: Literal | THIS;

MethodDeclaration: Modifier MethodHeader Block;
// public void getStatus(String studentID) {...}

MethodHeader: (VOID | Type) MethodDeclarator;
// void getStatus(String studentID)

MethodDeclarator: IDENTIFIER Parameters;
// getStatus (String studentID)

//// Tokens

ABSTRACT: 'abstract'; // Keywords
ASSERT: 'assert';
BOOLEAN: 'boolean';
BREAK: 'break';
BYTE: 'byte';
CASE: 'case';
CATCH: 'catch';
CHAR: 'char';
CLASS: 'class';
CONST: 'const';
CONTINUE: 'continue';
DEFAULT: 'default';
DO: 'do';
DOUBLE: 'double';
ELSE: 'else';
ENUM: 'enum';
EXPORTS: 'exports';
EXTENDS: 'extends';
FINAL: 'final';
FINALLY: 'finally';
FLOAT: 'float';
FOR: 'for';
IF: 'if';
GOTO: 'goto';
IMPLEMENTS: 'implements';
INSTANCEOF: 'instanceof';
INT: 'int';
INTERFACE: 'interface';
LONG: 'long';
MODULE: 'module';
NATIVE: 'native';
NEW: 'new';
OPEN: 'open';
OPERNS: 'opens';
PRIVATE: 'private';
PROTECTED: 'protected';
PROVIDES: 'provides';
PUBLIC: 'public';
REQUIRES: 'requires';
RETURN: 'return';
SHORT: 'short';
STATIC: 'static';
STRICTFP: 'strictfp';
SUPER: 'super';
SWITCH: 'switch';
SYNCHRONIZED: 'synchronized';
THIS: 'this';
THROW: 'throw';
THROWS: 'throws';
TO: 'to';
TRANSIENT: 'transient';
TRANSITIVE: 'transitive';
TRY: 'try';
USES: 'uses';
VOID: 'void';
VOLATILE: 'volatile';
WHILE: 'while';
WITH: 'with';
UNDER_SCORE: '_';

// Separators
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
SEMI: ';';
COMMA: ',';
DOT: '.';
ELLIPSIS: '...';
AT: '@';
COLONCOLON: '::';

IDENTIFIER: '_'* [a-zA-Z]+ [a-zA-Z0-9]*;

// Whitespace
WS: [ \t\n\r]+ -> skip;