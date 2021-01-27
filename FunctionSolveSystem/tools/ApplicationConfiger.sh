#!/bin/sh

# Note:
# Please using bash to execute this script.
# If you are using sh to execute this script, the compiler will doesn't work.

echo "Initializing..."
export CLASSPATH=".:..:$CLASSPATH"
application_path="$(dirname $(dirname $(readlink -f $0)))"
config_file_name="$application_path/utils/config/ApplicationConfig.java"
echo "Editing..."
vi $config_file_name
echo "Compiling..."
javac $config_file_name
echo "The config of this application is scucessfully."
