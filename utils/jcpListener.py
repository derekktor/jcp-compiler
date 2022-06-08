# Generated from jcp.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jcpParser import jcpParser
else:
    from jcpParser import jcpParser

# This class defines a complete listener for a parse tree produced by jcpParser.
class jcpListener(ParseTreeListener):
    def __init__(self, output):
        self.output = output
        self.output.write("#include <iostream>\n")

    # Enter a parse tree produced by jcpParser#start.
    def enterStart(self, ctx:jcpParser.StartContext):
        pass

    # Exit a parse tree produced by jcpParser#start.
    def exitStart(self, ctx:jcpParser.StartContext):
        pass


    # Enter a parse tree produced by jcpParser#packageDec.
    def enterPackageDec(self, ctx:jcpParser.PackageDecContext):
        pass

    # Exit a parse tree produced by jcpParser#packageDec.
    def exitPackageDec(self, ctx:jcpParser.PackageDecContext):
        pass


    # Enter a parse tree produced by jcpParser#packageName.
    def enterPackageName(self, ctx:jcpParser.PackageNameContext):
        pass

    # Exit a parse tree produced by jcpParser#packageName.
    def exitPackageName(self, ctx:jcpParser.PackageNameContext):
        pass


    # Enter a parse tree produced by jcpParser#importDec.
    def enterImportDec(self, ctx:jcpParser.ImportDecContext):
        self.output.write("#include <" + ctx.importName() + ">\n")

    # Exit a parse tree produced by jcpParser#importDec.
    def exitImportDec(self, ctx:jcpParser.ImportDecContext):
        pass


    # Enter a parse tree produced by jcpParser#importName.
    def enterImportName(self, ctx:jcpParser.ImportNameContext):
        pass

    # Exit a parse tree produced by jcpParser#importName.
    def exitImportName(self, ctx:jcpParser.ImportNameContext):
        pass


    # Enter a parse tree produced by jcpParser#classDec.
    def enterClassDec(self, ctx:jcpParser.ClassDecContext):
        self.output.write(ctx.CLASS().getText() + " " + ctx.className().getText())

    # Exit a parse tree produced by jcpParser#classDec.
    def exitClassDec(self, ctx:jcpParser.ClassDecContext):
        self.output.write("};\n")


    # Enter a parse tree produced by jcpParser#className.
    def enterClassName(self, ctx:jcpParser.ClassNameContext):
        pass

    # Exit a parse tree produced by jcpParser#className.
    def exitClassName(self, ctx:jcpParser.ClassNameContext):
        pass


    # Enter a parse tree produced by jcpParser#modifier.
    def enterModifier(self, ctx:jcpParser.ModifierContext):
        pass

    # Exit a parse tree produced by jcpParser#modifier.
    def exitModifier(self, ctx:jcpParser.ModifierContext):
        pass


    # Enter a parse tree produced by jcpParser#extendsDec.
    def enterExtendsDec(self, ctx:jcpParser.ExtendsDecContext):
        self.output.write(' : ' + ctx.IDENTIFIER().getText())

    # Exit a parse tree produced by jcpParser#extendsDec.
    def exitExtendsDec(self, ctx:jcpParser.ExtendsDecContext):
        pass


    # Enter a parse tree produced by jcpParser#parentClassName.
    def enterParentClassName(self, ctx:jcpParser.ParentClassNameContext):
        pass

    # Exit a parse tree produced by jcpParser#parentClassName.
    def exitParentClassName(self, ctx:jcpParser.ParentClassNameContext):
        pass


    # Enter a parse tree produced by jcpParser#body.
    def enterBody(self, ctx:jcpParser.BodyContext):
        self.output.write(' {\n')

    # Exit a parse tree produced by jcpParser#body.
    def exitBody(self, ctx:jcpParser.BodyContext):
        pass


    # Enter a parse tree produced by jcpParser#bodyDec.
    def enterBodyDec(self, ctx:jcpParser.BodyDecContext):
        pass

    # Exit a parse tree produced by jcpParser#bodyDec.
    def exitBodyDec(self, ctx:jcpParser.BodyDecContext):
        pass


    # Enter a parse tree produced by jcpParser#methodDec.
    def enterMethodDec(self, ctx:jcpParser.MethodDecContext):
        if ctx.modifier() is not None:
            self.output.write(ctx.modifier().getText()+ ':\n')
        self.output.write(ctx.type_().getText()+' '+ctx.IDENTIFIER().getText())

    # Exit a parse tree produced by jcpParser#methodDec.
    def exitMethodDec(self, ctx:jcpParser.MethodDecContext):
        self.output.write('}\n')


    # Enter a parse tree produced by jcpParser#methodName.
    def enterMethodName(self, ctx:jcpParser.MethodNameContext):
        pass

    # Exit a parse tree produced by jcpParser#methodName.
    def exitMethodName(self, ctx:jcpParser.MethodNameContext):
        pass


    # Enter a parse tree produced by jcpParser#block.
    def enterBlock(self, ctx:jcpParser.BlockContext):
        pass

    # Exit a parse tree produced by jcpParser#block.
    def exitBlock(self, ctx:jcpParser.BlockContext):
        pass


    # Enter a parse tree produced by jcpParser#blockDec.
    def enterBlockDec(self, ctx:jcpParser.BlockDecContext):
        pass

    # Exit a parse tree produced by jcpParser#blockDec.
    def exitBlockDec(self, ctx:jcpParser.BlockDecContext):
        pass


    # Enter a parse tree produced by jcpParser#localDec.
    def enterLocalDec(self, ctx:jcpParser.LocalDecContext):
        self.output.write(ctx.type_().getText()+' '+ctx.IDENTIFIER().getText())

    # Exit a parse tree produced by jcpParser#localDec.
    def exitLocalDec(self, ctx:jcpParser.LocalDecContext):
        self.output.write(';\n')


    # Enter a parse tree produced by jcpParser#memberDec.
    def enterMemberDec(self, ctx:jcpParser.MemberDecContext):
        self.output.write(ctx.modifier().getText()+':\n')
        self.output.write(ctx.type_().getText()+' '+ctx.IDENTIFIER().getText()+';\n')

    # Exit a parse tree produced by jcpParser#memberDec.
    def exitMemberDec(self, ctx:jcpParser.MemberDecContext):
        pass


    # Enter a parse tree produced by jcpParser#type.
    def enterType(self, ctx:jcpParser.TypeContext):
        pass

    # Exit a parse tree produced by jcpParser#type.
    def exitType(self, ctx:jcpParser.TypeContext):
        pass


    # Enter a parse tree produced by jcpParser#primitiveType.
    def enterPrimitiveType(self, ctx:jcpParser.PrimitiveTypeContext):
        pass

    # Exit a parse tree produced by jcpParser#primitiveType.
    def exitPrimitiveType(self, ctx:jcpParser.PrimitiveTypeContext):
        pass


    # Enter a parse tree produced by jcpParser#numericType.
    def enterNumericType(self, ctx:jcpParser.NumericTypeContext):
        pass

    # Exit a parse tree produced by jcpParser#numericType.
    def exitNumericType(self, ctx:jcpParser.NumericTypeContext):
        pass


    # Enter a parse tree produced by jcpParser#integralType.
    def enterIntegralType(self, ctx:jcpParser.IntegralTypeContext):
        pass

    # Exit a parse tree produced by jcpParser#integralType.
    def exitIntegralType(self, ctx:jcpParser.IntegralTypeContext):
        pass


    # Enter a parse tree produced by jcpParser#floatingPointType.
    def enterFloatingPointType(self, ctx:jcpParser.FloatingPointTypeContext):
        pass

    # Exit a parse tree produced by jcpParser#floatingPointType.
    def exitFloatingPointType(self, ctx:jcpParser.FloatingPointTypeContext):
        pass


    # Enter a parse tree produced by jcpParser#referenceType.
    def enterReferenceType(self, ctx:jcpParser.ReferenceTypeContext):
        pass

    # Exit a parse tree produced by jcpParser#referenceType.
    def exitReferenceType(self, ctx:jcpParser.ReferenceTypeContext):
        pass


    # Enter a parse tree produced by jcpParser#classType.
    def enterClassType(self, ctx:jcpParser.ClassTypeContext):
        pass

    # Exit a parse tree produced by jcpParser#classType.
    def exitClassType(self, ctx:jcpParser.ClassTypeContext):
        pass


    # Enter a parse tree produced by jcpParser#classAccess.
    def enterClassAccess(self, ctx:jcpParser.ClassAccessContext):
        pass

    # Exit a parse tree produced by jcpParser#classAccess.
    def exitClassAccess(self, ctx:jcpParser.ClassAccessContext):
        pass


    # Enter a parse tree produced by jcpParser#constructorDec.
    def enterConstructorDec(self, ctx:jcpParser.ConstructorDecContext):
        pass

    # Exit a parse tree produced by jcpParser#constructorDec.
    def exitConstructorDec(self, ctx:jcpParser.ConstructorDecContext):
        pass

    def printParameter(self, parameter):
        self.output.write(parameter.type_().getText())
        if parameter.LBRACK() is not None: self.output.write('[')
        if parameter.RBRACK() is not None: self.output.write(']')
        self.output.write(' '+parameter.IDENTIFIER().getText())

    # Enter a parse tree produced by jcpParser#parameters.
    def enterParameters(self, ctx:jcpParser.ParametersContext):
        self.output.write('(')
        for i in range(0, len(ctx.parameter())):
            self.printParameter(ctx.parameter(i))
            if i != len(ctx.parameter()) - 1:
                self.output.write(', ')
        self.output.write(') {\n')

    # Exit a parse tree produced by jcpParser#parameters.
    def exitParameters(self, ctx:jcpParser.ParametersContext):
        pass


    # Enter a parse tree produced by jcpParser#parameter.
    def enterParameter(self, ctx:jcpParser.ParameterContext):
        pass

    # Exit a parse tree produced by jcpParser#parameter.
    def exitParameter(self, ctx:jcpParser.ParameterContext):
        pass


    # Enter a parse tree produced by jcpParser#constructorBody.
    def enterConstructorBody(self, ctx:jcpParser.ConstructorBodyContext):
        pass

    # Exit a parse tree produced by jcpParser#constructorBody.
    def exitConstructorBody(self, ctx:jcpParser.ConstructorBodyContext):
        pass


    # Enter a parse tree produced by jcpParser#constructorInvocation.
    def enterConstructorInvocation(self, ctx:jcpParser.ConstructorInvocationContext):
        pass

    # Exit a parse tree produced by jcpParser#constructorInvocation.
    def exitConstructorInvocation(self, ctx:jcpParser.ConstructorInvocationContext):
        pass


    # Enter a parse tree produced by jcpParser#argument.
    def enterArgument(self, ctx:jcpParser.ArgumentContext):
        pass

    # Exit a parse tree produced by jcpParser#argument.
    def exitArgument(self, ctx:jcpParser.ArgumentContext):
        pass


    # Enter a parse tree produced by jcpParser#statement.
    def enterStatement(self, ctx:jcpParser.StatementContext):
        pass

    # Exit a parse tree produced by jcpParser#statement.
    def exitStatement(self, ctx:jcpParser.StatementContext):
        pass


    # Enter a parse tree produced by jcpParser#simpleStatement.
    def enterSimpleStatement(self, ctx:jcpParser.SimpleStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#simpleStatement.
    def exitSimpleStatement(self, ctx:jcpParser.SimpleStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#ifStatement.
    def enterIfStatement(self, ctx:jcpParser.IfStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#ifStatement.
    def exitIfStatement(self, ctx:jcpParser.IfStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#condition.
    def enterCondition(self, ctx:jcpParser.ConditionContext):
        pass

    # Exit a parse tree produced by jcpParser#condition.
    def exitCondition(self, ctx:jcpParser.ConditionContext):
        pass


    # Enter a parse tree produced by jcpParser#elseStatement.
    def enterElseStatement(self, ctx:jcpParser.ElseStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#elseStatement.
    def exitElseStatement(self, ctx:jcpParser.ElseStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#forStatement.
    def enterForStatement(self, ctx:jcpParser.ForStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#forStatement.
    def exitForStatement(self, ctx:jcpParser.ForStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#forControl.
    def enterForControl(self, ctx:jcpParser.ForControlContext):
        pass

    # Exit a parse tree produced by jcpParser#forControl.
    def exitForControl(self, ctx:jcpParser.ForControlContext):
        pass


    # Enter a parse tree produced by jcpParser#forInit.
    def enterForInit(self, ctx:jcpParser.ForInitContext):
        pass

    # Exit a parse tree produced by jcpParser#forInit.
    def exitForInit(self, ctx:jcpParser.ForInitContext):
        pass


    # Enter a parse tree produced by jcpParser#forCondition.
    def enterForCondition(self, ctx:jcpParser.ForConditionContext):
        pass

    # Exit a parse tree produced by jcpParser#forCondition.
    def exitForCondition(self, ctx:jcpParser.ForConditionContext):
        pass


    # Enter a parse tree produced by jcpParser#forUpdate.
    def enterForUpdate(self, ctx:jcpParser.ForUpdateContext):
        pass

    # Exit a parse tree produced by jcpParser#forUpdate.
    def exitForUpdate(self, ctx:jcpParser.ForUpdateContext):
        pass


    # Enter a parse tree produced by jcpParser#whileStatement.
    def enterWhileStatement(self, ctx:jcpParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#whileStatement.
    def exitWhileStatement(self, ctx:jcpParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#doStatement.
    def enterDoStatement(self, ctx:jcpParser.DoStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#doStatement.
    def exitDoStatement(self, ctx:jcpParser.DoStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#breakStatement.
    def enterBreakStatement(self, ctx:jcpParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#breakStatement.
    def exitBreakStatement(self, ctx:jcpParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#continueStatement.
    def enterContinueStatement(self, ctx:jcpParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by jcpParser#continueStatement.
    def exitContinueStatement(self, ctx:jcpParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#returnStatement.
    def enterReturnStatement(self, ctx:jcpParser.ReturnStatementContext):
        self.output.write('return '+ctx.expression().getText()+';\n') 

    # Exit a parse tree produced by jcpParser#returnStatement.
    def exitReturnStatement(self, ctx:jcpParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by jcpParser#sout.
    def enterSout(self, ctx:jcpParser.SoutContext):
        self.output.write('std::cout << '+ctx.expression().getText()+';\n')

    # Exit a parse tree produced by jcpParser#sout.
    def exitSout(self, ctx:jcpParser.SoutContext):
        pass


    # Enter a parse tree produced by jcpParser#expression.
    def enterExpression(self, ctx:jcpParser.ExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#expression.
    def exitExpression(self, ctx:jcpParser.ExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#assignment.
    def enterAssignment(self, ctx:jcpParser.AssignmentContext):
        pass

    # Exit a parse tree produced by jcpParser#assignment.
    def exitAssignment(self, ctx:jcpParser.AssignmentContext):
        pass


    # Enter a parse tree produced by jcpParser#assign.
    def enterAssign(self, ctx:jcpParser.AssignContext):
        self.output.write(' = '+ctx.rightHandSide().getText())

    # Exit a parse tree produced by jcpParser#assign.
    def exitAssign(self, ctx:jcpParser.AssignContext):
        pass


    # Enter a parse tree produced by jcpParser#rightHandSide.
    def enterRightHandSide(self, ctx:jcpParser.RightHandSideContext):
        pass

    # Exit a parse tree produced by jcpParser#rightHandSide.
    def exitRightHandSide(self, ctx:jcpParser.RightHandSideContext):
        pass


    # Enter a parse tree produced by jcpParser#leftHandSide.
    def enterLeftHandSide(self, ctx:jcpParser.LeftHandSideContext):
        pass

    # Exit a parse tree produced by jcpParser#leftHandSide.
    def exitLeftHandSide(self, ctx:jcpParser.LeftHandSideContext):
        pass


    # Enter a parse tree produced by jcpParser#fieldAccess.
    def enterFieldAccess(self, ctx:jcpParser.FieldAccessContext):
        pass

    # Exit a parse tree produced by jcpParser#fieldAccess.
    def exitFieldAccess(self, ctx:jcpParser.FieldAccessContext):
        pass


    # Enter a parse tree produced by jcpParser#arrayAccess.
    def enterArrayAccess(self, ctx:jcpParser.ArrayAccessContext):
        pass

    # Exit a parse tree produced by jcpParser#arrayAccess.
    def exitArrayAccess(self, ctx:jcpParser.ArrayAccessContext):
        pass


    # Enter a parse tree produced by jcpParser#conditionalExpression.
    def enterConditionalExpression(self, ctx:jcpParser.ConditionalExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#conditionalExpression.
    def exitConditionalExpression(self, ctx:jcpParser.ConditionalExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#orExpression.
    def enterOrExpression(self, ctx:jcpParser.OrExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#orExpression.
    def exitOrExpression(self, ctx:jcpParser.OrExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#andExpression.
    def enterAndExpression(self, ctx:jcpParser.AndExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#andExpression.
    def exitAndExpression(self, ctx:jcpParser.AndExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#equalityExpression.
    def enterEqualityExpression(self, ctx:jcpParser.EqualityExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#equalityExpression.
    def exitEqualityExpression(self, ctx:jcpParser.EqualityExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#relationalExpression.
    def enterRelationalExpression(self, ctx:jcpParser.RelationalExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#relationalExpression.
    def exitRelationalExpression(self, ctx:jcpParser.RelationalExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#additiveExpression.
    def enterAdditiveExpression(self, ctx:jcpParser.AdditiveExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#additiveExpression.
    def exitAdditiveExpression(self, ctx:jcpParser.AdditiveExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#multiplicativeExpression.
    def enterMultiplicativeExpression(self, ctx:jcpParser.MultiplicativeExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#multiplicativeExpression.
    def exitMultiplicativeExpression(self, ctx:jcpParser.MultiplicativeExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#unaryExpression.
    def enterUnaryExpression(self, ctx:jcpParser.UnaryExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#unaryExpression.
    def exitUnaryExpression(self, ctx:jcpParser.UnaryExpressionContext):
        pass


    # Enter a parse tree produced by jcpParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:jcpParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by jcpParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:jcpParser.PrimaryExpressionContext):
        pass

    
    


del jcpParser