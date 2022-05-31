# Generated from attempt2.g4 by ANTLR 4.10.1
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
        4,1,97,51,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,5,0,10,8,0,10,0,12,
        0,13,9,0,1,0,5,0,16,8,0,10,0,12,0,19,9,0,1,0,5,0,22,8,0,10,0,12,
        0,25,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,1,3,1,3,1,3,1,3,3,3,47,8,3,1,3,1,3,1,3,0,0,4,0,2,4,6,0,0,
        50,0,11,1,0,0,0,2,28,1,0,0,0,4,35,1,0,0,0,6,42,1,0,0,0,8,10,3,2,
        1,0,9,8,1,0,0,0,10,13,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,17,1,
        0,0,0,13,11,1,0,0,0,14,16,3,4,2,0,15,14,1,0,0,0,16,19,1,0,0,0,17,
        15,1,0,0,0,17,18,1,0,0,0,18,23,1,0,0,0,19,17,1,0,0,0,20,22,3,6,3,
        0,21,20,1,0,0,0,22,25,1,0,0,0,23,21,1,0,0,0,23,24,1,0,0,0,24,26,
        1,0,0,0,25,23,1,0,0,0,26,27,5,0,0,1,27,1,1,0,0,0,28,29,5,41,0,0,
        29,30,5,97,0,0,30,31,5,76,0,0,31,32,5,97,0,0,32,33,1,0,0,0,33,34,
        5,78,0,0,34,3,1,0,0,0,35,36,5,42,0,0,36,37,5,97,0,0,37,38,5,76,0,
        0,38,39,5,97,0,0,39,40,1,0,0,0,40,41,5,78,0,0,41,5,1,0,0,0,42,43,
        5,1,0,0,43,44,5,43,0,0,44,46,5,97,0,0,45,47,5,2,0,0,46,45,1,0,0,
        0,46,47,1,0,0,0,47,48,1,0,0,0,48,49,5,3,0,0,49,7,1,0,0,0,4,11,17,
        23,46
    ]

