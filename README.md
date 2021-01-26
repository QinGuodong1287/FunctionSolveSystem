# Function Solve System

> Features: Solve constant function, linear function, and quadratic function.

Welcome to Function Solve System!\
This application can solve a constant function, a linear function, and a quadratic function.\
It can solve the X-axis of the point(s) on the graph picture of your function at given Y-axis.\
This application can't execute with GUI. It must execute with terminal, and you must install the JDK.\
You must clone and extract the application in your device, and use it in terminal with below commands:
```
cd FunctionSolveSystem-1.0.0/FunctionSolveSystem/
java FunctionSolveSystem
```

## Version
|Version|Publish Time|
|-------|------------|
|1.0.0|2020/1/28|

## Using manaul
Now, let me tell you how do use it.\
**1.Method of application**\
First, start this application with below command:
```
java FunctionSolveSystem
```
Then, the application prints a string, it's a welcome text:
```
Welcome to Function Solve System!
```

**2.More method**
If you are chinese, you can enable the chinese translator service.\
If you enabled the chinese translator service, the application will print the chinese string.\
If you want enable the chinese translator service, you must edit the FunctionSolveSystem-1.0.0/FunctionSolveSystem/utils/config/ApplicationConfig.java, and change this line:
```
boolean enableChineseTranslatorService = false;
```
to:
```
boolean enableChineseTranslatorService = true;
```
The application will enable chinese translator service, and print the chinese string.

> Note:
> This application using the CLASSPATH environment variable is:
> ```
> CLASSPATH=".:..:$CLASSPATH" // For Linux/Mac
> CLASSPATH=".;..;%CLASSPATH%" // For Windows
> ```
