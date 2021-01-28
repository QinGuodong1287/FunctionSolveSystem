Change language to \[[CN 汉语](README_CN.md)\]
# Function Solve System

> Features: Can solve constant function, linear function, and quadratic function.

Welcome to Function Solve System!\
This application can solve a constant function, a linear function, and a quadratic function.\
It can solve the X-axis of the point(s) on the graph picture of your function at given Y-axis.\
This application can't execute with GUI. It must execute with terminal, and you must install the JDK(the Oracle JDK or OpenJDK).\

> Note: This application supported JDK's minimum version is 11.0.9.1.
> |JDK Version|Supported|
> |-----------|---------|
> |>= 11.0.9.1|Supported|
> |< 11.0.9|Not supported|
> If your JDK's version is lower 11.0.9, the application may not run currectly.\
> So please update your JDK to later version of the JDK.

You must clone and extract the application zipfile in your device, and use it in terminal with below commands:\
for Linux/Mac OS:
```
cd FunctionSolveSystem-1.0.0/
bash Bin/FunctionSolveSystemLuncher.sh
```
for Windows:
```
cd FunctionSolveSystem-1.0.0/
Bin/FunctionSolveSystemLuncher.bat
```

## Version
|Version|Publish Time|
|-------|------------|
|1.0.0(current)|2020/1/31(excepted)|

## Using manaul
Click [there](Doc/Using-manual.md), and you can see the using manual of this application.

## Author notice:
If this application has an exception, please report it to us.\
You can report it by below three ways:\
1.Send an email with exception context to us at "qinguodong07@qq.com" or "qinguodong07@foxmail.com".\
2.Go to the Github issues page(https://github.com/QinGuodong1287/FunctionSolveSystem/issues), and submit a issue with exception context to us.\
Finally, hava a good time!

> Note:\
> This application using the CLASSPATH environment variable is:
> ```
> CLASSPATH=".:..:$CLASSPATH" // For Linux/Mac
> CLASSPATH=".;..;%CLASSPATH%" // For Windows
> ```
> In the CLASSPATH environment variable, the "$CLASSPATH" or "%CLASSPATH%" is your setting environment variable CLASSPATH.
