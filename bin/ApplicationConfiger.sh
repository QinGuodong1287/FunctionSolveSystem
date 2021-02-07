#!/bin/bash

# Note:
# Please using bash to execute this script.
# If you are using sh to execute this script, the compiler will doesn't work.

# Initialize CLASSPATH, application's path, and config file's path.
echo "Initializing..."
export CLASSPATH=".:..:$CLASSPATH"
application_main_path="$(dirname $(dirname $(readlink -f $0)))"
config_file_path="$application_main_path"
config_file_name="src/main/java/com/QinGuodong1287/FunctionSolveSystem/config/ApplicationConfig.java"

# Edit the config file(use the vi editor).
echo "Editing..."
vi "$config_file_path/$config_file_name"

# Compile the config file.
echo "Compiling..."
cd $config_file_path
javac $config_file_name
cd - > /dev/null
echo "The config of this application is scucessfully."
