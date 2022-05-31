from antlr4 import *
from grammar.attempt2Lexer import attempt2Lexer
from grammar.attempt2Listener import attempt2Listener
from grammar.attempt2Parser import attempt2Parser
import sys

class HelloPrintListener(attempt2Listener):
    def enterStart(self, ctx):
        print(ctx.getText() + '\n')

def main():
    with open('ExampleJava/src/Main.java') as f:
        lines = f.read()
    lexer = attempt2Lexer(InputStream(lines))
    # lexer = attempt2Lexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = attempt2Parser(stream)
    tree = parser.start()
    printer = HelloPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()