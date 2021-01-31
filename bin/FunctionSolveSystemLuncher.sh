#!/bin/bash

# Note:
# This script can lunach this application.

main_file_path="$(dirname $(dirname $(readlink -f $0)))/FunctionSolveSystem"
cd $main_file_path
java FunctionSolveSystem $@
cd -
