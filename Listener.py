from utils.jcpListener import jcpListener
from utils.jcpParser import jcpParser

class Listener(jcpListener):
    def __init__(self, output):
        self.output = output
        self.output.write('#include <iostream>\n')

    def enterImportDec(self, ctx: jcpParser.ImportDecContext):
        self.output.write("#include <" + ctx.getChild(1).getText() + ">\n")

    def enterClassDec(self, ctx: jcpParser.ClassDecContext):
        self.output.write(ctx.CLASS().getText() + ' ' + ctx.IDENTIFIER().getText())

    def exitClassDec(self, ctx: jcpParser.ClassDecContext):
        self.output.write('};\n')
    
    def enterExtendsDec(self, ctx: jcpParser.ExtendsDecContext):
        self.output.write(' : ' + ctx.IDENTIFIER().getText())

    def enterBody(self, ctx: jcpParser.BodyContext):
        self.output.write(' {\n')


    def enterMemberDec(self, ctx: jcpParser.MemberDecContext):
        self.output.write(ctx.modifier().getText()+':\n')
        self.output.write(ctx.type_().getText()+' '+ctx.IDENTIFIER().getText()+';\n')

    def enterLocalDec(self, ctx: jcpParser.LocalDecContext):
        self.output.write(ctx.type_().getText()+' '+ctx.IDENTIFIER().getText())

    def enterAssign(self, ctx: jcpParser.AssignContext):
        self.output.write(' = '+ctx.rightHandSide().getText())
    
    def exitLocalDec(self, ctx: jcpParser.LocalDecContext):
        self.output.write(';\n')

    def enterMethodDec(self, ctx: jcpParser.MethodDecContext):
        if ctx.modifier() is not None:
            self.output.write(ctx.modifier().getText()+ ':\n')
        self.output.write(ctx.type_().getText()+' '+ctx.IDENTIFIER().getText())

    def printParameter(self, parameter):
        self.output.write(parameter.type_().getText())
        if parameter.LBRACK() is not None: self.output.write('[')
        if parameter.RBRACK() is not None: self.output.write(']')
        self.output.write(' '+parameter.IDENTIFIER().getText())

    def enterParameters(self, ctx: jcpParser.ParametersContext):
        self.output.write('(')
        for i in range(0, len(ctx.parameter())):
            self.printParameter(ctx.parameter(i))
            if i != len(ctx.parameter()) - 1:
                self.output.write(', ')
        self.output.write(') {\n')


    def exitMethodDec(self, ctx: jcpParser.MethodDecContext):
        self.output.write('}\n')
    
    # def enterStatement(self, ctx: jcpParser.StatementContext):
    #     self.output.write(ctx.getText())
    #     self.output.write('\n')

    def enterReturnStatement(self, ctx: jcpParser.ReturnStatementContext):
        self.output.write('return '+ctx.expression().getText()+';\n')  

    def enterSout(self, ctx: jcpParser.SoutContext):
        self.output.write('std::cout << '+ctx.expression().getText()+';\n')
