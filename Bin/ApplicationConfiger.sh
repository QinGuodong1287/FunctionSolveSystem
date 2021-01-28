#!/bin/bash

# Note:
# Please using bash to execute this script.
# If you are using sh to execute this script, the compiler will doesn't work.

# Initialize CLASSPATH, application's path, and config file's path.
echo "Initializing..."
export CLASSPATH=".:..:$CLASSPATH"
application_path="$(dirname $(dirname $(readlink -f $0)))"
config_file_name="$application_path/FunctionSolveSystem/utils/config/ApplicationConfig.java"

# Edit the config file(use the vi editor).
echo "Editing..."
vi $config_file_name

# Compile the config file.
echo "Compiling..."
javac $config_file_name
echo "The config of this application is scucessfully."
