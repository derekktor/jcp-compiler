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

Assignment: LeftHandSide AssignmentOperator Expression;

LeftHandSide: ExpressionName | FieldAccess | ArrayAccess;

ArrayAccess: (IDENTIFIER | PrimaryNoNewArray_lfno) (
		'[' Expression ']'
	)*;

FieldAccess: (Primary | 'super') DOT IDENTIFIER;

ExpressionName: IDENTIFIER | AmbiguousName DOT IDENTIFIER;

AmbiguousName: IDENTIFIER (DOT IDENTIFIER)*;

// Expressions
ConditionalExpression: 'test';
// 	ConditionalOrExpression ('?' Expression ':' ConditionalExpression)?;
// ConditionalOrExpression:
// 	ConditionalAndExpression (OR ConditionalOrExpression)?;
// ConditionalAndExpression:
// 	InclusiveOrExpression (AND ConditionalAndExpression)?;


// AndExpression:
// 	EqualityExpression
// 	| AndExpression '&' EqualityExpression;
// EqualityExpression:
// 	RelationalExpression
// 	| EqualityExpression '==' RelationalExpression
// 	| EqualityExpression '!=' RelationalExpression;
// RelationalExpression:
// 	RelationalExpression '<' AdditiveExpression
// 	| RelationalExpression '>' AdditiveExpression
// 	| RelationalExpression '<=' AdditiveExpression
// 	| RelationalExpression '>=' AdditiveExpression
// 	| RelationalExpression 'instanceof' ReferenceType;
// AdditiveExpression:
// 	MultiplicativeExpression
// 	| AdditiveExpression '+' MultiplicativeExpression
// 	| AdditiveExpression '-' MultiplicativeExpression;

// MultiplicativeExpression:
// 	UnaryExpression
// 	| MultiplicativeExpression '*' UnaryExpression
// 	| MultiplicativeExpression '/' UnaryExpression
// 	| MultiplicativeExpression '%' UnaryExpression;




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

CastExpression:
	'(' PrimitiveType ')' UnaryExpression
	| '(' ReferenceType ')' UnaryExpressionNotPlusMinus;

PostfixExpression: (Primary | ExpressionName) ('++' | '--')*;

Primary: (PrimaryNoNewArray_lfno | ArrayCreationExpression) (
		PrimaryNoNewArray_lfno
	)*;

ArrayCreationExpression:
	'new' PrimitiveType DimExprs Dims?
	| 'new' ClassOrInterfaceType DimExprs Dims?;

DimExprs: DimExpr (COMMA DimExpr)*;
DimExpr: '[' Expression ']';

ClassOrInterfaceType: ClassType (DOT ClassType)*;


PrimaryNoNewArray_lfno: Literal | THIS;

MethodDeclaration: Modifier MethodHeader Block;
// public void getStatus(String studentID) {...}

Block: '{' BlockStatements '}';
BlockStatements: BlockStatement*;
BlockStatement: LocalVariableDeclarationStatement | Statement;
LocalVariableDeclarationStatement: LocalVariableDeclaration ';';
LocalVariableDeclaration: Type VariableDeclarators;
Statement: Block | EmptyStatement | ExpressionStatement | IfStatement |
		WhileStatement | ForStatement | ForEachStatement |
		DoStatement | SwitchStatement | BreakStatement |
		ContinueStatement | ReturnStatement | SynchronizedStatement |
		ThrowStatement | TryStatement | AssertStatement;
EmptyStatement: SEMI;
ExpressionStatement: Expression? SEMI;
IfStatement: 'if' '(' Expression ')' Statement ('else' Statement)?;
WhileStatement: 'while' '(' Expression ')' Statement;
ForStatement: 'for' '(' ForInit? ';' Expression? ';' ForUpdate? ')' Statement;
ForInit: LocalVariableDeclaration | ExpressionStatement;
ForUpdate: ExpressionStatement;
ForEachStatement: 'for' '(' ForInit? ';' Expression ')' Statement;
DoStatement: 'do' Statement 'while' '(' Expression ')' SEMI;
SwitchStatement: 'switch' '(' Expression ')' SwitchBlock;
SwitchBlock: '{' SwitchBlockStatementGroup* '}';
SwitchBlockStatementGroup: SwitchLabel BlockStatements;
SwitchLabel: 'case' Expression ':' | 'default' ':';
BreakStatement: 'break' IDENTIFIER? SEMI;
ContinueStatement: 'continue' IDENTIFIER? SEMI;
ReturnStatement: 'return' Expression? SEMI;
SynchronizedStatement: 'synchronized' '(' Expression ')' Block;
ThrowStatement: 'throw' Expression SEMI;
TryStatement: 'try' Block Catches? Finally?;
Catches: CatchClause (CatchClause)*;
CatchClause: 'catch' '(' FormalParameter ')' Block;
Finally: 'finally' Block;
AssertStatement: 'assert' Expression (':' Expression)? SEMI;
FormalParameter: Modifier? Type IDENTIFIER;

MethodHeader: (VOID | Type) MethodDeclarator;
// void getStatus(String studentID)

MethodDeclarator: IDENTIFIER Parameters;
// getStatus (String studentID)

Literal:
	IntegerLiteral
	| FloatingPointLiteral
	| BooleanLiteral
	| CharacterLiteral
	| StringLiteral
	| NullLiteral;

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

AssignmentOperator:
	'='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-=';

// Literals
IntegerLiteral: [0-9]+;
FloatingPointLiteral: [0-9]+ '.' [0-9]+;
BooleanLiteral: TRUE | FALSE;
CharacterLiteral: '\\'' [^\n\r\'] ''\\';
StringLiteral: '"' [^\n\r"]* '"';
NullLiteral: NULL;

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

OR: '||';
AND: '&&';