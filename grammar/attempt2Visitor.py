# Generated from attempt2.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .attempt2Parser import attempt2Parser
else:
    from attempt2Parser import attempt2Parser

# This class defines a complete generic visitor for a parse tree produced by attempt2Parser.

class attempt2Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by attempt2Parser#start.
    def visitStart(self, ctx:attempt2Parser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by attempt2Parser#packageDec.
    def visitPackageDec(self, ctx:attempt2Parser.PackageDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by attempt2Parser#importDec.
    def visitImportDec(self, ctx:attempt2Parser.ImportDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by attempt2Parser#classDec.
    def visitClassDec(self, ctx:attempt2Parser.ClassDecContext):
        return self.visitChildren(ctx)



del attempt2Parser