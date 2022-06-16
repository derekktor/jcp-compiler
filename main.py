from antlr4 import *
from utils.jcpLexer import jcpLexer
from utils.jcpParser import jcpParser
from Listener import Listener
import sys
import subprocess

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
    sys.stdout = open('out.cpp', "w")
    printer = Listener(sys.stdout)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()