lexer grammar jcp;

// Breadth-First unfolding

// Starting symbol:
CompilationUnit:
	PackageDeclaration? ImportDeclaration* TypeDeclaration*;

// Declarations;
PackageDeclaration: 'package' PackageName SEMI;
// package pl.agh.tkik.compiler;

ImportDeclaration:
	SingleTypeImportDeclaration
	| TypeImportOnDemandDeclaration;

SingleTypeImportDeclaration: 'import' TypeName SEMI;
// import java.util.ArrayList

TypeImportOnDemandDeclaration:
	'import' PackageName '.' '*' SEMI;
// import java.util.*

TypeDeclaration: ClassDeclaration | InterfaceDeclaration | SEMI;

ClassDeclaration:
	ClassModifier* 'class' Identifier Super? Interfaces? ClassBody;
// public class ExampleClass extends Parent.OtherClass implements RunnableClass {}

ClassModifier: 'public' | 'abstract' | 'final';

Super: 'extends' ClassType;
// extends Parent.OtherClass

Interfaces: 'implements' InterfaceTypeList;
// implements RunnableClass

InterfaceTypeList: InterfaceType (',' InterfaceType)*;
// implements RunnableClass

ClassBody: '{' ClassBodyDeclaration* '}';

ClassBodyDeclaration:
	ClassMemberDeclaration
	| StaticInitializer
	| ConstructorDeclaration;

ClassMemberDeclaration: FieldDeclaration | MethodDeclaration;

StaticInitializer: 'static' Block;

ConstructorDeclaration:
	ConstructorModifier? ConstructorDeclarator Throws? ConstructorBody;

ConstructorModifier: 'public' | 'protected' | 'private';

ConstructorDeclarator:
	SimpleTypeName '(' FormalParameterList? ')';

FormalParameterList:
	FormalParameters ',' LastFormalParameter
	| LastFormalParameter;

FormalParameters: FormalParameter (',' FormalParameter)*;

FormalParameter: Type VariableDeclaratorId;

LastFormalParameter: Type '...' VariableDeclaratorId;

Throws: 'throws' ClassTypeList;

ClassTypeList: ClassType (',' ClassType)*;

ConstructorBody:
	'{' ExplicitConstructorInvocation? BlockStatement* '}';

ExplicitConstructorInvocation:
	'this' '(' ArgumentList? ')'
	| 'super' '(' ArgumentList? ')';

FieldDeclaration: FieldModifier? Type VariableDeclarators SEMI;

FieldModifier: 'public' | 'protected' | 'private';

VariableDeclarators:
	VariableDeclarator (',' VariableDeclarator)*;

VariableDeclarator:
	VariableDeclaratorId ('=' VariableInitializer)?;

VariableDeclaratorId: Identifier Dims?;

VariableInitializer: Expression | ArrayInitializer;

MethodDeclaration: MethodHeader MethodBody;

MethodHeader:
	MethodModifier? ResultType MethodDeclarator Throws?;

ResultType: Type | 'void';

MethodModifier: 'public' | 'protected' | 'private';

MethodDeclarator: Identifier '(' FormalParameterList? ')';

MethodBody: Block | SEMI;

InterfaceDeclaration:
	InterfaceModifier* 'interface' Identifier ExtendsInterfaces? InterfaceBody;

InterfaceModifier: 'public' | 'abstract';

ExtendsInterfaces:
	'extends' InterfaceType
	| ExtendsInterfaces ',' InterfaceType;

InterfaceBody: '{' InterfaceMemberDeclaration* '}';

InterfaceMemberDeclaration:
	ConstantDeclaration
	| AbstractMethodDeclaration;

ConstantDeclaration: ConstantModifiers Type VariableDeclarator;

ConstantModifiers: 'public' | 'static' | 'final';

AbstractMethodDeclaration:
	AbstractMethodModifier* ResultType MethodDeclarator Throws? SEMI;

AbstractMethodModifier: 'public' | 'abstract';

ArrayInitializer: '{' VariableInitializers? ','? '}';

VariableInitializers:
	VariableInitializer
	| VariableInitializers ',' VariableInitializer;

//// Literals
Literal:
	IntegerLiteral
	| FloatingPointLiteral
	| BooleanLiteral
	| CharacterLiteral
	| StringLiteral
	| NullLiteral;

IntegerLiteral: DecimalNumeral IntegerTypeSuffix?;

IntegerTypeSuffix: 'l' | 'L';

DecimalNumeral: '0' | NonZeroDigit Digits?;

Digits: Digit+;

Digit: '0' | NonZeroDigit;

NonZeroDigit: [1-9];

FloatingPointLiteral:
	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	| Digits ExponentPart? FloatTypeSuffix?;

ExponentPart: ExponentIndicator SignedInteger;

