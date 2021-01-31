@echo off

rem Note:
rem This script can config this application.

rem Initizlize CLASSPATH.
echo "Initializing..."
set "CLASSPATH=.;..;%CLASSPATH%"

rem Find the config file.
set "FileName=ApplicationConfig.java"
for %%a in (C D E F G H I J K L M N O P Q R S T U V W X Y Z) do (
	if exist %%a:\ (
		pushd %%a:\
		for /r %%b in (*%FileName%) do (
			if /i "%%~nxb" equ "%FileName%" (
				set "LogFilePath=%%a/%%b"
				break
			)
		)
		popd
	)
)

rem Edit the config file.
echo "Editing..."
rem Use editor to edit config file(defualt editor is notepad)
notepad %LogFilePath%
echo "Compiling..."
javac %LogFilePath%
