from antlr4 import *
from utils.jcpLexer import jcpLexer
from utils.jcpParser import jcpParser
from utils.jcpListener import jcpListener
from utils.jcpVisitor import jcpVisitor
import sys

def main():
    dir = "examples/"
    files = ["comments", "constructors", "dataTypes", "helloWorld", "ifElse", "import", "loops", "operators", "stringVariables", "switch"]

    path = str(dir + files[4] + ".java");

    with open(path) as f:
        lines = f.read()
    lexer = jcpLexer(InputStream(lines))
    stream = CommonTokenStream(lexer)
    parser = jcpParser(stream)
    tree = parser.start()
    printer = jcpListener(sys.stdout)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    # visitor = Visitor()
    # output = visitor.visit(tree)
    # print(output)

if __name__ == '__main__':
    main()