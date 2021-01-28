切换语言为\[[EN 英语](README.md)\]
# 函数解析系统

> 特点：能解析常函数、一次函数和二次函数。

欢迎来到函数解析系统！\
该应用能解析常函数、一次函数和二次函数。\
它可以解析该函数的图像位于给定Y坐标的点的X坐标。\
该应用不能在GUI运行。它必须在终端运行，并且你必须安装JDK（Oracle JDK或Open JDK）。

> 注：该应用支持的JDK的最小版本为11.0.9.1。
> |JDK版本|是否支持|
> |-----------|---------|
> |>= 11.0.9.1|支持|
> |< 11.0.9|不支持|
> 
> 如果你的JDK版本低于11.0.9，应用可能不会正常运行。\
> 那么请更新你的JDK到更高版本的JDK。

你必须克隆且解压该应用的压缩文件到你的设备中，并使用以下命令使用它：\
Linux/Mac OS：
```
cd FunctionSolveSystem-1.0.0/
bash Bin/FunctionSolveSystemLuncher.sh
```
Windows：
```
cd FunctionSolveSystem-1.0.0/
Bin/FunctionSolveSystemLuncher.bat
```

## 版本
|版本|发布时间|
|-------|------------|
|1.0.0(当前)|2020/1/31(预计)|

## 使用手册
单击[这里](Doc/Using-manual.md)，你可以看到该应用的使用手册。

## 作者寄语:
如果该应用出现了异常，请报告它给我们。\
你可以通过以下方式报告:\
1.发送一封含有异常内容的邮件给我们（qinguodong07@qq.com或qinguodong07@foxmail.com）。\
2.到Github上的Issues页（https://github.com/QinGuodong1287/FunctionSolveSystem/issues），并提交一个含有异常信息的Issue给我们。\
最后，祝你们有一个美好的时光！

> 注：
> 该应用使用的环境变量CLASSPATH是:
> ```
> CLASSPATH=".:..:$CLASSPATH" // 对于Linux/Mac
> CLASSPATH=".;..;%CLASSPATH%" // 对于Windows
> ```
> 在CLASSPATH环境变量中，“$CLASSPATH”或“%CLASSPATH%”是你设置好的环境变量CLASSPATH。
