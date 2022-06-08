```mermaid
graph TD;
    start --> packageDec;
    start --> importDec;
    start --> classDec;

    packageDec --> PACKAGE;
    packageDec --> packageName;

    importDec --> IMPORT;
    importDec --> importName;

    classDec --> modifier;
    classDec --> CLASS;
    classDec --> className;
    classDec --> extendsDec;
    classDec --> body;

    modifier --> PUBLIC;
    modifier --> PRIVATE;
    modifier --> PROTECTED;

    extendsDec --> EXTENDS;
    extendsDec --> parentClassName;

    body --> LCUR;
    body --> bodyDec;
    body --> RCUR;

    bodyDec -.-> memberDec;
    bodyDec -.-> constructorDec;
    bodyDec -.-> methodDec;
```

```mermaid
graph TD;
    methodDec --> modifier;
    methodDec --> type;
    methodDec --> memberName;
    methodDec --> parameters;
    methodDec --> block;

    parameters --> LPAR;
    parameters --> parameter;
    parameters --> RPAR;

    block --> LCUR;
    block --> blockDec;
    block --> RCUR;

    blockDec -.-> localDec;
    blockDec -.-> statement;
```

```mermaid
graph TD;
    localDec --> type;
    localDec --> variableName;
    localDec --> SEMI;




```

```mermaid
graph TD
    constructorDec --> modifier
    constructorDec --> className
    constructorDec --> parameters
    constructorDec --> constructorBody

    constructorBody --> LCUR
    constructorBody --> constructorInvocation
    constructorBody --> statement
    constructorBody --> RCUR

    constructorInvocation --> SUPER
    constructorInvocation --> LPAR
    constructorInvocation --> argument
    constructorInvocation --> RPAR
```

```mermaid
graph LR
    statement -.-> simpleStatement
    statement -.-> ifStatement
    statement -.-> forStatement
    statement -.-> whileStatement
    statement -.-> doStatement
    statement -.-> breakStatement
    statement -.-> continueStatement
    statement -.-> returnStatement
    statement -.-> blockStatement
```

```mermaid
graph TD
    simpleStatment --> expression
    simpleStatment --> SEMI
```

```mermaid
graph TD
    ifStatement --> IF
    ifStatement --> condition
    ifStatement --> statement
    ifStatement --> ELSE
    ifStatement --> statement

    condition --> LPAR
    condition --> expression
    condition --> RPAR

```

```mermaid
graph TD
    forStatement --> FOR
    forStatement --> forControl
    forStatement --> statement

    forControl --> LPAR
    forControl --> forInit
    forControl --> forCondition
    forControl --> forUpdate
    forControl --> RPAR

    forInit -.-> localDec
    forInit -.-> expression

    forUpdate --> expression
```

```mermaid
graph TD
    whileStatement --> WHILE
    whileStatement --> condition
    whileStatement --> statement
```

```mermaid
graph TD
    doStatement --> DO
    doStatement --> statement
    doStatement --> WHILE
    doStatement --> condition
    doStatement --> SEMI
```

```mermaid
graph TD
    breakStatement --> BREAK
    breakStatement --> SEMI
```

```mermaid
graph TD
    continueStatement --> CONTINUE
    continueStatement --> SEMI
```

```mermaid
graph TD
    returnStatement --> RETURN
    returnStatement --> expression
    returnStatement --> SEMI
```

```mermaid
graph TD
    blockStatement --> LCUR
    blockStatement --> blockDec
    blockStatement --> RCUR
```

```mermaid
graph TD
    expression -.-> assignment
    expression -.-> conditionalExpression
```

```mermaid
graph TD
    assignment --> leftHandSide
    assignment --> assign

    assign --> ASSIGN
    assign --> rightHandSide

    leftHandSide -.-> fieldAccess
    leftHandSide -.-> arrayAccess

    fieldAccess --> FA("IDENTIFIER (DOT IDENTIFIER)*")

    arrayAccess --> AA("IDENTIFIER LBRACK LITERAL RBRACK")
```

```mermaid
graph TD
    rightHandSide -.-> conditionalExpression
    rightHandSide -.-> primaryExpression

    conditionalExpression --> orExpression (QUESTION expression COLON expression)?;
```
