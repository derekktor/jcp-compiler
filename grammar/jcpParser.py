# Generated from jcp.g4 by ANTLR 4.10.1
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
        4,1,5,11,2,0,7,0,1,0,1,0,1,0,1,0,1,0,1,0,3,0,9,8,0,1,0,0,0,1,0,0,
        0,11,0,8,1,0,0,0,2,9,5,4,0,0,3,9,5,5,0,0,4,5,5,1,0,0,5,6,3,0,0,0,
        6,7,5,2,0,0,7,9,1,0,0,0,8,2,1,0,0,0,8,3,1,0,0,0,8,4,1,0,0,0,9,1,
        1,0,0,0,1,8
    ]

class jcpParser ( Parser ):

    grammarFileName = "jcp.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "WS", "INT", 
                      "LETTER" ]

    RULE_expr = 0

    ruleNames =  [ "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    WS=3
    INT=4
    LETTER=5

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.atom = None # Token

        def INT(self):
            return self.getToken(jcpParser.INT, 0)

        def LETTER(self):
            return self.getToken(jcpParser.LETTER, 0)

        def expr(self):
            return self.getTypedRuleContext(jcpParser.ExprContext,0)


        def getRuleIndex(self):
            return jcpParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = jcpParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_expr)
        try:
            self.state = 8
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [jcpParser.INT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 2
                localctx.atom = self.match(jcpParser.INT)
                pass
            elif token in [jcpParser.LETTER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 3
                localctx.atom = self.match(jcpParser.LETTER)
                pass
            elif token in [jcpParser.T__0]:
                self.enterOuterAlt(localctx, 3)
                self.state = 4
                self.match(jcpParser.T__0)
                self.state = 5
                self.expr()
                self.state = 6
                self.match(jcpParser.T__1)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





