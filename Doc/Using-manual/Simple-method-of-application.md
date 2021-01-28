[< Go back to using manual content](../Using-manual.md)\
[Go to 2.More method >](More-method.md)
# Using manual
## 1.Simple method of application

**Content:**\
[Method of the application](#method-of-the-application)

### Method of the application
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
--------------------
Sorry, your function isn't a constant function, a linear function, or a quadratic function.
Please try it again.
--------------------
```
You must enter a correct function, like this:
```
Please enter a function(enter empty string, the program will exiting):
(must be a constant function, a linear function, or a quadratic function)
f(x)=x^2-2x-2|
```
And you can see this:
```
Please enter 2 points' Y-axis if you search for:
```
or:
```
Please enter 1 point's Y-axis if you search for:
```
