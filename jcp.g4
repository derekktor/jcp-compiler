lexer grammar jcp;

// Starting symbol:
CompilationUnit: PackageDeclaration? ImportDeclarations? TypeDeclarations?;

// Declarations;
PackageDeclaration: 'package' PackageName ';';

ImportDeclarations:
	ImportDeclaration
	| ImportDeclarations ImportDeclaration;

ImportDeclaration:
	SingleTypeImportDeclaration
	| TypeImportOnDemandDeclaration;

SingleTypeImportDeclaration: 'import' TypeName ';';

TypeImportOnDemandDeclaration: 'import' PackageName .* ';';

TypeDeclarations:
	TypeDeclaration
	| TypeDeclarations TypeDeclaration;

TypeDeclaration: ClassDeclaration | InterfaceDeclaration | ';';

ClassDeclaration:
	ClassModifiers? 'class' Identifier Super? Interfaces? ClassBody;

ClassModifiers: ClassModifier | ClassModifiers ClassModifier;

ClassModifier: 'public' | 'abstract' | 'final';

Super: 'extends' ClassType;

Interfaces: 'implements' InterfaceTypeList;

InterfaceTypeList:
	InterfaceType
	| InterfaceTypeList ',' InterfaceType;

ClassBody: '{' ClassBodyDeclarations? '}';

ClassBodyDeclarations:
	ClassBodyDeclaration
	| ClassBodyDeclarations ClassBodyDeclaration;

ClassBodyDeclaration:
	ClassMemberDeclaration
	| StaticInitializer
	| ConstructorDeclaration;

ClassMemberDeclaration: FieldDeclaration | MethodDeclaration;

StaticInitializer: 'static' Block;

ConstructorDeclaration:
	ConstructorModifiers? ConstructorDeclarator Throws? ConstructorBody;

ConstructorModifiers:
	ConstructorModifier
	| ConstructorModifiers ConstructorModifier;

ConstructorModifier: 'public' | 'protected' | 'private';

ConstructorDeclarator:
	SimpleTypeName '(' FormalParameterList? ')';

FormalParameterList:
	FormalParameter
	| FormalParameterList ',' FormalParameter;

FormalParameter: Type VariableDeclaratorId;

Throws: 'throws' ClassTypeList;

ClassTypeList: ClassType | ClassTypeList ',' ClassType;

ConstructorBody:
	'{' ExplicitConstructorInvocation? BlockStatements? '}';

ExplicitConstructorInvocation:
	'this' '(' ArgumentList? ')'
	| 'super' '(' ArgumentList? ')';

FieldDeclaration: FieldModifiers? Type VariableDeclarators ';';

FieldModifiers: FieldModifier | FieldModifiers FieldModifier;

FieldModifier:
	'public'
	| 'protected'
	| 'private'
	| 'static'
	| 'final'
	| 'transient'
	| 'volatile';

VariableDeclarators:
	VariableDeclarator
	| VariableDeclarators ',' VariableDeclarator;

VariableDeclarator:
	VariableDeclaratorId
	| VariableDeclaratorId '=' VariableInitializer;

VariableDeclaratorId: Identifier | VariableDeclaratorId '[' ']';

VariableInitializer: Expression | ArrayInitializer;

MethodDeclaration: MethodHeader MethodBody;

MethodHeader:
	MethodModifiers? ResultType MethodDeclarator Throws?;

ResultType: Type | 'void';

MethodModifiers:
	MethodModifier
	| MethodModifiers MethodModifier;

MethodModifier:
	'public'
	| 'protected'
	| 'private'
	| 'static'
	| 'abstract'
	| 'final'
	| 'synchronized'
	| 'native';

MethodDeclarator: Identifier '(' FormalParameterList? ')';

MethodBody: Block | ';';

InterfaceDeclaration:
	InterfaceModifiers? 'interface' Identifier ExtendsInterfaces? InterfaceBody;

InterfaceModifiers:
	InterfaceModifier
	| InterfaceModifiers InterfaceModifier;

InterfaceModifier: 'public' | 'abstract';

ExtendsInterfaces:
	'extends' InterfaceType
	| ExtendsInterfaces ',' InterfaceType;

InterfaceBody: '{' InterfaceMemberDeclarations? '}';

InterfaceMemberDeclarations:
	InterfaceMemberDeclaration
	| InterfaceMemberDeclarations InterfaceMemberDeclaration;

InterfaceMemberDeclaration:
	ConstantDeclaration
	| AbstractMethodDeclaration;

ConstantDeclaration: ConstantModifiers Type VariableDeclarator;

ConstantModifiers: 'public' | 'static' | 'final';