class attempt2Parser ( Parser ):

    grammarFileName = "attempt2.g4"

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
                     "<INVALID>", "'package'", "'import'", "'class'", "'public'", 
                     "'private'", "'protected'", "'extends'", "'super'", 
                     "'this'", "'new'", "'if'", "'else'", "'for'", "'while'", 
                     "'do'", "'break'", "'continue'", "'return'", "'='", 
                     "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
                     "'||'", "'&&'", "'!'", "'=='", "'!='", "'<'", "'<='", 
                     "'>'", "'>='", "'.'", "','", "';'", "':'", "'?'", "'{'", 
                     "'}'", "'('", "')'", "'['", "']'", "'boolean'", "'byte'", 
                     "'short'", "'long'", "'int'", "'char'", "'float'", 
                     "'double'" ]

    symbolicNames = [ "<INVALID>", "Modifier", "Extends", "Body", "BodyDec", 
                      "MethodDec", "Block", "BlockDec", "LocalDec", "MemberDec", 
                      "Type", "PrimitiveType", "NumericType", "IntegralType", 
                      "FloatingPointType", "ReferenceType", "ClassType", 
                      "ConstructorDec", "Parameters", "Parameter", "ConstructorBody", 
                      "ConstructorInvocation", "Argument", "Statement", 
                      "ForInit", "ForUpdate", "Expression", "Assignment", 
                      "LeftHandSide", "FieldAccess", "ArrayAccess", "ConditionalExpression", 
                      "OrExpression", "AndExpression", "EqualityExpression", 
                      "RelationalExpression", "AdditiveExpression", "MultiplicativeExpression", 
                      "UnaireExpression", "UnaryExpression", "PrimaryExpression", 
                      "PACKAGE", "IMPORT", "CLASS", "PUBLIC", "PRIVATE", 
                      "PROTECTED", "EXTENDS", "SUPER", "THIS", "NEW", "IF", 
                      "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", 
                      "RETURN", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
                      "MOD", "INCREMENT", "DECREMENT", "OR", "AND", "NOT", 
                      "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", "GREATER", 
                      "GREATEREQUAL", "DOT", "COMMA", "SEMI", "COLON", "QUESTION", 
                      "LCUR", "RCUR", "LPAR", "RPAR", "LBRACK", "RBRACK", 
                      "BOOL", "BYTE", "SHORT", "LONG", "INT", "CHAR", "FLOAT", 
                      "DOUBLE", "WS", "LITERAL", "IDENTIFIER" ]

    RULE_start = 0
    RULE_packageDec = 1
    RULE_importDec = 2
    RULE_classDec = 3

    ruleNames =  [ "start", "packageDec", "importDec", "classDec" ]

    EOF = Token.EOF
    Modifier=1
    Extends=2
    Body=3
    BodyDec=4
    MethodDec=5
    Block=6
    BlockDec=7
    LocalDec=8
    MemberDec=9
    Type=10
    PrimitiveType=11
    NumericType=12
    IntegralType=13
    FloatingPointType=14
    ReferenceType=15
    ClassType=16
    ConstructorDec=17
    Parameters=18
    Parameter=19
    ConstructorBody=20
    ConstructorInvocation=21
    Argument=22
    Statement=23
    ForInit=24
    ForUpdate=25
    Expression=26
    Assignment=27
    LeftHandSide=28
    FieldAccess=29
    ArrayAccess=30
    ConditionalExpression=31
    OrExpression=32
    AndExpression=33
    EqualityExpression=34
    RelationalExpression=35
    AdditiveExpression=36
    MultiplicativeExpression=37
    UnaireExpression=38
    UnaryExpression=39
    PrimaryExpression=40
    PACKAGE=41
    IMPORT=42
    CLASS=43
    PUBLIC=44
    PRIVATE=45
    PROTECTED=46
    EXTENDS=47
    SUPER=48
    THIS=49
    NEW=50
    IF=51
    ELSE=52
    FOR=53
    WHILE=54
    DO=55
    BREAK=56
    CONTINUE=57
    RETURN=58
    ASSIGN=59
    PLUS=60
    MINUS=61
    MULTIPLY=62
    DIVIDE=63
    MOD=64
    INCREMENT=65
    DECREMENT=66
    OR=67
    AND=68
    NOT=69
    EQUAL=70
    NOTEQUAL=71
    LESS=72
    LESSEQUAL=73
    GREATER=74
    GREATEREQUAL=75
    DOT=76
    COMMA=77
    SEMI=78
    COLON=79
    QUESTION=80
    LCUR=81
    RCUR=82
    LPAR=83
    RPAR=84
    LBRACK=85
    RBRACK=86
    BOOL=87
    BYTE=88
    SHORT=89
    LONG=90
    INT=91
    CHAR=92
    FLOAT=93
    DOUBLE=94
    WS=95
    LITERAL=96
    IDENTIFIER=97

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
            return self.getToken(attempt2Parser.EOF, 0)

        def packageDec(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(attempt2Parser.PackageDecContext)
            else:
                return self.getTypedRuleContext(attempt2Parser.PackageDecContext,i)


        def importDec(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(attempt2Parser.ImportDecContext)
            else:
                return self.getTypedRuleContext(attempt2Parser.ImportDecContext,i)


        def classDec(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(attempt2Parser.ClassDecContext)
            else:
                return self.getTypedRuleContext(attempt2Parser.ClassDecContext,i)


        def getRuleIndex(self):
            return attempt2Parser.RULE_start

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

        localctx = attempt2Parser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==attempt2Parser.PACKAGE:
                self.state = 8
                self.packageDec()
                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 17
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==attempt2Parser.IMPORT:
                self.state = 14
                self.importDec()
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 23
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==attempt2Parser.Modifier:
                self.state = 20
                self.classDec()
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 26
            self.match(attempt2Parser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PackageDecContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PACKAGE(self):
            return self.getToken(attempt2Parser.PACKAGE, 0)

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(attempt2Parser.IDENTIFIER)
            else:
                return self.getToken(attempt2Parser.IDENTIFIER, i)

        def SEMI(self):
            return self.getToken(attempt2Parser.SEMI, 0)

        def DOT(self):
            return self.getToken(attempt2Parser.DOT, 0)

        def getRuleIndex(self):
            return attempt2Parser.RULE_packageDec

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPackageDec" ):
                listener.enterPackageDec(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPackageDec" ):
                listener.exitPackageDec(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPackageDec" ):
                return visitor.visitPackageDec(self)
            else:
                return visitor.visitChildren(self)




    def packageDec(self):

        localctx = attempt2Parser.PackageDecContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_packageDec)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.match(attempt2Parser.PACKAGE)
            self.state = 29
            self.match(attempt2Parser.IDENTIFIER)

            self.state = 30
            self.match(attempt2Parser.DOT)
            self.state = 31
            self.match(attempt2Parser.IDENTIFIER)
            self.state = 33
            self.match(attempt2Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImportDecContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IMPORT(self):
            return self.getToken(attempt2Parser.IMPORT, 0)

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(attempt2Parser.IDENTIFIER)
            else:
                return self.getToken(attempt2Parser.IDENTIFIER, i)

        def SEMI(self):
            return self.getToken(attempt2Parser.SEMI, 0)

        def DOT(self):
            return self.getToken(attempt2Parser.DOT, 0)

        def getRuleIndex(self):
            return attempt2Parser.RULE_importDec

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImportDec" ):
                listener.enterImportDec(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImportDec" ):
                listener.exitImportDec(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImportDec" ):
                return visitor.visitImportDec(self)
            else:
                return visitor.visitChildren(self)




    def importDec(self):

        localctx = attempt2Parser.ImportDecContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_importDec)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(attempt2Parser.IMPORT)
            self.state = 36
            self.match(attempt2Parser.IDENTIFIER)

            self.state = 37
            self.match(attempt2Parser.DOT)
            self.state = 38
            self.match(attempt2Parser.IDENTIFIER)
            self.state = 40
            self.match(attempt2Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassDecContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Modifier(self):
            return self.getToken(attempt2Parser.Modifier, 0)

        def CLASS(self):
            return self.getToken(attempt2Parser.CLASS, 0)

        def IDENTIFIER(self):
            return self.getToken(attempt2Parser.IDENTIFIER, 0)

        def Body(self):
            return self.getToken(attempt2Parser.Body, 0)

        def Extends(self):
            return self.getToken(attempt2Parser.Extends, 0)

        def getRuleIndex(self):
            return attempt2Parser.RULE_classDec

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassDec" ):
                listener.enterClassDec(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassDec" ):
                listener.exitClassDec(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassDec" ):
                return visitor.visitClassDec(self)
            else:
                return visitor.visitChildren(self)




    def classDec(self):

        localctx = attempt2Parser.ClassDecContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_classDec)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            self.match(attempt2Parser.Modifier)
            self.state = 43
            self.match(attempt2Parser.CLASS)
            self.state = 44
            self.match(attempt2Parser.IDENTIFIER)
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==attempt2Parser.Extends:
                self.state = 45
                self.match(attempt2Parser.Extends)


            self.state = 48
            self.match(attempt2Parser.Body)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





