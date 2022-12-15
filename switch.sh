#!/bin/bash

## Switch between compiling work code
## and local code by switching bazel rc

MYPATH="/Users/gshivanshu/"
REALFIL=".bazelrc"
FILNAME=".oldbazelrc"

FILE="$MYPATH$REALFIL"
OFILE="$MYPATH$FILNAME"
if test -f "$FILE"; then
    echo "In work code mode; Switching..."
    mv $FILE $OFILE
elif test -f "$OFILE"; then
    echo "In play code mode; Switching..."
    mv $OFILE $FILE
fi
