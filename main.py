from antlr4 import *
from utils.jcpLexer import jcpLexer
from utils.jcpParser import jcpParser
from Listener import Listener
from Visitor import Visitor
from utils.jcpVisitor import jcpVisitor
import sys

def main():
    dir = "ExampleJava/src/"
    files = ["Main.java", "example.java", "utils/Person.java", "utils/Student.java", "utils/Subject.java"]

    path = str(dir + files[2]);

    with open(path) as f:
        lines = f.read()
    lexer = jcpLexer(InputStream(lines))
    stream = CommonTokenStream(lexer)
    parser = jcpParser(stream)
    tree = parser.start()
    printer = Listener(sys.stdout)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    visitor = Visitor()
    output = visitor.visit(tree)
    print(output)

if __name__ == '__main__':
    main()