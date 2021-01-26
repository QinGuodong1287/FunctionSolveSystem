# Using manual
Now, let me tell you how do use it.
## 1.Method of application
First, start this application with below command:
```
java FunctionSolveSystem
```
Then, the application prints a string, it's a welcome text:
```
Welcome to Function Solve System!
```
And then, the application prints a string, and wait for your input:
```
Please enter a function(enter empty string, the program will exiting):
(must be a constant function, a linear function, or a quadratic function)
f(x)=
```
Next, you must enter a function(must be a current constant function, a linear function, or a quadratic function).\
If you enter a invaild function, like this:
```
Please enter a function(enter empty string, the program will exiting):
(must be a constant function, a linear function, or a quadratic function)
f(x)=x23|
```
And you enter the ENTER key, the application will tell you, this function string is wrong:
```
```

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

