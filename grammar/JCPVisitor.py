# Generated from JCP.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JCPParser import JCPParser
else:
    from JCPParser import JCPParser

# This class defines a complete generic visitor for a parse tree produced by JCPParser.

class JCPVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JCPParser#start.
    def visitStart(self, ctx:JCPParser.StartContext):
        return self.visitChildren(ctx)



del JCPParser