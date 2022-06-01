# Generated from JCP.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,100,23,2,0,7,0,1,0,5,0,4,8,0,10,0,12,0,7,9,0,1,0,5,0,10,8,0,
        10,0,12,0,13,9,0,1,0,5,0,16,8,0,10,0,12,0,19,9,0,1,0,1,0,1,0,0,0,
        1,0,0,0,24,0,5,1,0,0,0,2,4,5,1,0,0,3,2,1,0,0,0,4,7,1,0,0,0,5,3,1,
        0,0,0,5,6,1,0,0,0,6,11,1,0,0,0,7,5,1,0,0,0,8,10,5,2,0,0,9,8,1,0,
        0,0,10,13,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,17,1,0,0,0,13,11,
        1,0,0,0,14,16,5,3,0,0,15,14,1,0,0,0,16,19,1,0,0,0,17,15,1,0,0,0,
        17,18,1,0,0,0,18,20,1,0,0,0,19,17,1,0,0,0,20,21,5,0,0,1,21,1,1,0,
        0,0,3,5,11,17
    ]

class JCPParser ( Parser ):

    grammarFileName = "JCP.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'package'", "'import'", "'class'", "'public'", "'private'", 
                     "'protected'", "'extends'", "'super'", "'this'", "'new'", 
                     "'if'", "'else'", "'for'", "'while'", "'do'", "'break'", 
                     "'continue'", "'return'", "'='", "'+'", "'-'", "'*'", 
                     "'/'", "'%'", "'++'", "'--'", "'||'", "'&&'", "'!'", 
                     "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'.'", 
                     "','", "';'", "':'", "'?'", "'{'", "'}'", "'('", "')'", 
                     "'['", "']'", "'boolean'", "'byte'", "'short'", "'long'", 
                     "'int'", "'char'", "'float'", "'double'" ]

    symbolicNames = [ "<INVALID>", "PackageDec", "ImportDec", "ClassDec", 
                      "Modifier", "Extends", "Body", "BodyDec", "MethodDec", 
                      "Block", "BlockDec", "LocalDec", "MemberDec", "Type", 
                      "PrimitiveType", "NumericType", "IntegralType", "FloatingPointType", 
                      "ReferenceType", "ClassType", "ConstructorDec", "Parameters", 
                      "Parameter", "ConstructorBody", "ConstructorInvocation", 
                      "Argument", "Statement", "ForInit", "ForUpdate", "Expression", 
                      "Assignment", "LeftHandSide", "FieldAccess", "ArrayAccess", 
                      "ConditionalExpression", "OrExpression", "AndExpression", 
                      "EqualityExpression", "RelationalExpression", "AdditiveExpression", 
                      "MultiplicativeExpression", "UnaireExpression", "UnaryExpression", 
                      "PrimaryExpression", "PACKAGE", "IMPORT", "CLASS", 
                      "PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "SUPER", 
                      "THIS", "NEW", "IF", "ELSE", "FOR", "WHILE", "DO", 
                      "BREAK", "CONTINUE", "RETURN", "ASSIGN", "PLUS", "MINUS", 
                      "MULTIPLY", "DIVIDE", "MOD", "INCREMENT", "DECREMENT", 
                      "OR", "AND", "NOT", "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", 
                      "GREATER", "GREATEREQUAL", "DOT", "COMMA", "SEMI", 
                      "COLON", "QUESTION", "LCUR", "RCUR", "LPAR", "RPAR", 
                      "LBRACK", "RBRACK", "BOOL", "BYTE", "SHORT", "LONG", 
                      "INT", "CHAR", "FLOAT", "DOUBLE", "WS", "LITERAL", 
                      "IDENTIFIER" ]

    RULE_start = 0

    ruleNames =  [ "start" ]

    EOF = Token.EOF
    PackageDec=1
    ImportDec=2
    ClassDec=3
    Modifier=4
    Extends=5
    Body=6
    BodyDec=7
    MethodDec=8
    Block=9
    BlockDec=10
    LocalDec=11
    MemberDec=12
    Type=13
    PrimitiveType=14
    NumericType=15
    IntegralType=16
    FloatingPointType=17
    ReferenceType=18
    ClassType=19
    ConstructorDec=20
    Parameters=21
    Parameter=22
    ConstructorBody=23
    ConstructorInvocation=24
    Argument=25
    Statement=26
    ForInit=27
    ForUpdate=28
    Expression=29
    Assignment=30
    LeftHandSide=31
    FieldAccess=32
    ArrayAccess=33
    ConditionalExpression=34
    OrExpression=35
    AndExpression=36
    EqualityExpression=37
    RelationalExpression=38
    AdditiveExpression=39
    MultiplicativeExpression=40
    UnaireExpression=41
    UnaryExpression=42
    PrimaryExpression=43
    PACKAGE=44
    IMPORT=45
    CLASS=46
    PUBLIC=47
    PRIVATE=48
    PROTECTED=49
    EXTENDS=50
    SUPER=51
    THIS=52
    NEW=53
    IF=54
    ELSE=55
    FOR=56
    WHILE=57
    DO=58
    BREAK=59
    CONTINUE=60
    RETURN=61
    ASSIGN=62
    PLUS=63
    MINUS=64
    MULTIPLY=65
    DIVIDE=66
    MOD=67
    INCREMENT=68
    DECREMENT=69
    OR=70
    AND=71
    NOT=72
    EQUAL=73
    NOTEQUAL=74
    LESS=75
    LESSEQUAL=76
    GREATER=77
    GREATEREQUAL=78
    DOT=79
    COMMA=80
    SEMI=81
    COLON=82
    QUESTION=83
    LCUR=84
    RCUR=85
    LPAR=86
    RPAR=87
    LBRACK=88
    RBRACK=89
    BOOL=90
    BYTE=91
    SHORT=92
    LONG=93
    INT=94
    CHAR=95
    FLOAT=96
    DOUBLE=97
    WS=98
    LITERAL=99
    IDENTIFIER=100

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(JCPParser.EOF, 0)

        def PackageDec(self, i:int=None):
            if i is None:
                return self.getTokens(JCPParser.PackageDec)
            else:
                return self.getToken(JCPParser.PackageDec, i)

        def ImportDec(self, i:int=None):
            if i is None:
                return self.getTokens(JCPParser.ImportDec)
            else:
                return self.getToken(JCPParser.ImportDec, i)

        def ClassDec(self, i:int=None):
            if i is None:
                return self.getTokens(JCPParser.ClassDec)
            else:
                return self.getToken(JCPParser.ClassDec, i)

        def getRuleIndex(self):
            return JCPParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = JCPParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 5
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JCPParser.PackageDec:
                self.state = 2
                self.match(JCPParser.PackageDec)
                self.state = 7
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 11
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JCPParser.ImportDec:
                self.state = 8
                self.match(JCPParser.ImportDec)
                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 17
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==JCPParser.ClassDec:
                self.state = 14
                self.match(JCPParser.ClassDec)
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 20
            self.match(JCPParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





