@echo off

rem Note:
rem This script can config this application.

rem Initialize.
echo Initializing...

rem Save old path.
for /F %%i in ('chdir') do (
	set "OldPath=%%i"
)

rem Find the config file.
set "FileName=ApplicationConfig.java"
for %%a in (C D E F G H I J K L M N O P Q R S T U V W X Y Z) do (
	if exist %%a:\ (
		pushd %%a:\
		for /r %%b in (*%FileName%) do (
			if /i "%%~nxb" equ "%FileName%" (
				for /f %%i in ('chdir') do (
					set "Disk=%%i"
				)
				set "ConfigFilePath=%%~dpb"
				break
			)
		)
		popd
	)
)

rem Edit the config file.
echo Editing...
rem Use editor to edit config file(defualt editor is notepad)
notepad "%ConfigFilePath%\ApplicationConfig.java"

rem Compile the config file.
echo Compiling...
cd %ConfigFilePath%
cd ..\..\..\..\..\..\..
javac "src\main\java\com\QinGuodong1287\FunctionSolveSystem\config\ApplicationConfig.java"
cd %OldPath%
