from antlr4 import *
from utils.jcpLexer import jcpLexer
from utils.jcpListener import jcpListener
from utils.jcpParser import jcpParser
import sys

class JCPListener(jcpListener):
    def enterStart(self, ctx):
        print(ctx.getText() + '\n')

def main():
    with open('ExampleJava/src/Main.java') as f:
        lines = f.read()
    lexer = jcpLexer(InputStream(lines))
    # lexer = attempt2Lexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = jcpParser(stream)
    tree = parser.start()
    printer = JCPListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()