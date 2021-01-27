# Using manual
## 2.More method
### (1)Enable or disable chinese translator service
If you are chinese, you can enable the chinese translator service.\
If you enabled the chinese translator service, the application will print the chinese string.\
If you want enable the chinese translator service, you must execute below command and edit file FunctionSolveSystem-1.0.0/FunctionSolveSystem/utils/config/ApplicationConfig.java:
For Linux/Mac OS:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/tools/
bash ApplicationConfiger.sh
```
For Windows:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/tools/
./ApplicationConfiger.bat
```
Change line 9:
```
public static boolean enableChineseTranslatorService = false;
```
to:
```
public static boolean enableChineseTranslatorService = true;
```
Then you must wait a moment, util the configer prints "The config of this appl"
The  chinese translator service, and print the chinese string.
Otherwise, if you want disable the chinese translator service, you must edit file FunctionSolveSystem-1.0.0/FunctionSolveSystem/utils/config/ApplicationConfig.java, and change line 9 to:
```
public static boolean enableChineseTranslatorService = false;
```
and execute below command again:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem
javac utils/config/ApplicationConfig.java
```
The application will disable chinese translator service, and don't print the chinese string.
