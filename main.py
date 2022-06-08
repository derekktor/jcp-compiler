from antlr4 import *
from utils.jcpLexer import jcpLexer
from utils.jcpParser import jcpParser
from Listener import Listener
from Visitor import Visitor
from utils.jcpVisitor import jcpVisitor
import sys

def main():
    with open('example.java') as f:
        lines = f.read()
    lexer = jcpLexer(InputStream(lines))
    # lexer = attempt2Lexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = jcpParser(stream)
    tree = parser.start()
    printer = Listener(sys.stdout)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    # visitor = Visitor()
    # output = visitor.visit(tree)
    # print(output)

if __name__ == '__main__':
    main()