# Generated from jcp.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jcpParser import jcpParser
else:
    from jcpParser import jcpParser

# This class defines a complete generic visitor for a parse tree produced by jcpParser.

class jcpVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by jcpParser#expr.
    def visitExpr(self, ctx:jcpParser.ExprContext):
        return self.visitChildren(ctx)



del jcpParser