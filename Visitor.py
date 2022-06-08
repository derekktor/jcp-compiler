from utils.jcpVisitor import jcpVisitor
from utils.jcpParser import jcpParser

class Visitor(jcpVisitor):

    # def visitStart(self, ctx):

    #     return self.visit(ctx.importDec()[0])

    def visitImportDec(self, ctx):
        return "asdasda"

    def visitClassDec(self, ctx: jcpParser.ClassDecContext):
        a = self.visit(ctx.body())
        return (ctx.CLASS().getText() + ' ' + ctx.IDENTIFIER().getText())
    
    # def visitrExtendsDec(self, ctx: jcpParser.ExtendsDecContext):
    #     return (' : ' + ctx.IDENTIFIER().getText())

    # def visitBody(self, ctx: jcpParser.BodyContext):
    #     output = ''
    #     output.write(' '+ctx.LCUR().getText())
    #     for bodyDec in ctx.bodyDec():
    #         output.write(bodyDec.getText())
    #     output.write('\n')
    
    def visitBodyDec(self, ctx: jcpParser.BodyDecContext):
        # self.output.write(ctx.getChild(0).getText() + ' ' + ctx.getChild(1).getText() + ' ' + ctx.getChild(2).getText() + ';\n')
        return 'test'
