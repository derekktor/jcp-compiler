    packageDec --> PACKAGE;
    packageDec --> IDENTIFIER;

    importDec --> IMPORT;
    importDec --> IDENTIFIER;

    classDec --> modifier;
    classDec --> CLASS;
    classDec --> IDENTIFIER;
    classDec --> extendsDec;
    classDec --> body;

    modifier --> PUBLIC;
    modifier --> PRIVATE;
    modifier --> PROTECTED;

    extendsDec --> EXTENDS;
    extendsDec --> IDENTIFIER;

    body --> LCUR bodyDec RCUR;

    bodyDec --> memberDec | constructorDec | methodDec;

    methodDec --> modifier type IDENTIFIER parameters block;

    block --> LCUR blockDec RCUR;

    blockDec --> localDec | statement;

    localDec --> type IDENTIFIER SEMI;

    memberDec --> modifier localDec;

    type --> primitiveType | feferenceType;

    primitiveType --> numericType | BOOL;

    numericType --> integralType | floatingPointType;

    integralType --> BYTE | SHORT | INT | LONG | CHAR;

    floatingPointType --> FLOAT | DOUBLE;

    feferenceType --> classType;

    classType --> IDENTIFIER;

    constructorDec --> modifier IDENTIFIER parameters constructorBody;

    parameters --> LPAR parameter (COMMA parameter) RPAR;

    parameter --> type IDENTIFIER;

    constructorBody --> LCUR constructorInvocation statement RCUR;

    constructorInvocation -->
        SUPER LPAR argument (COMMA argument) RPAR;

    argument --> IDENTIFIER;

    statement -->
        expression SEMI
        | IF LPAR expression RPAR statement (ELSE statement)
        | FOR LPAR forInit SEMI forUpdate RPAR statement
        | WHILE LPAR expression RPAR statement
        | DO statement WHILE LPAR expression RPAR SEMI
        | BREAK SEMI
        | CONTINUE SEMI
        | RETURN expression SEMI
        | LCUR blockDec RCUR;

    forInit --> localDec | expression;
    forUpdate --> expression;

    expression --> assignment | conditionalExpression;

    assignment --> leftHandSide ASSIGN expression;

    leftHandSide --> fieldAccess | arrayAccess;

    fieldAccess --> IDENTIFIER (DOT IDENTIFIER);

    arrayAccess --> IDENTIFIER LBRACK LITERAL RBRACK;

    conditionalExpression -->
        orExpression (QUESTION expression COLON expression);

    orExpression --> andExpression (OR andExpression);

    andExpression --> equalityExpression (AND equalityExpression);

    equalityExpression -->
        relationalExpression (
            EQUAL relationalExpression
            | NOTEQUAL relationalExpression
        );

    relationalExpression -->
        additiveExpression (
            LESS additiveExpression
            | LESSEQUAL additiveExpression
            | GREATER additiveExpression
            | GREATEREQUAL additiveExpression
        );

    additiveExpression -->
        multiplicativeExpression (
            PLUS multiplicativeExpression
            | MINUS multiplicativeExpression
        );

    multiplicativeExpression -->
        unaryExpression (
            MULTIPLY unaryExpression
            | DIVIDE unaryExpression
            | MOD unaryExpression
        );

    unaireExpression -->
        primaryExpression (
            PLUS unaryExpression
            | MINUS unaryExpression
        );

    unaryExpression -->
        (PLUS unaryExpression | MINUS unaryExpression) unaryExpression
        | (NOT unaryExpression);

    primaryExpression -->
        LITERAL
        | IDENTIFIER
        | THIS
        | SUPER
        | LPAR expression RPAR
        | NEW classType LPAR argument (COMMA argument) RPAR
        | NOT unaryExpression
        | INCREMENT unaryExpression
        | DECREMENT unaryExpression
        | type LPAR expression RPAR;

    // Tokens
    PACKAGE --> 'package';
    IMPORT --> 'import';
    CLASS --> 'class';
    PUBLIC --> 'public';
    PRIVATE --> 'private';
    PROTECTED --> 'protected';
    EXTENDS --> 'extends';
    SUPER --> 'super';
    THIS --> 'this';
    NEW --> 'new';
    IF --> 'if';
    ELSE --> 'else';
    FOR --> 'for';
    WHILE --> 'while';
    DO --> 'do';
    BREAK --> 'break';
    CONTINUE --> 'continue';
    RETURN --> 'return';

    ASSIGN --> '=';
    PLUS --> '+';
    MINUS --> '-';
    MULTIPLY --> '';
    DIVIDE --> '/';
    MOD --> '%';
    INCREMENT --> '++';
    DECREMENT --> '--';

    OR --> '||';
    AND --> '&&';
    NOT --> '!';

    EQUAL --> '==';
    NOTEQUAL --> '!=';
    LESS --> '<';
    LESSEQUAL --> '<=';
    GREATER --> '>';
    GREATEREQUAL --> '>=';

    DOT --> '.';
    COMMA --> ',';
    SEMI --> ';';
    COLON --> ' -->';
    QUESTION --> '';

    LCUR --> '{';
    RCUR --> '}';
    LPAR --> '(';
    RPAR --> ')';
    LBRACK --> '[';
    RBRACK --> ']';

    BOOL --> 'boolean';
    BYTE --> 'byte';
    SHORT --> 'short';
    LONG --> 'long';
    INT --> 'int';
    CHAR --> 'char';
    FLOAT --> 'float';
    DOUBLE --> 'double';

    WS --> [ \t\r\n]+ -> skip;
    LITERAL --> [0-9]+;
    IDENTIFIER --> [_a-zA-Z]+ [_a-zA-Z0-9];