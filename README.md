## Resources:

-   [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se8/html/jls-19.html)

<!--
-   [java lexer](https://github.com/antlr/grammars-v4/blob/master/java/java9/Java9Lexer.g4)
-   [java parser](https://github.com/antlr/grammars-v4/blob/master/java/java9/Java9Parser.g4)
-   [java tokens](https://www.javatpoint.com/java-tokens)
-->

## Grammar

| grammar | rule |

## Installation

Create new conda env

```
conda create --name *compiler*
conda activate *compiler*
```

Install Python ANTLR runtime

```
conda install antlr4-python3-runtime
```

Aliases

```
alias antlr4='java -jar /usr/local/lib/antlr-4.10.1-complete.jar'
alias antlr4py='java -jar /usr/local/lib/antlr-4.10.1-complete.jar -Dlanguage=Python3 "$@"'
alias grun='java org.antlr.v4.gui.TestRig'
```

Create antlr files in **grammar** directory

```
antlr4py JCP.g4 -visitor -o utils
```