AbstractMethodDeclaration:
	AbstractMethodModifiers? ResultType MethodDeclarator Throws? ';';

AbstractMethodModifiers:
	AbstractMethodModifier
	| AbstractMethodModifiers AbstractMethodModifier;

AbstractMethodModifier: 'public' | 'abstract';

ArrayInitializer: '{' VariableInitializers? ','? '}';

VariableInitializers:
	VariableInitializer
	| VariableInitializers ',' VariableInitializer;

// Types;
Type: PrimitiveType | ReferenceType;
PrimitiveType: NumericType | 'boolean';

NumericType: IntegralType | FloatingPointType;

IntegralType: 'byte' | 'short' | 'int' | 'long' | 'char';

FloatingPointType: 'float' | 'double';

ReferenceType: ClassOrInterfaceType | ArrayType;

ClassOrInterfaceType: ClassType | InterfaceType;

ClassType: TypeName;

InterfaceType: TypeName;

ArrayType: Type '[' ']';

// Blocks 'and' Commands;
Block: '{' BlockStatements? '}';
BlockStatements:
	BlockStatement
	| BlockStatements BlockStatement;

BlockStatement: LocalVariableDeclarationStatement | Statement;

LocalVariableDeclarationStatement: LocalVariableDeclaration ';';

LocalVariableDeclaration: Type VariableDeclarators;

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
	| SynchronizedStatement
	| ThrowsStatement
	| TryStatement;

EmptyStatement: ';';

LabeledStatement: Identifier ':' Statement;

LabeledStatementNoShortIf: Identifier ':' StatementNoShortIf;

ExpressionStatement: StatementExpression ';';

StatementExpression:
	Assignment
	| PreincrementExpression
	| PostincrementExpression
	| PredecrementExpression
	| PostdecrementExpression
	| MethodInvocation
	| ClassInstanceCreationExpression;

IfThenStatement: 'if' '(' Expression ')' Statement;

IfThenElseStatement:
	'if' '(' Expression ')' StatementNoShortIf 'else' Statement;

IfThenElseStatementNoShortIf:
	'if' '(' Expression ')' StatementNoShortIf 'else' StatementNoShortIf;

SwitchStatement: 'switch' '(' Expression ')' SwitchBlock;

SwitchBlock: '{' SwitchBlockStatementGroups? SwitchLabels? '}';

SwitchBlockStatementGroups:
	SwitchBlockStatementGroup
	| SwitchBlockStatementGroups SwitchBlockStatementGroup;

SwitchBlockStatementGroup: SwitchLabels BlockStatements;

SwitchLabels: SwitchLabel | SwitchLabels SwitchLabel;

SwitchLabel: 'case' ConstantExpression ':' | 'default' ':';

WhileStatement: 'while' '(' Expression ')' Statement;

WhileStatementNoShortIf:
	'while' '(' Expression ')' StatementNoShortIf;

DoStatement: 'do' Statement 'while' '(' Expression ')' ';';

ForStatement:
	'for' '(' ForInit? ';' Expression? ';' ForUpdate? ')' Statement;

ForStatementNoShortIf:
	'for' '(' ForInit? ';' Expression? ';' ForUpdate? ')' StatementNoShortIf;

ForInit: StatementExpressionList | LocalVariableDeclaration;

ForUpdate: StatementExpressionList;

StatementExpressionList:
	StatementExpression
	| StatementExpressionList ',' StatementExpression;

BreakStatement: 'break' Identifier? ';';

ContinueStatement: 'continue' Identifier? ';';

ReturnStatement: 'return' Expression? ';';

ThrowsStatement: 'throw' Expression ';';

SynchronizedStatement: 'synchronized' '(' Expression ')' Block;

TryStatement:
	'try' Block Catches
	| 'try' Block Catches? Finally;

Catches: CatchClause | Catches CatchClause;

CatchClause: 'catch' '(' FormalParameter ')' Block;

Finally: 'finally' Block;

// Expressions;
ConstantExpression: Expression;
Expression: AssignmentExpression;

AssignmentExpression: ConditionalExpression | Assignment;

Assignment:
	LeftHandSide AssignmentOperator AssignmentExpression;

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
	| ConditionalOrExpression
	| ConditionalAndExpression;

ConditionalAndExpression:
	InclusiveOrExpression
	| ConditionalAndExpression '&&' InclusiveOrExpression;

InclusiveOrExpression:
	ExclusiveOrExpression
	| InclusiveOrExpression
	| ExclusiveOrExpression;

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

CastExpression:
	'(' PrimitiveType ')' UnaryExpression
	| '(' ReferenceType ')' UnaryExpressionNotPlusMinus;

