from antlr4 import *
from utils.jcpLexer import JCPLexer
from utils.JCPListener import JCPListener
from utils.JCPParser import JCPParser
import sys

class JCPListener(JCPListener):
    def enterStart(self, ctx):
        print(ctx.getText() + '\n')

def main():
    with open('ExampleJava/src/Main.java') as f:
        lines = f.read()
    lexer = JCPLexer(InputStream(lines))
    # lexer = attempt2Lexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = JCPParser(stream)
    tree = parser.start()
    printer = JCPListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()