#!/bin/bash

# Note:
# This script can lunach this application.

application_main_file_path="$(dirname $(dirname $(readlink -f $0)))"
cd $application_main_file_path
java src.main.java.com.QinGuodong1287.FunctionSolveSystem.FunctionSolveSystem $@
cd - > /dev/null
