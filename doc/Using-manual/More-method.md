[< Go back to using manual content](../Using-manual.md)\
[< Go to 1.Simple method of application](Simple-method-of-application.md)
# Using manual
## 2.More method

**Content:**\
[(1)Config the application](#1config-the-application)\
[a.Enable or disable chinese translator service](#aenable-or-disable-chinese-translator-service)

### (1)Config the application
#### a.Enable or disable chinese translator service
If you are chinese, you can enable the chinese translator service.\
If you enabled the chinese translator service, the application will print the chinese string.\
If you want enable the chinese translator service, you must execute below command and edit file FunctionSolveSystem-1.0.0/FunctionSolveSystem/utils/config/ApplicationConfig.java:\
For Linux/Mac OS:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/
bash Bin/ApplicationConfiger.sh
```
For Windows:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/
Bin/ApplicationConfiger.bat
```
Change line 9:
```
public static boolean enableChineseTranslatorService = false;
```
to:
```
public static boolean enableChineseTranslatorService = true;
```
Then you must wait a moment, util the configer prints "The config of this application is suceussfully.".\
The application's chinese translator service was enabled, and it prints the chinese string when it starts.\
Otherwise, if you want disable the chinese translator service, you must execute below command and edit file FunctionSolveSystem-1.0.0/FunctionSolveSystem/utils/config/ApplicationConfig.java:\
For Linux/Mac OS:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/
bash Bin/ApplicationConfiger.sh
```
For Windows:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/
Bin/ApplicationConfiger.bat
```
Change line 9 to:
```
public static boolean enableChineseTranslatorService = false;
```
Then wait util the configer prints "The config of this application is suceussfully.".\
The application will disable chinese translator service, and don't print the chinese string.
