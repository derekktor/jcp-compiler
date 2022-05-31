# Generated from jcp.g4 by ANTLR 4.10.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,5,29,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,1,0,1,
        1,1,1,1,2,4,2,17,8,2,11,2,12,2,18,1,2,1,2,1,3,4,3,24,8,3,11,3,12,
        3,25,1,4,1,4,0,0,5,1,1,3,2,5,3,7,4,9,5,1,0,3,3,0,9,10,13,13,32,32,
        1,0,48,57,2,0,65,90,97,122,30,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,
        0,0,7,1,0,0,0,0,9,1,0,0,0,1,11,1,0,0,0,3,13,1,0,0,0,5,16,1,0,0,0,
        7,23,1,0,0,0,9,27,1,0,0,0,11,12,5,40,0,0,12,2,1,0,0,0,13,14,5,41,
        0,0,14,4,1,0,0,0,15,17,7,0,0,0,16,15,1,0,0,0,17,18,1,0,0,0,18,16,
        1,0,0,0,18,19,1,0,0,0,19,20,1,0,0,0,20,21,6,2,0,0,21,6,1,0,0,0,22,
        24,7,1,0,0,23,22,1,0,0,0,24,25,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,
        0,26,8,1,0,0,0,27,28,7,2,0,0,28,10,1,0,0,0,3,0,18,25,1,6,0,0
    ]

class jcpLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    WS = 3
    INT = 4
    LETTER = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'('", "')'" ]

    symbolicNames = [ "<INVALID>",
            "WS", "INT", "LETTER" ]

    ruleNames = [ "T__0", "T__1", "WS", "INT", "LETTER" ]

    grammarFileName = "jcp.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


