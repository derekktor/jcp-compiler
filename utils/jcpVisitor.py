# Generated from jcp.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jcpParser import jcpParser
else:
    from jcpParser import jcpParser

# This class defines a complete generic visitor for a parse tree produced by jcpParser.

class jcpVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by jcpParser#start.
    def visitStart(self, ctx:jcpParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#packageDec.
    def visitPackageDec(self, ctx:jcpParser.PackageDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#importDec.
    def visitImportDec(self, ctx:jcpParser.ImportDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#classDec.
    def visitClassDec(self, ctx:jcpParser.ClassDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#modifier.
    def visitModifier(self, ctx:jcpParser.ModifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#extendsDec.
    def visitExtendsDec(self, ctx:jcpParser.ExtendsDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#body.
    def visitBody(self, ctx:jcpParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#bodyDec.
    def visitBodyDec(self, ctx:jcpParser.BodyDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#methodDec.
    def visitMethodDec(self, ctx:jcpParser.MethodDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#block.
    def visitBlock(self, ctx:jcpParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#blockDec.
    def visitBlockDec(self, ctx:jcpParser.BlockDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#localDec.
    def visitLocalDec(self, ctx:jcpParser.LocalDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#memberDec.
    def visitMemberDec(self, ctx:jcpParser.MemberDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#type.
    def visitType(self, ctx:jcpParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#primitiveType.
    def visitPrimitiveType(self, ctx:jcpParser.PrimitiveTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#numericType.
    def visitNumericType(self, ctx:jcpParser.NumericTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#integralType.
    def visitIntegralType(self, ctx:jcpParser.IntegralTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#floatingPointType.
    def visitFloatingPointType(self, ctx:jcpParser.FloatingPointTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#referenceType.
    def visitReferenceType(self, ctx:jcpParser.ReferenceTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#classType.
    def visitClassType(self, ctx:jcpParser.ClassTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#classAccess.
    def visitClassAccess(self, ctx:jcpParser.ClassAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#constructorDec.
    def visitConstructorDec(self, ctx:jcpParser.ConstructorDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#parameters.
    def visitParameters(self, ctx:jcpParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#parameter.
    def visitParameter(self, ctx:jcpParser.ParameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#constructorBody.
    def visitConstructorBody(self, ctx:jcpParser.ConstructorBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#constructorInvocation.
    def visitConstructorInvocation(self, ctx:jcpParser.ConstructorInvocationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#argument.
    def visitArgument(self, ctx:jcpParser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#statement.
    def visitStatement(self, ctx:jcpParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#returnStatement.
    def visitReturnStatement(self, ctx:jcpParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#sout.
    def visitSout(self, ctx:jcpParser.SoutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#forInit.
    def visitForInit(self, ctx:jcpParser.ForInitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#forUpdate.
    def visitForUpdate(self, ctx:jcpParser.ForUpdateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#expression.
    def visitExpression(self, ctx:jcpParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#assignment.
    def visitAssignment(self, ctx:jcpParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#assign.
    def visitAssign(self, ctx:jcpParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#rightHandSide.
    def visitRightHandSide(self, ctx:jcpParser.RightHandSideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#leftHandSide.
    def visitLeftHandSide(self, ctx:jcpParser.LeftHandSideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#fieldAccess.
    def visitFieldAccess(self, ctx:jcpParser.FieldAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#arrayAccess.
    def visitArrayAccess(self, ctx:jcpParser.ArrayAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#conditionalExpression.
    def visitConditionalExpression(self, ctx:jcpParser.ConditionalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#orExpression.
    def visitOrExpression(self, ctx:jcpParser.OrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#andExpression.
    def visitAndExpression(self, ctx:jcpParser.AndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#equalityExpression.
    def visitEqualityExpression(self, ctx:jcpParser.EqualityExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#relationalExpression.
    def visitRelationalExpression(self, ctx:jcpParser.RelationalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:jcpParser.AdditiveExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:jcpParser.MultiplicativeExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#unaryExpression.
    def visitUnaryExpression(self, ctx:jcpParser.UnaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jcpParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:jcpParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)



del jcpParser