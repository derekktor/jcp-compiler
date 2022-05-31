lexer grammar attempt2;

Start: PackageDec* ImportDec* ClassDec* EOF;

PackageDec: PACKAGE IDENTIFIER (DOT IDENTIFIER) SEMI;

ImportDec: IMPORT IDENTIFIER (DOT IDENTIFIER) SEMI;

ClassDec: Modifier CLASS IDENTIFIER Extends? Body;

Modifier: PUBLIC | PRIVATE | PROTECTED;

Extends: EXTENDS IDENTIFIER (DOT IDENTIFIER);

Body: LCUR BodyDec* RCUR;

BodyDec: MemberDec | ConstructorDec | MethodDec;

MethodDec: Modifier? Type IDENTIFIER Parameters Block;

Block: LCUR BlockDec* RCUR;

fragment BlockDec: LocalDec | Statement;

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

Statement:;

// Tokens
PACKAGE: 'package';
IMPORT: 'import';
CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
EXTENDS: 'extends';
SUPER: 'super';

DOT: '.';
COMMA: ',';
SEMI: ';';

LCUR: '{';
RCUR: '}';
LPAR: '(';
RPAR: ')';

BOOL: 'boolean';
BYTE: 'byte';
SHORT: 'short';
LONG: 'long';
INT: 'int';
CHAR: 'char';
FLOAT: 'float';
DOUBLE: 'double';

IDENTIFIER: [_a-zA-Z]+ [_a-zA-Z0-9]*;