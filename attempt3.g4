lexer grammar attempt2;

Start: PackageDec* ImportDec* ClassDec* EOF;

PackageDec: PACKAGE IDENTIFIER (DOT IDENTIFIER) SEMI;

ImportDec: IMPORT IDENTIFIER (DOT IDENTIFIER) SEMI;

ClassDec: Modifier CLASS IDENTIFIER Extends? Body;

Modifier: PUBLIC | PRIVATE | PROTECTED;

Extends: EXTENDS IDENTIFIER (DOT IDENTIFIER);

Body: LCUR BodyDec* RCUR;

BodyDec: MemberDec | ConstructorDec | MethodDec;

MemberDec: Modifier Type IDENTIFIER SEMI;

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

ConstructorInvocation: SUPER Arguments;
// super("john", 30)

Arguments: LPAR Argument? (COMMA Argument)* RPAR;

Argument: Expression;

Statement:
	(
		SwitchStat
		| DoStat
		| BREAK
		| CONTINUE
		| ReturnStat
		| ThrowStat
		| TryStat
	) SEMI;

SwitchStat: SWITCH LPAR Expression RPAR SwitchBlock;

SwitchBlock: LCUR SwitchLabelGroup* RCUR;

// Statement -> sus
SwitchLabelGroup: SwitchLabel COLON Statement* BREAK SEMI;

SwitchLabel: CASE Expression | DEFAULT;

DoStat: DO DoBlock WHILE LPAR Expression RPAR;

DoBlock: LCUR Statement RCUR;

ReturnStat: RETURN Expression?;

ThrowStat: THROW Expression;

TryStat: TRY Block Catches;

Block: LCUR BlockStatement* RCUR;

BlockStatement: Statement;

Catches: CatchClause+;

CatchClause: CATCH Parameters Block;

VariableDec: Type VariableName (EQ Expression)? SEMI;

VariableName: IDENTIFIER;

Expression:
	Literal
	| IDENTIFIER
	| InstanceCreationExp
	| LPAR Expression RPAR
	| Expression Operator Expression;

Literal:
	IntegerLit
	| FloatingPointLit
	| BooleanLit
	| CharLit
	| StringLit
	| NULL;

IntegerLit: Number;

Number: '0' | NOTZERO DIGIT+;

FloatingPointLit: DIGIT* DOT DIGIT+;

BooleanLit: TRUE | FALSE;

CharLit: APOST SINGLECHAR APOST;

StringLit: QUOT STRCHAR* QUOT;

InstanceCreationExp: NEW Type Arguments;
// new Student("john", 30)

Operator:
	LogicalOp
	| EqualityOp
	| RelationalOp
	| AdditiveOp
	| MultiplicativeOp;

LogicalOp: OR | AND;

EqualityOp: EQ EQ | EXCLAM EQ;

RelationalOp: (GT | LT) EQ?;

AdditiveOp: PLUS | MINUS;

MultiplicativeOp: MULT | DIV | MOD;

// Tokens
PACKAGE: 'package';
IMPORT: 'import';
CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
EXTENDS: 'extends';
SUPER: 'super';
NEW: 'new';
CASE: 'case';
DEFAULT: 'default';

IF: 'if';
SWITCH: 'switch';
BREAK: 'break';
DO: 'do';
WHILE: 'while';
CONTINUE: 'continue';
RETURN: 'return';
THROW: 'throw';
TRY: 'try';
CATCH: 'catch';
FOR: 'for';

DOT: '.';
COMMA: ',';
SEMI: ';';
COLON: ':';

LCUR: '{';
RCUR: '}';
LPAR: '(';
RPAR: ')';

EQ: '=';
LT: '<';
GT: '>';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

OR: '||';
AND: '&&';

EXCLAM: '!';

BOOL: 'boolean';
BYTE: 'byte';
SHORT: 'short';
LONG: 'long';
INT: 'int';
CHAR: 'char';
FLOAT: 'float';
DOUBLE: 'double';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

APOST: '\'';
QUOT: '"';

SINGLECHAR: ~['\\\r\n];
STRCHAR: ~["\\\r\n];
IDENTIFIER: [_a-zA-Z]+ [_a-zA-Z0-9]*;
NOTZERO: [1-9];
DIGIT: [0-9];

WS: [ \t\r\n]+ -> skip;

COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);