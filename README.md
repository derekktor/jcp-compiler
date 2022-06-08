## Table of Contents

-   [Resources](#resources)
-   [Rules](#rules)
-   [Graph](#graph)
-   [Installation](#installation)

---

## Resources

-   [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se8/html/jls-19.html)
-   [Java Tokens](https://www.javatpoint.com/java-tokens)

<!--
-   [java lexer](https://github.com/antlr/grammars-v4/blob/master/java/java9/Java9Lexer.g4)
-   [java parser](https://github.com/antlr/grammars-v4/blob/master/java/java9/Java9Parser.g4)

-->

---

## Rules

### Lexer Rules

#### Operators

| Token     | Description | Token        | Description |
| --------- | ----------- | ------------ | ----------- |
| ASSIGN    | =           | AND          | &&          |
| PLUS      | +           | NOT          | !           |
| MINUS     | -           | EQUAL        | ==          |
| MULTIPLY  | \*          | NOTEQUAL     | !=          |
| DIVIDE    | /           | LESS         | <           |
| MOD       | %           | LESSEQUAL    | <=          |
| INCREMENT | ++          | GREATER      | >           |
| DECREMENT | --          | GREATEREQUAL | >=          |
| OR        | \|\|        |

#### Keywords

| Token     | Description | Token    | Description |
| --------- | ----------- | -------- | ----------- |
| PACKAGE   | package     | NEW      | new         |
| IMPORT    | import      | IF       | if          |
| CLASS     | class       | ELSE     | else        |
| PUBLIC    | public      | FOR      | for         |
| PRIVATE   | private     | WHILE    | while       |
| PROTECTED | protected   | DO       | do          |
| EXTENDS   | extends     | BREAK    | break       |
| SUPER     | super       | CONTINUE | continue    |
| THIS      | this        | RETURN   | return      |

#### Separators

| Token    | Description | Token  | Description |
| -------- | ----------- | ------ | ----------- |
| DOT      | .           | RCUR   | }           |
| COMMA    | ,           | LPAR   | (           |
| SEMI     | ;           | RPAR   | )           |
| COLON    | :           | LBRACK | [           |
| QUESTION | ?           | RBRACK | ]           |
| LCUR     | {           |

#### Data Types

| Token | Description | Token  | Description |
| ----- | ----------- | ------ | ----------- |
| BOOL  | boolean     | INT    | int         |
| BYTE  | byte        | CHAR   | char        |
| SHORT | short       | FLOAT  | float       |
| LONG  | long        | DOUBLE | double      |

#### Identifiers

| Token      | Description               |
| ---------- | ------------------------- |
| WS         | [ \t\r\n]+                |
| LITERAL    | [0-9]+                    |
| IDENTIFIER | [_a-zA-Z]+ [_a-zA-Z0-9]\* |

### Parser Rules

| Rule                     | Description                                                                                                                                                                                                                    |
| ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| start                    | packageDec* importDec* classDec\* EOF;                                                                                                                                                                                         |
| packageDec               | PACKAGE IDENTIFIER (DOT IDENTIFIER) SEMI;                                                                                                                                                                                      |
| importDec                | IMPORT IDENTIFIER (DOT IDENTIFIER) SEMI;                                                                                                                                                                                       |
| classDec                 | modifier CLASS IDENTIFIER extends? Body;                                                                                                                                                                                       |
| modifier                 | PUBLIC \| PRIVATE \| PROTECTED;                                                                                                                                                                                                |
| extends                  | EXTENDS IDENTIFIER (DOT IDENTIFIER)\*;                                                                                                                                                                                         |
| Body                     | LCUR bodyDec\* RCUR;                                                                                                                                                                                                           |
| bodyDec                  | memberDec \| constructorDec \| methodDec;                                                                                                                                                                                      |
| methodDec                | modifier? type IDENTIFIER parameters block;                                                                                                                                                                                    |
| block                    | LCUR blockDec\* RCUR;                                                                                                                                                                                                          |
| blockDec                 | localDec \| statement;                                                                                                                                                                                                         |
| localDec                 | type IDENTIFIER SEMI;                                                                                                                                                                                                          |
| memberDec                | modifier localDec;                                                                                                                                                                                                             |
| type                     | primitiveType \| feferenceType;                                                                                                                                                                                                |
| primitiveType            | numericType \| BOOL;                                                                                                                                                                                                           |
| numericType              | integralType \| floatingPointType;                                                                                                                                                                                             |
| integralType             | BYTE \| SHORT \| INT \| LONG \| CHAR;                                                                                                                                                                                          |
| floatingPointType        | FLOAT \| DOUBLE;                                                                                                                                                                                                               |
| feferenceType            | classType;                                                                                                                                                                                                                     |
| classType                | IDENTIFIER;                                                                                                                                                                                                                    |
| constructorDec           | modifier IDENTIFIER parameters constructorBody;                                                                                                                                                                                |
| parameters               | LPAR parameter? (COMMA parameter) RPAR;                                                                                                                                                                                        |
| parameter                | type IDENTIFIER;                                                                                                                                                                                                               |
| constructorBody          | LCUR constructorInvocation? statement\* RCUR;                                                                                                                                                                                  |
| constructorInvocation    | SUPER LPAR argument? (COMMA argument)\* RPAR;                                                                                                                                                                                  |
| argument                 | IDENTIFIER;                                                                                                                                                                                                                    |
| forInit                  | localDec \| expression;                                                                                                                                                                                                        |
| forUpdate                | expression;                                                                                                                                                                                                                    |
| expression               | assignment \| conditionalExpression;                                                                                                                                                                                           |
| assignment               | leftHandSide ASSIGN expression;                                                                                                                                                                                                |
| fieldAccess              | IDENTIFIER (DOT IDENTIFIER)\*                                                                                                                                                                                                  |
| arrayAccess              | IDENTIFIER LBRACK LITERAL RBRACK                                                                                                                                                                                               |
| conditionalExpression    | orExpression (QUESTION expression COLON expression)?                                                                                                                                                                           |
| orExpression             | andExpression (OR andExpression)\*                                                                                                                                                                                             |
| andExpression            | equalityExpression (AND equalityExpression)\*                                                                                                                                                                                  |
| equalityExpression       | relationalExpression (EQUAL relationalExpression \| NOTEQUAL relationalExpression)\*                                                                                                                                           |
| relationalExpression     | additiveExpression (LESS additiveExpression \| LESSEQUAL additiveExpression \| GREATER additiveExpression \| GREATEREQUAL additiveExpression)\*                                                                                |
| additiveExpression       | multiplicativeExpression (PLUS multiplicativeExpression \| MINUS multiplicativeExpression)\*                                                                                                                                   |
| multiplicativeExpression | unaryExpression (MULTIPLY unaryExpression \| DIVIDE unaryExpression \| MOD unaryExpression)\*                                                                                                                                  |
| unaryExpression          | (PLUS unaryExpression \| MINUS unaryExpression) unaryExpression \| (NOT unaryExpression )                                                                                                                                      |
| primaryExpression        | LITERAL \| IDENTIFIER \|THIS \|SUPER \|LPAR expression RPAR \|NEW classType LPAR argument? (COMMA argument)\* RPAR \|NOT unaryExpression \|INCREMENT unaryExpression \| DECREMENT unaryExpression \| type LPAR expression RPAR |

---

## Graph

[Graph](/graph.md)

---

## Installation

Create new conda env

```
conda create --name *compiler*
conda activate *compiler*
```

Install Python ANTLR runtime

```
conda install antlr4-python3-runtime
```

Aliases

```
alias antlr4='java -jar /usr/local/lib/antlr-4.10.1-complete.jar'
alias antlr4py='java -jar /usr/local/lib/antlr-4.10.1-complete.jar -Dlanguage=Python3 "$@"'
alias grun='java org.antlr.v4.gui.TestRig'
```

Create antlr files in **utils** directory

```
antlr4py jcp.g4 -o utils
```

Run `main.py`

```
python3 main.py
```
