# Using manual
## 2.More method
If you are chinese, you can enable the chinese translator service.\
If you enabled the chinese translator service, the application will print the chinese string.\
If you want enable the chinese translator service, you must edit the FunctionSolveSystem-1.0.0/FunctionSolveSystem/utils/config/ApplicationConfig.java, and change line 9:
```
public static boolean enableChineseTranslatorService = false;
```
to:
```
public static boolean enableChineseTranslatorService = true;
```
The application will enable chinese translator service, and print the chinese string.

