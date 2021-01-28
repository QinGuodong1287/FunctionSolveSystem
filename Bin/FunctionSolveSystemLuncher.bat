@echo off

rem Note:
rem This script can lunach this application.

rem Save old path.
for /F %%command in ('chdir') do (
	set "OldPath=%%command"
)

rem Find the application's main file.
set "FileName=FunctionSolveSystem.class"
for %%a in (C D E F G H I J K L M N O P Q R S T U V W X Y Z) do (
	if exist %%a:\ (
		pushd %%a:\
		for /r %%b in (*%FileName%) do (
			if /i "%%~nxb" equ "%FileName%" (
				set "MainFilePath=%%a/%%b"
				break
			)
		)
		popd
	)
)

rem Execute the main file.
cd %MainFilePath%
java FunctionSolveSystem
cd %OldPath%
