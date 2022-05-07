# Generated from jcp.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jcpParser import jcpParser
else:
    from jcpParser import jcpParser

# This class defines a complete listener for a parse tree produced by jcpParser.
class jcpListener(ParseTreeListener):

    # Enter a parse tree produced by jcpParser#expr.
    def enterExpr(self, ctx:jcpParser.ExprContext):
        pass

    # Exit a parse tree produced by jcpParser#expr.
    def exitExpr(self, ctx:jcpParser.ExprContext):
        pass



del jcpParser