## Table of Contents

-   [Resources](#resources)
-   [Rules](#rules)
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

| Token     | Description           | Token    | Description |
| --------- | --------------------- | -------- | ----------- |
| PACKAGE   | package               | NEW      | new         |
| IMPORT    | import                | IF       | if          |
| CLASS     | class                 | ELSE     | else        |
| PUBLIC    | public                | FOR      | for         |
| PRIVATE   | private               | WHILE    | while       |
| PROTECTED | protected             | DO       | do          |
| EXTENDS   | extends               | BREAK    | break       |
| SUPER     | super                 | CONTINUE | continue    |
| THIS      | this                  | RETURN   | return      |
| SOUT      | 'System.out.println'; |

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

| Token          | Description                      |
| -------------- | -------------------------------- |
| WS             | [ \t\r\n]+                       |
| INT_LITERAL    | [0-9]+;                          |
| FLOAT_LITERAL  | [0-9]+'.'[0-9]+('f'?);           |
| STRING_LITERAL | '"' ( ESC \| ~[\\"\r\n] )\* '"'; |
| CHAR_LITERAL   | '\'' ~['] '\'';                  |
| BOOL_LITERAL   | 'true' \| 'false';               |
| IDENTIFIER     | [_a-zA-Z]+ [_a-zA-Z0-9]\*;       |
| COMMENTSIMPLE  | '//' (~'\n')\* -> skip;          |
| COMMENTMULTI   | '/_' ._? '\*/' -> skip;          |

### Parser Rules

| Rule                            | Description                                                                                                                                                                                                                                                                                                                                                                             |
| ------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| start                           | packageDec* importDec* classDec\* EOF;                                                                                                                                                                                                                                                                                                                                                  |
| packageDec                      | PACKAGE IDENTIFIER (DOT IDENTIFIER) SEMI;                                                                                                                                                                                                                                                                                                                                               |
| importDec                       | IMPORT IDENTIFIER (DOT IDENTIFIER) SEMI;                                                                                                                                                                                                                                                                                                                                                |
| classDec                        | modifier CLASS IDENTIFIER extends? Body;                                                                                                                                                                                                                                                                                                                                                |
| modifier                        | PUBLIC \| PRIVATE \| PROTECTED;                                                                                                                                                                                                                                                                                                                                                         |
| extendsDec                      | EXTENDS IDENTIFIER (DOT IDENTIFIER)\*;                                                                                                                                                                                                                                                                                                                                                  |
| body                            | LCUR bodyDec\* RCUR;                                                                                                                                                                                                                                                                                                                                                                    |
| bodyDec                         | memberDec \| constructorDec \| methodDec;                                                                                                                                                                                                                                                                                                                                               |
| methodDec                       | modifier? type IDENTIFIER parameters block;                                                                                                                                                                                                                                                                                                                                             |
| block                           | LCUR blockDec\* RCUR;                                                                                                                                                                                                                                                                                                                                                                   |
| blockDec                        | localDec \| statement;                                                                                                                                                                                                                                                                                                                                                                  |
| localDec                        | type IDENTIFIER SEMI;                                                                                                                                                                                                                                                                                                                                                                   |
| memberDec                       | modifier localDec;                                                                                                                                                                                                                                                                                                                                                                      |
| arraySymbol                     | LBRACK RBRACK;                                                                                                                                                                                                                                                                                                                                                                          |
| type                            | primitiveType \| feferenceType;                                                                                                                                                                                                                                                                                                                                                         |
| primitiveType                   | numericType \| BOOL;                                                                                                                                                                                                                                                                                                                                                                    |
| numericType                     | integralType \| floatingPointType;                                                                                                                                                                                                                                                                                                                                                      |
| integralType                    | BYTE \| SHORT \| INT \| LONG \| CHAR;                                                                                                                                                                                                                                                                                                                                                   |
| floatingPointType               | FLOAT \| DOUBLE;                                                                                                                                                                                                                                                                                                                                                                        |
| feferenceType                   | classType;                                                                                                                                                                                                                                                                                                                                                                              |
| classType                       | IDENTIFIER;                                                                                                                                                                                                                                                                                                                                                                             |
| classAccess                     | IDENTIFIER (DOT IDENTIFIER)\*;                                                                                                                                                                                                                                                                                                                                                          |
| constructorDec                  | modifier IDENTIFIER parameters constructorBody;                                                                                                                                                                                                                                                                                                                                         |
| parameters                      | LPAR parameter? (COMMA parameter) RPAR;                                                                                                                                                                                                                                                                                                                                                 |
| parameter                       | type IDENTIFIER;                                                                                                                                                                                                                                                                                                                                                                        |
| constructorBody                 | LCUR constructorInvocation? statement\* RCUR;                                                                                                                                                                                                                                                                                                                                           |
| constructorInvocation           | SUPER LPAR argument? (COMMA argument)\* RPAR;                                                                                                                                                                                                                                                                                                                                           |
| argument                        | IDENTIFIER;                                                                                                                                                                                                                                                                                                                                                                             |
| statement                       | sout\| localDecStatement\| expressionStatement\| ifStatement\| ifElseStatement\| forStatement\| forInCollectionStatement\| whileStatement\| switchStatement\| DO statement WHILE LPAR expression RPAR SEMI\| BREAK SEMI\| CONTINUE SEMI\| returnStatement\| LCUR statement\* RCUR;                                                                                                      |
| localDecStatement               | localDec SEMI;                                                                                                                                                                                                                                                                                                                                                                          |
| ifStatement                     | IF LPAR expression RPAR statement;                                                                                                                                                                                                                                                                                                                                                      |
| elseStatement                   | ELSE statement;                                                                                                                                                                                                                                                                                                                                                                         |
| ifElseStatement                 | ifStatement elseStatement;                                                                                                                                                                                                                                                                                                                                                              |
| forStatement                    | FOR LPAR forInit? SEMI forCondition? SEMI forUpdate? RPAR statement;                                                                                                                                                                                                                                                                                                                    |
| forInit                         | localDec \| expression;                                                                                                                                                                                                                                                                                                                                                                 |
| forUpdate                       | expression;                                                                                                                                                                                                                                                                                                                                                                             |
| forInCollectionStatement        | FOR LPAR localDec COLON expression RPAR statement;                                                                                                                                                                                                                                                                                                                                      |
| whileStatement                  | WHILE LPAR expression RPAR statement;                                                                                                                                                                                                                                                                                                                                                   |
| switchStatement                 | SWITCH LPAR expression RPAR LCUR switchCase\* defaultCase? RCUR;                                                                                                                                                                                                                                                                                                                        |
| switchCase                      | CASE expression COLON statement+ BREAK SEMI;                                                                                                                                                                                                                                                                                                                                            |
| defaultCase                     | DEFAULT COLON statement+;                                                                                                                                                                                                                                                                                                                                                               |
| expressionStatement             | expression SEMI;                                                                                                                                                                                                                                                                                                                                                                        |
| returnStatement                 | RETURN expression? SEMI;                                                                                                                                                                                                                                                                                                                                                                |
| sout                            | SOUT LPAR expression RPAR SEMI;                                                                                                                                                                                                                                                                                                                                                         |
| expression                      | assignment \| generalExpression;                                                                                                                                                                                                                                                                                                                                                        |
| assignment                      | leftHandSide assign;                                                                                                                                                                                                                                                                                                                                                                    |
| assign                          | ASSIGN rightHandSide;                                                                                                                                                                                                                                                                                                                                                                   |
| rightHandSide:generalExpression | arrayRightHandSide;                                                                                                                                                                                                                                                                                                                                                                     |
| generalExpression               | primaryExpression\| conditionalExpression;                                                                                                                                                                                                                                                                                                                                              |
| arrayRightHandSide              | LCUR generalExpression (COMMA generalExpression)\* RCUR;                                                                                                                                                                                                                                                                                                                                |
| leftHandSide                    | fieldAccess \| arrayAccess;                                                                                                                                                                                                                                                                                                                                                             |
| fieldAccess                     | IDENTIFIER (DOT IDENTIFIER)\*;                                                                                                                                                                                                                                                                                                                                                          |
| arrayAccess                     | IDENTIFIER LBRACK (INT_LITERAL \| IDENTIFIER) RBRACK;                                                                                                                                                                                                                                                                                                                                   |
| conditionalExpression           | orExpression (QUESTION expression COLON expression)?;                                                                                                                                                                                                                                                                                                                                   |
| orExpression                    | andExpression (OR andExpression)\*;                                                                                                                                                                                                                                                                                                                                                     |
| andExpression                   | equalityExpression (AND equalityExpression)\*;                                                                                                                                                                                                                                                                                                                                          |
| equalityExpression              | relationalExpression (EQUAL relationalExpression\| NOTEQUAL relationalExpression)\*;                                                                                                                                                                                                                                                                                                    |
| relationalExpression            | additiveExpression (LESS additiveExpression\| LESSEQUAL additiveExpression\| GREATER additiveExpression\| GREATEREQUAL additiveExpression)\*;                                                                                                                                                                                                                                           |
| additiveExpression              | multiplicativeExpression (PLUS multiplicativeExpression\| MINUS multiplicativeExpression)\*;                                                                                                                                                                                                                                                                                            |
| multiplicativeExpression        | unaryExpression (MULTIPLY unaryExpression\| DIVIDE unaryExpression\| MOD unaryExpression)\*;                                                                                                                                                                                                                                                                                            |
| unaryExpression                 | (NOT \| MINUS) unaryExpression\| primaryExpression;                                                                                                                                                                                                                                                                                                                                     |
| literal                         | INT_LITERAL \| FLOAT_LITERAL \| STRING_LITERAL \| BOOL_LITERAL \| CHAR_LITERAL;                                                                                                                                                                                                                                                                                                         |
| lenght                          | fieldAccess DOT LENGHT;                                                                                                                                                                                                                                                                                                                                                                 |
| primaryExpression               | literal \| IDENTIFIER (DOT IDENTIFIER)_ \| THIS \| SUPER \| LPAR expression RPAR \| classType LPAR argument? (COMMA argument)_ RPAR \| NOT unaryExpression \| INCREMENT unaryExpression \| primaryExpression INCREMENT \| DECREMENT unaryExpression \| primaryExpression DECREMENT \| (type \| classAccess) arraySymbol? LPAR expression? RPAR \| fieldAccess \| arrayAccess \| lenght; |

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

Create antlr files in **utils** directory

```
java -jar /usr/local/lib/antlr-4.10.1-complete.jar -Dlanguage=Python3 "$@" jcp.g4 -o utils
```

Run script `run.sh`

```
./run.sh
```
