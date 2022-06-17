#!/bin/bash

java -jar /usr/local/lib/antlr-4.10.1-complete.jar -Dlanguage=Python3 "$@" jcp.g4 -o utils
python main.py
g++ out.cpp
./a.out