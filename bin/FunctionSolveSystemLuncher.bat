@echo off


rem Note:

rem This script can lunach this application.



rem Save old path.

for /F %%i in ('chdir') do (

	set "OldPath=%%i"

)



rem Find the application's main file.

set "FileName=FunctionSolveSystem.class"

for %%a in (C D E F G H I J K L M N O P Q R S T U V W X Y Z) do (

	if exist %%a:\ (

		pushd %%a:\

		for /r %%b in (*%FileName%) do (

			if /i "%%~nxb" equ "%FileName%" (

				set "MainFilePath="%%~dpb"

				break

			)

		)

		popd

	)

)



rem Execute the main file.

cd "%MainFilePath%\..\..\.."
java com.QinGuodong1287.FunctionSolveSystem.FunctionSolveSystem

cd %OldPath%

pause