ExponentIndicator: [eE];

SignedInteger: Sign? Digits;

Sign: [-+];

FloatTypeSuffix: [fFdD];

BooleanLiteral: 'true' | 'false';

CharacterLiteral: '\'' SingleCharacter '\'';

SingleCharacter: ~['\n\r\\];

StringLiteral: '"' SingleCharacter+ '"';

NullLiteral: 'null';

Identifier: [_a-zA-Z0-9]+;

//// Types
Type: PrimitiveType | ReferenceType;

// Primitive Types
PrimitiveType: NumericType | 'boolean';

NumericType: IntegralType | FloatingPointType;

IntegralType: 'byte' | 'short' | 'int' | 'long' | 'char';

FloatingPointType: 'float' | 'double';

// Reference Types
ReferenceType: ClassOrInterfaceType | ArrayType;

// ClassOrInterfaceType: ClassType | InterfaceType;
ClassOrInterfaceType: ClassType ('.' ClassType)*;

ClassType: TypeName;

InterfaceType: TypeName;

ArrayType: (PrimitiveType | ClassOrInterfaceType) Dims;

Dims: ('[' ']')+;

// Method
MethodInvocation:
	MethodName '(' ArgumentList? ')'
	| Primary '.' Identifier '(' ArgumentList? ')'
	| 'super' '.' Identifier '(' ArgumentList? ')';

FieldAccess: (Primary | 'super') '.' Identifier;

Primary: PrimaryNoNewArray | ArrayCreationExpression;

PrimaryNoNewArray:
	Literal
	| 'this'
	| '(' Expression ')'
	| ClassInstanceCreationExpression;
// | FieldAccess | MethodInvocation | ArrayAccess

ClassInstanceCreationExpression:
	'new' ClassType '(' ArgumentList? ')';

ArgumentList: Expression (',' Expression)*;

ArrayCreationExpression:
	'new' PrimitiveType DimExprs Dims?
	| 'new' ClassOrInterfaceType DimExprs Dims?;

DimExprs: DimExpr | DimExprs DimExpr;

DimExpr: '[' Expression ']';

// ArrayAccess: ExpressionName '[' Expression ']' | PrimaryNoNewArray '[' Expression ']';

ArrayAccess: (ExpressionName | PrimaryNoNewArray) (
		'[' Expression ']'
	)*;

// Blocks
Block: '{' BlockStatements? '}';

BlockStatements: BlockStatement+;

BlockStatement: LocalVariableDeclarationStatement | Statement;

LocalVariableDeclarationStatement:
	LocalVariableDeclaration SEMI;

LocalVariableDeclaration: Type VariableDeclarators;

// Statements
Statement:
	StatementWithoutTrailingSubstatement
	| LabeledStatement
	| IfThenStatement
	| IfThenElseStatement
	| WhileStatement
	| ForStatement;

StatementNoShortIf:
	StatementWithoutTrailingSubstatement
	| LabeledStatementNoShortIf
	| IfThenElseStatementNoShortIf
	| WhileStatementNoShortIf
	| ForStatementNoShortIf;

StatementWithoutTrailingSubstatement:
	Block
	| EmptyStatement
	| ExpressionStatement
	| SwitchStatement
	| DoStatement
	| BreakStatement
	| ContinueStatement
	| ReturnStatement
	// | SynchronizedStatement
	| ThrowsStatement
	| TryStatement;

EmptyStatement: SEMI;

LabeledStatement: Identifier ':' Statement;

LabeledStatementNoShortIf: Identifier ':' StatementNoShortIf;

ExpressionStatement: StatementExpression SEMI;

StatementExpression:
	Assignment
	| PreincrementExpression
	| PostincrementExpression
	| PredecrementExpression
	| PostdecrementExpression
	| MethodInvocation
	| ClassInstanceCreationExpression;

// If-Else Statements
IfThenStatement: 'if' '(' Expression ')' Statement;

IfThenElseStatement:
	'if' '(' Expression ')' StatementNoShortIf 'else' Statement;

IfThenElseStatementNoShortIf:
	'if' '(' Expression ')' StatementNoShortIf 'else' StatementNoShortIf;

// Switch Statements
SwitchStatement: 'switch' '(' Expression ')' SwitchBlock;

SwitchBlock: '{' SwitchBlockStatementGroup* SwitchLabel* '}';

SwitchBlockStatementGroup: SwitchLabels BlockStatements;

SwitchLabels: SwitchLabel+;

SwitchLabel: 'case' Expression ':' | 'default' ':';

// While Statements
WhileStatement: 'while' '(' Expression ')' Statement;

WhileStatementNoShortIf:
	'while' '(' Expression ')' StatementNoShortIf;

DoStatement: 'do' Statement 'while' '(' Expression ')' SEMI;

// For Statements
ForStatement: BasicForStatement | ForEachStatement;

ForStatementNoShortIf:
	BasicForStatementNoShortIf
	| ForEachStatementNoShortIf;

BasicForStatement:
	'for' '(' ForInit? SEMI Expression? SEMI ForUpdate? ')' Statement;

BasicForStatementNoShortIf:
	'for' '(' ForInit? SEMI Expression? SEMI ForUpdate? ')' StatementNoShortIf;

ForInit: StatementExpressionList | LocalVariableDeclaration;

ForUpdate: StatementExpressionList;

StatementExpressionList:
	StatementExpression (',' StatementExpression)*;

ForEachStatement:
	'for' '(' FieldModifier* Type VariableDeclaratorId ':' Expression ')' Statement;

ForEachStatementNoShortIf:
	'for' '(' FieldModifier* Type VariableDeclaratorId ':' Expression ')' StatementNoShortIf;

BreakStatement: 'break' Identifier? SEMI;

ContinueStatement: 'continue' Identifier? SEMI;

ReturnStatement: 'return' Expression? SEMI;

ThrowsStatement: 'throw' Expression SEMI;

// SynchronizedStatement: 'synchronized' '(' Expression ')' Block;

TryStatement:
	'try' Block Catches
	| 'try' Block Catches? Finally;

Catches: CatchClause | Catches CatchClause;

CatchClause: 'catch' '(' FormalParameter ')' Block;

Finally: 'finally' Block;

// Expressions
Expression: AssignmentExpression;

AssignmentExpression: ConditionalExpression | Assignment;

Assignment: LeftHandSide AssignmentOperator Expression;

LeftHandSide: ExpressionName | FieldAccess | ArrayAccess;

AssignmentOperator:
	'='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '>>>='
	| '&='
	| '^='
	| '|=';

ConditionalExpression:
	ConditionalOrExpression
	| ConditionalOrExpression? Expression ':' ConditionalExpression;

ConditionalOrExpression:
	ConditionalAndExpression
	| ConditionalOrExpression '||' ConditionalAndExpression;

ConditionalAndExpression:
	InclusiveOrExpression
	| ConditionalAndExpression '&&' InclusiveOrExpression;

InclusiveOrExpression:
	ExclusiveOrExpression
	| InclusiveOrExpression '|' ExclusiveOrExpression;

ExclusiveOrExpression:
	AndExpression
	| ExclusiveOrExpression '^' AndExpression;

AndExpression:
	EqualityExpression
	| AndExpression '&' EqualityExpression;

EqualityExpression:
	RelationalExpression
	| EqualityExpression '==' RelationalExpression
	| EqualityExpression '!=' RelationalExpression;

RelationalExpression:
	ShiftExpression
	| RelationalExpression '<' ShiftExpression
	| RelationalExpression '>' ShiftExpression
	| RelationalExpression '<=' ShiftExpression
	| RelationalExpression '>=' ShiftExpression
	| RelationalExpression 'instanceof' ReferenceType;

ShiftExpression:
	AdditiveExpression
	| ShiftExpression '<<' AdditiveExpression
	| ShiftExpression '>>' AdditiveExpression
	| ShiftExpression '>>>' AdditiveExpression;

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

CastExpression:
	'(' PrimitiveType ')' UnaryExpression
	| '(' ReferenceType ')' UnaryExpressionNotPlusMinus;

PredecrementExpression: '--' UnaryExpression;

PreincrementExpression: '++' UnaryExpression;

UnaryExpressionNotPlusMinus:
	PostfixExpression
	| '~' UnaryExpression
	| '!' UnaryExpression
	| CastExpression;

PostdecrementExpression: PostfixExpression '--';

PostincrementExpression: PostfixExpression '++';

// PostfixExpression: Primary | ExpressionName | PostincrementExpression | PostdecrementExpression;

PostfixExpression: (Primary | ExpressionName) ('++' | '--')*;

// Names PackageName: Identifier | PackageName '.' Identifier;
PackageName: Identifier ('.' Identifier)*;

TypeName: Identifier | PackageName '.' Identifier;

SimpleTypeName: Identifier;

ExpressionName: Identifier | AmbiguousName '.' Identifier;

MethodName: Identifier | AmbiguousName '.' Identifier;

AmbiguousName: Identifier ('.' Identifier)*;

//// Tokens

// Keywords
ABSTRACT: 'abstract';
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
IMPORT: 'import';
INSTANCEOF: 'instanceof';
INT: 'int';
INTERFACE: 'interface';
LONG: 'long';
MODULE: 'module';
NATIVE: 'native';
NEW: 'new';
OPEN: 'open';
OPERNS: 'opens';
PACKAGE: 'package';
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

// Whitespace
WS: [ \t\n\r]+ -> skip;