UnaryExpression:
	PreincrementExpression
	| PredecrementExpression
	| '+' UnaryExpression
	| '-' UnaryExpression
	| UnaryExpressionNotPlusMinus;

PredecrementExpression: '--' UnaryExpression;

PreincrementExpression: '++' UnaryExpression;

UnaryExpressionNotPlusMinus:
	PostfixExpression
	| '~' UnaryExpression
	| '!' UnaryExpression
	| CastExpression;

PostdecrementExpression: PostfixExpression '--';

PostincrementExpression: PostfixExpression '++';

PostfixExpression:
	Primary
	| ExpressionName
	| PostincrementExpression
	| PostdecrementExpression;

MethodInvocation:
	MethodName '(' ArgumentList? ')'
	| Primary '.' Identifier '(' ArgumentList? ')'
	| 'super' '.' Identifier '(' ArgumentList? ')';

FieldAccess: Primary '.' Identifier | 'super' '.' Identifier;

Primary: PrimaryNoNewArray | ArrayCreationExpression;

PrimaryNoNewArray:
	Literal
	| 'this'
	| '(' Expression ')'
	| ClassInstanceCreationExpression
	| FieldAccess
	| MethodInvocation
	| ArrayAccess;

ClassInstanceCreationExpression:
	'new' ClassType '(' ArgumentList? ')';

ArgumentList: Expression | ArgumentList ',' Expression;

ArrayCreationExpression:
	'new' PrimitiveType DimExprs Dims?
	| 'new' ClassOrInterfaceType DimExprs Dims?;

DimExprs: DimExpr | DimExprs DimExpr;

DimExpr: '[' Expression ']';

Dims: '[' ']' | Dims '[' ']';

ArrayAccess:
	ExpressionName '[' Expression ']'
	| PrimaryNoNewArray '[' Expression ']';

// Tokens;
PackageName: Identifier | PackageName '.' Identifier;
TypeName: Identifier | PackageName '.' Identifier;

SimpleTypeName: Identifier;

ExpressionName: Identifier | AmbiguousName '.' Identifier;

MethodName: Identifier | AmbiguousName '.' Identifier;

AmbiguousName: Identifier | AmbiguousName '.' Identifier;

Literal:
	IntegerLiteral
	| FloatingPointLiteral
	| BooleanLiteral
	| CharacterLiteral
	| StringLiteral
	| NullLiteral;

IntegerLiteral:
	DecimalIntegerLiteral
	| HexIntegerLiteral
	| OctalIntegerLiteral;

DecimalIntegerLiteral: DecimalNumeral IntegerTypeSuffix?;

HexIntegerLiteral: HexNumeral IntegerTypeSuffix?;

OctalIntegerLiteral: OctalNumeral IntegerTypeSuffix?;

IntegerTypeSuffix: 'l' | 'L';

DecimalNumeral: '0' | NonZeroDigit Digits?;

Digits: Digit | Digits Digit;

Digit: '0' | NonZeroDigit;

NonZeroDigit: [1-9];

HexNumeral: '0' [xX] HexDigit;

HexDigit: [0-9a-fA-F];

OctalNumeral: '0' OctalDigit | OctalNumeral OctalDigit;

OctalDigit: [0-7];

FloatingPointLiteral:
	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	| Digits ExponentPart? FloatTypeSuffix?;

ExponentPart: ExponentIndicator SignedInteger;

ExponentIndicator: [eE];

SignedInteger: Sign? Digits;

Sign: [-+];

FloatTypeSuffix: [fFdD];

BooleanLiteral: 'true' | 'false';

CharacterLiteral: '\'' ~('\'') '\'';

StringLiteral: '"' ~('"')+ '"';

NullLiteral: 'null';

Identifier: [_a-zA-Z0-9]+;

Keyword:
	'abstract'
	| 'boolean'
	| 'break'
	| 'byte'
	| 'case'
	| 'catch'
	| 'char'
	| 'class'
	| 'const'
	| 'continue'
	| 'default'
	| 'do'
	| 'double'
	| 'else'
	| 'extends'
	| 'final'
	| 'finally'
	| 'float'
	| 'for'
	| 'goto'
	| 'if'
	| 'implements'
	| 'import'
	| 'instanceof'
	| 'int'
	| 'interface'
	| 'long'
	| 'native'
	| 'new'
	| 'package'
	| 'private'
	| 'protected'
	| 'public'
	| 'return'
	| 'short'
	| 'static'
	| 'super'
	| 'switch'
	| 'synchronized'
	| 'this'
	| 'throw'
	| 'throws'
	| 'transient'
	| 'try'
	| 'void'
	| 'volatile'
	| 'while';
