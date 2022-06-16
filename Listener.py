from utils.jcpListener import jcpListener
from utils.jcpParser import jcpParser

class Listener(jcpListener):
    def __init__(self, output):
        self.output = output
        self.output.write('#include <iostream>\n\n')
        self.tab = 0
        self.nl = False
    
    def write(self, text):
        if(self.nl):
            for i in range(self.tab):
                self.output.write('\t')
        self.output.write(text)
        self.nl = text.endswith('\n')

    def enterImportDec(self, ctx: jcpParser.ImportDecContext):
        self.write("#include <" + ctx.getChild(1).getText() + ">\n")

    def enterClassDec(self, ctx: jcpParser.ClassDecContext):
        self.write(ctx.CLASS().getText() + ' ' + ctx.IDENTIFIER().getText())

    def exitClassDec(self, ctx: jcpParser.ClassDecContext):
        self.write('};\n')
    
    def enterExtendsDec(self, ctx: jcpParser.ExtendsDecContext):
        self.write(' : ' + ctx.IDENTIFIER().getText())

    def enterBody(self, ctx: jcpParser.BodyContext):
        self.write(' {\n')
        self.tab+=1
    
    def exitBody(self, ctx):
        self.tab-=1

    def enterMemberDec(self, ctx: jcpParser.MemberDecContext):
        if ctx.modifier() is not None:
            self.write(ctx.modifier().getText()+':\n')

    def enterLocalDec(self, ctx: jcpParser.LocalDecContext):
        self.write(self.getTypeText(ctx.type_())+' '+ctx.IDENTIFIER().getText())

    def enterAssign(self, ctx: jcpParser.AssignContext):
        self.write(' = '+ctx.rightHandSide().getText())

    def enterAssignment(self, ctx: jcpParser.AssignmentContext):
        self.write(ctx.leftHandSide().getText())

    def exitAssignment(self, ctx: jcpParser.AssignmentContext):
        self.write(';\n')
    
    def exitLocalDec(self, ctx: jcpParser.LocalDecContext):
        self.write(';\n')

    def getTypeText(self, ctx: jcpParser.TypeContext):
        if(ctx.getText()=='String'):
            return 'std::string'
        elif(ctx.getText()=='boolean'):
            return 'bool'
        else:
            return ctx.getText()

    def enterMethodDec(self, ctx: jcpParser.MethodDecContext):
        if ctx.modifier() is not None:
            self.write(ctx.modifier().getText()+ ':\n')
        if ctx.STATIC() is not None:
            self.write(ctx.STATIC().getText()+ ' ')
        self.write(self.getTypeText(ctx.type_())+' '+ctx.IDENTIFIER().getText())
        self.tab+=1

    def printParameter(self, parameter):
        self.write(self.getTypeText(parameter.type_()))
        self.write(' '+parameter.IDENTIFIER().getText())
        if parameter.LBRACK() is not None: self.write('[')
        if parameter.RBRACK() is not None: self.write(']')

    def enterParameters(self, ctx: jcpParser.ParametersContext):
        self.write('(')
        for i in range(0, len(ctx.parameter())):
            self.printParameter(ctx.parameter(i))
            if i != len(ctx.parameter()) - 1:
                self.write(', ')
        self.write(') {\n')


    def exitMethodDec(self, ctx: jcpParser.MethodDecContext):
        self.tab-=1
        self.write('}\n')
    
    # def enterStatement(self, ctx: jcpParser.StatementContext):
    #     self.write(ctx.getText())
    #     self.write('\n')

    def enterReturnStatement(self, ctx: jcpParser.ReturnStatementContext):
        self.write('return '+ctx.expression().getText()+';\n')  

    def enterSout(self, ctx: jcpParser.SoutContext):
        self.write('std::cout << '+ctx.expression().getText()+' << std::endl;\n')

    def enterConstructorDec(self, ctx: jcpParser.ConstructorDecContext):
        if ctx.modifier() is not None:
            self.write(ctx.modifier().getText()+ ':\n')
        self.write(ctx.IDENTIFIER().getText())
        self.tab+=1

    def exitConstructorDec(self, ctx):
        self.tab-=1
        self.write('}\n')

    def enterIfStatement(self, ctx: jcpParser.IfStatementContext):
        self.write('if('+ctx.expression().getText()+') {\n')
        self.tab+=1
    
    def exitIfStatement(self, ctx: jcpParser.IfStatementContext):
        self.tab-=1
        self.write('}\n')
    
    def enterElseStatement(self, ctx: jcpParser.ElseStatementContext):
        self.write('else {\n')
        self.tab+=1
    
    def exitElseStatement(self, ctx: jcpParser.ElseStatementContext):
        self.tab-=1
        self.write('}\n')

    def exitStart(self, ctx: jcpParser.StartContext):
        self.write('\nint main() {\n')
        self.write('\tMain::main({});\n')
        self.write('\treturn 0;\n}\n')
