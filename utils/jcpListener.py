# Generated from JCP.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JCPParser import JCPParser
else:
    from JCPParser import JCPParser

# This class defines a complete listener for a parse tree produced by JCPParser.
class JCPListener(ParseTreeListener):

    # Enter a parse tree produced by JCPParser#start.
    def enterStart(self, ctx:JCPParser.StartContext):
        pass

    # Exit a parse tree produced by JCPParser#start.
    def exitStart(self, ctx:JCPParser.StartContext):
        pass


    # Enter a parse tree produced by JCPParser#packageDec.
    def enterPackageDec(self, ctx:JCPParser.PackageDecContext):
        pass

    # Exit a parse tree produced by JCPParser#packageDec.
    def exitPackageDec(self, ctx:JCPParser.PackageDecContext):
        pass


    # Enter a parse tree produced by JCPParser#importDec.
    def enterImportDec(self, ctx:JCPParser.ImportDecContext):
        pass

    # Exit a parse tree produced by JCPParser#importDec.
    def exitImportDec(self, ctx:JCPParser.ImportDecContext):
        pass


    # Enter a parse tree produced by JCPParser#classDec.
    def enterClassDec(self, ctx:JCPParser.ClassDecContext):
        pass

    # Exit a parse tree produced by JCPParser#classDec.
    def exitClassDec(self, ctx:JCPParser.ClassDecContext):
        pass


    # Enter a parse tree produced by JCPParser#modifier.
    def enterModifier(self, ctx:JCPParser.ModifierContext):
        pass

    # Exit a parse tree produced by JCPParser#modifier.
    def exitModifier(self, ctx:JCPParser.ModifierContext):
        pass


    # Enter a parse tree produced by JCPParser#extendsDec.
    def enterExtendsDec(self, ctx:JCPParser.ExtendsDecContext):
        pass

    # Exit a parse tree produced by JCPParser#extendsDec.
    def exitExtendsDec(self, ctx:JCPParser.ExtendsDecContext):
        pass


    # Enter a parse tree produced by JCPParser#body.
    def enterBody(self, ctx:JCPParser.BodyContext):
        pass

    # Exit a parse tree produced by JCPParser#body.
    def exitBody(self, ctx:JCPParser.BodyContext):
        pass


    # Enter a parse tree produced by JCPParser#bodyDec.
    def enterBodyDec(self, ctx:JCPParser.BodyDecContext):
        pass

    # Exit a parse tree produced by JCPParser#bodyDec.
    def exitBodyDec(self, ctx:JCPParser.BodyDecContext):
        pass


    # Enter a parse tree produced by JCPParser#methodDec.
    def enterMethodDec(self, ctx:JCPParser.MethodDecContext):
        pass

    # Exit a parse tree produced by JCPParser#methodDec.
    def exitMethodDec(self, ctx:JCPParser.MethodDecContext):
        pass


    # Enter a parse tree produced by JCPParser#block.
    def enterBlock(self, ctx:JCPParser.BlockContext):
        pass

    # Exit a parse tree produced by JCPParser#block.
    def exitBlock(self, ctx:JCPParser.BlockContext):
        pass


    # Enter a parse tree produced by JCPParser#blockDec.
    def enterBlockDec(self, ctx:JCPParser.BlockDecContext):
        pass

    # Exit a parse tree produced by JCPParser#blockDec.
    def exitBlockDec(self, ctx:JCPParser.BlockDecContext):
        pass


    # Enter a parse tree produced by JCPParser#localDec.
    def enterLocalDec(self, ctx:JCPParser.LocalDecContext):
        pass

    # Exit a parse tree produced by JCPParser#localDec.
    def exitLocalDec(self, ctx:JCPParser.LocalDecContext):
        pass


    # Enter a parse tree produced by JCPParser#memberDec.
    def enterMemberDec(self, ctx:JCPParser.MemberDecContext):
        pass

    # Exit a parse tree produced by JCPParser#memberDec.
    def exitMemberDec(self, ctx:JCPParser.MemberDecContext):
        pass


    # Enter a parse tree produced by JCPParser#type.
    def enterType(self, ctx:JCPParser.TypeContext):
        pass

    # Exit a parse tree produced by JCPParser#type.
    def exitType(self, ctx:JCPParser.TypeContext):
        pass


    # Enter a parse tree produced by JCPParser#primitiveType.
    def enterPrimitiveType(self, ctx:JCPParser.PrimitiveTypeContext):
        pass

    # Exit a parse tree produced by JCPParser#primitiveType.
    def exitPrimitiveType(self, ctx:JCPParser.PrimitiveTypeContext):
        pass


    # Enter a parse tree produced by JCPParser#numericType.
    def enterNumericType(self, ctx:JCPParser.NumericTypeContext):
        pass

    # Exit a parse tree produced by JCPParser#numericType.
    def exitNumericType(self, ctx:JCPParser.NumericTypeContext):
        pass


    # Enter a parse tree produced by JCPParser#integralType.
    def enterIntegralType(self, ctx:JCPParser.IntegralTypeContext):
        pass

    # Exit a parse tree produced by JCPParser#integralType.
    def exitIntegralType(self, ctx:JCPParser.IntegralTypeContext):
        pass


    # Enter a parse tree produced by JCPParser#floatingPointType.
    def enterFloatingPointType(self, ctx:JCPParser.FloatingPointTypeContext):
        pass

    # Exit a parse tree produced by JCPParser#floatingPointType.
    def exitFloatingPointType(self, ctx:JCPParser.FloatingPointTypeContext):
        pass


    # Enter a parse tree produced by JCPParser#feferenceType.
    def enterFeferenceType(self, ctx:JCPParser.FeferenceTypeContext):
        pass

    # Exit a parse tree produced by JCPParser#feferenceType.
    def exitFeferenceType(self, ctx:JCPParser.FeferenceTypeContext):
        pass


    # Enter a parse tree produced by JCPParser#classType.
    def enterClassType(self, ctx:JCPParser.ClassTypeContext):
        pass

    # Exit a parse tree produced by JCPParser#classType.
    def exitClassType(self, ctx:JCPParser.ClassTypeContext):
        pass


    # Enter a parse tree produced by JCPParser#constructorDec.
    def enterConstructorDec(self, ctx:JCPParser.ConstructorDecContext):
        pass

    # Exit a parse tree produced by JCPParser#constructorDec.
    def exitConstructorDec(self, ctx:JCPParser.ConstructorDecContext):
        pass


    # Enter a parse tree produced by JCPParser#parameters.
    def enterParameters(self, ctx:JCPParser.ParametersContext):
        pass

    # Exit a parse tree produced by JCPParser#parameters.
    def exitParameters(self, ctx:JCPParser.ParametersContext):
        pass


    # Enter a parse tree produced by JCPParser#parameter.
    def enterParameter(self, ctx:JCPParser.ParameterContext):
        pass

    # Exit a parse tree produced by JCPParser#parameter.
    def exitParameter(self, ctx:JCPParser.ParameterContext):
        pass


    # Enter a parse tree produced by JCPParser#constructorBody.
    def enterConstructorBody(self, ctx:JCPParser.ConstructorBodyContext):
        pass

    # Exit a parse tree produced by JCPParser#constructorBody.
    def exitConstructorBody(self, ctx:JCPParser.ConstructorBodyContext):
        pass


    # Enter a parse tree produced by JCPParser#constructorInvocation.
    def enterConstructorInvocation(self, ctx:JCPParser.ConstructorInvocationContext):
        pass

    # Exit a parse tree produced by JCPParser#constructorInvocation.
    def exitConstructorInvocation(self, ctx:JCPParser.ConstructorInvocationContext):
        pass


    # Enter a parse tree produced by JCPParser#argument.
    def enterArgument(self, ctx:JCPParser.ArgumentContext):
        pass

    # Exit a parse tree produced by JCPParser#argument.
    def exitArgument(self, ctx:JCPParser.ArgumentContext):
        pass


    # Enter a parse tree produced by JCPParser#statement.
    def enterStatement(self, ctx:JCPParser.StatementContext):
        pass

    # Exit a parse tree produced by JCPParser#statement.
    def exitStatement(self, ctx:JCPParser.StatementContext):
        pass


    # Enter a parse tree produced by JCPParser#forInit.
    def enterForInit(self, ctx:JCPParser.ForInitContext):
        pass

    # Exit a parse tree produced by JCPParser#forInit.
    def exitForInit(self, ctx:JCPParser.ForInitContext):
        pass


    # Enter a parse tree produced by JCPParser#forUpdate.
    def enterForUpdate(self, ctx:JCPParser.ForUpdateContext):
        pass

    # Exit a parse tree produced by JCPParser#forUpdate.
    def exitForUpdate(self, ctx:JCPParser.ForUpdateContext):
        pass


    # Enter a parse tree produced by JCPParser#expression.
    def enterExpression(self, ctx:JCPParser.ExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#expression.
    def exitExpression(self, ctx:JCPParser.ExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#assignment.
    def enterAssignment(self, ctx:JCPParser.AssignmentContext):
        pass

    # Exit a parse tree produced by JCPParser#assignment.
    def exitAssignment(self, ctx:JCPParser.AssignmentContext):
        pass


    # Enter a parse tree produced by JCPParser#leftHandSide.
    def enterLeftHandSide(self, ctx:JCPParser.LeftHandSideContext):
        pass

    # Exit a parse tree produced by JCPParser#leftHandSide.
    def exitLeftHandSide(self, ctx:JCPParser.LeftHandSideContext):
        pass


    # Enter a parse tree produced by JCPParser#fieldAccess.
    def enterFieldAccess(self, ctx:JCPParser.FieldAccessContext):
        pass

    # Exit a parse tree produced by JCPParser#fieldAccess.
    def exitFieldAccess(self, ctx:JCPParser.FieldAccessContext):
        pass


    # Enter a parse tree produced by JCPParser#arrayAccess.
    def enterArrayAccess(self, ctx:JCPParser.ArrayAccessContext):
        pass

    # Exit a parse tree produced by JCPParser#arrayAccess.
    def exitArrayAccess(self, ctx:JCPParser.ArrayAccessContext):
        pass


    # Enter a parse tree produced by JCPParser#conditionalExpression.
    def enterConditionalExpression(self, ctx:JCPParser.ConditionalExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#conditionalExpression.
    def exitConditionalExpression(self, ctx:JCPParser.ConditionalExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#orExpression.
    def enterOrExpression(self, ctx:JCPParser.OrExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#orExpression.
    def exitOrExpression(self, ctx:JCPParser.OrExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#andExpression.
    def enterAndExpression(self, ctx:JCPParser.AndExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#andExpression.
    def exitAndExpression(self, ctx:JCPParser.AndExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#equalityExpression.
    def enterEqualityExpression(self, ctx:JCPParser.EqualityExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#equalityExpression.
    def exitEqualityExpression(self, ctx:JCPParser.EqualityExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#relationalExpression.
    def enterRelationalExpression(self, ctx:JCPParser.RelationalExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#relationalExpression.
    def exitRelationalExpression(self, ctx:JCPParser.RelationalExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#additiveExpression.
    def enterAdditiveExpression(self, ctx:JCPParser.AdditiveExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#additiveExpression.
    def exitAdditiveExpression(self, ctx:JCPParser.AdditiveExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#multiplicativeExpression.
    def enterMultiplicativeExpression(self, ctx:JCPParser.MultiplicativeExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#multiplicativeExpression.
    def exitMultiplicativeExpression(self, ctx:JCPParser.MultiplicativeExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#unaireExpression.
    def enterUnaireExpression(self, ctx:JCPParser.UnaireExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#unaireExpression.
    def exitUnaireExpression(self, ctx:JCPParser.UnaireExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#unaryExpression.
    def enterUnaryExpression(self, ctx:JCPParser.UnaryExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#unaryExpression.
    def exitUnaryExpression(self, ctx:JCPParser.UnaryExpressionContext):
        pass


    # Enter a parse tree produced by JCPParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:JCPParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by JCPParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:JCPParser.PrimaryExpressionContext):
        pass



del JCPParser