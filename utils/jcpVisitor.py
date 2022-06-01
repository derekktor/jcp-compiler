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


    # Visit a parse tree produced by JCPParser#packageDec.
    def visitPackageDec(self, ctx:JCPParser.PackageDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#importDec.
    def visitImportDec(self, ctx:JCPParser.ImportDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#classDec.
    def visitClassDec(self, ctx:JCPParser.ClassDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#modifier.
    def visitModifier(self, ctx:JCPParser.ModifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#extendsDec.
    def visitExtendsDec(self, ctx:JCPParser.ExtendsDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#body.
    def visitBody(self, ctx:JCPParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#bodyDec.
    def visitBodyDec(self, ctx:JCPParser.BodyDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#methodDec.
    def visitMethodDec(self, ctx:JCPParser.MethodDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#block.
    def visitBlock(self, ctx:JCPParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#blockDec.
    def visitBlockDec(self, ctx:JCPParser.BlockDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#localDec.
    def visitLocalDec(self, ctx:JCPParser.LocalDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#memberDec.
    def visitMemberDec(self, ctx:JCPParser.MemberDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#type.
    def visitType(self, ctx:JCPParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#primitiveType.
    def visitPrimitiveType(self, ctx:JCPParser.PrimitiveTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#numericType.
    def visitNumericType(self, ctx:JCPParser.NumericTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#integralType.
    def visitIntegralType(self, ctx:JCPParser.IntegralTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#floatingPointType.
    def visitFloatingPointType(self, ctx:JCPParser.FloatingPointTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#feferenceType.
    def visitFeferenceType(self, ctx:JCPParser.FeferenceTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#classType.
    def visitClassType(self, ctx:JCPParser.ClassTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#constructorDec.
    def visitConstructorDec(self, ctx:JCPParser.ConstructorDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#parameters.
    def visitParameters(self, ctx:JCPParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#parameter.
    def visitParameter(self, ctx:JCPParser.ParameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#constructorBody.
    def visitConstructorBody(self, ctx:JCPParser.ConstructorBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#constructorInvocation.
    def visitConstructorInvocation(self, ctx:JCPParser.ConstructorInvocationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#argument.
    def visitArgument(self, ctx:JCPParser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#statement.
    def visitStatement(self, ctx:JCPParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#forInit.
    def visitForInit(self, ctx:JCPParser.ForInitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#forUpdate.
    def visitForUpdate(self, ctx:JCPParser.ForUpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#expression.
    def visitExpression(self, ctx:JCPParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#assignment.
    def visitAssignment(self, ctx:JCPParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#leftHandSide.
    def visitLeftHandSide(self, ctx:JCPParser.LeftHandSideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#fieldAccess.
    def visitFieldAccess(self, ctx:JCPParser.FieldAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#arrayAccess.
    def visitArrayAccess(self, ctx:JCPParser.ArrayAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#conditionalExpression.
    def visitConditionalExpression(self, ctx:JCPParser.ConditionalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#orExpression.
    def visitOrExpression(self, ctx:JCPParser.OrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#andExpression.
    def visitAndExpression(self, ctx:JCPParser.AndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#equalityExpression.
    def visitEqualityExpression(self, ctx:JCPParser.EqualityExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#relationalExpression.
    def visitRelationalExpression(self, ctx:JCPParser.RelationalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:JCPParser.AdditiveExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:JCPParser.MultiplicativeExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#unaireExpression.
    def visitUnaireExpression(self, ctx:JCPParser.UnaireExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#unaryExpression.
    def visitUnaryExpression(self, ctx:JCPParser.UnaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JCPParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:JCPParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)



del JCPParser