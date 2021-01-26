// Import classes.
import java.util.*;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import utils.logger.ExceptionLogger;
import utils.io.InputReader;
import utils.io.OutputWriter;
import utils.exceptions.InvaildValueException;
import utils.checker.FunctionChecker;
import utils.translate.Translator;
import utils.translate.exceptions.InvaildLanguageException;
import utils.spliter.FunctionSpliter;
import utils.spliter.SplitResult;

public final class FunctionSolveSystem {
	public static void main(String[] args) {
		try {
			mainProcess(args); // Execute the main process.
		} catch(Exception exc) { // Catch an excpetion.
			ExceptionLogger.logException(exc); // Print to the log file.
			// Tell the user there was an error.
			// System.err.println("There was an error, program is exiting...");
			System.err.println("这里有一个错误，程序正在退出……");
		}
	}
	
	// Declaration reader, writer, and a error writer.
	private static InputReader reader;
	private static OutputWriter writer;
	private static OutputWriter errWriter;
	
	// Declaration translator.
	private static Translator translator;
	
	// Declaration three CVs.
	private static double a = 0, b = 0, c = 0, y = 0;
	// Deckaration exponent.
	private static int exponent = 0;
	// Declaration function string.
	private static String function = "";
	// Declaration space pattern(for remove all spaces from function string).
	private static String spacePattern = "\\s";
	// If three CVs from arguments, this flag is false.
	private static boolean needGetCV = false;
	
	private static void mainProcess(String[] args) throws Exception {
		// Initialize the reader, writer, error writer and translator.
		try {
			reader = new InputReader();
			writer = new OutputWriter();
			errWriter = new OutputWriter(System.err);
		} catch(IOException e) { // If throws a IOException
			// Tell user there was an exception, and exit this program.
			// System.err.println("Sorry, the IO tools are error. Please restart this program.");
			System.err.println("抱歉，IO工具错误。请重启改程序。");
			return;
		}
		try {
			translator = new Translator("chinese");
		} catch(InvaildLanguageException e) { // If throws a InvaildValueException
			// Tell user there was an exception, and exit this program.
			// errWriter.writeln("Sorry, the translator is error. Please restart this program.");
			errWriter.writeln("抱歉，翻译器错误。请重启该程序。");
			return;
		}
		try {
			switch(args.length) {
				case 4: {
					a = Double.parseDouble(args[0]);
					b = Double.parseDouble(args[1]);
					c = Double.parseDouble(args[2]);
					y = Double.parseDouble(args[3]);
					break;
				}
				case 3: {
					b = Double.parseDouble(args[0]);
					c = Double.parseDouble(args[1]);
					y = Double.parseDouble(args[2]);
					break;
				}
				case 2: {
					c = Double.parseDouble(args[0]);
					y = Double.parseDouble(args[1]);
					break;
				}
				case 1: {
					y = Double.parseDouble(args[0]);
					break;
				}
				case 0: {
					needGetCV = true;
					break;
				}
				default: {
					errWriter.writeln(translator.translate("Too many arguments."));
					return;
				}
			}
		} catch(NumberFormatException e) {
			errWriter.writeln(translator.translate("Someone of your enter is not a number."));
			return;
		}
		if(args.length != 0) {
			getExponent();
			solve();
			return;
		}
		writer.writeln(translator.translate("Welcome to the Function Solve System!"));
		while(true) {
			writer.write(translator.translate("Please enter a function(enter empty string, the program will exiting):") + "\n" + 
				translator.translate("(must be a constant function, a linear function, or a quadratic function)") + "\n" + 
				"f(x)=");
			function = reader.read().replaceAll(spacePattern, "");
			if("".equals(function)) { // If the function string is empty
				writer.writeln(translator.translate("Thank you for using, goodbye!")); // Tell the user the program is exiting
				break; // Exit this program.
			}
			try {
				getExponent();
			} catch(InvaildValueException e) {
				errWriter.writeln("--------------------\n" + 
					translator.translate("Sorry, your function isn't a constant function, " + 
					"a linear function, or a quadratic function.") + "\n" + 
					translator.translate("Please try it again.") + "\n" + 
					"--------------------");
				continue;
			}
			if(exponent != 0) {
				while(true) {
					try {
						writer.writeln(translator.translate("Please enter " + (exponent == 2? "2 points'": "1 point's") + " Y-axis you search for:"));
						y = reader.readDouble();
						break;
					} catch(NumberFormatException e) {
						errWriter.writeln(translator.translate("Sorry, your enter is wrong.") + translator.translate("Please try it again."));
						continue;
					}
				}
			}
			solve();
		}
	}
	
	private static void getExponent() throws InvaildValueException {
		if(needGetCV) {
			SplitResult response = FunctionSpliter.split(function);
			a = response.cv1;
			b = response.cv2;
			c = response.cv3;
			exponent = response.exponent;
		} else {
			if(a != 0) {
				exponent = 2;
			} else if(b != 0) {
				exponent = 1;
			} else {
				exponent = 0;
			}
		}
	}
	
	private static void solve() throws InvaildValueException, IOException, InvaildLanguageException, Exception {
		double disc = 0, average = 0, value = 0;
		writer.writeln("--------------------");
		writer.writeln(translator.translate("Result:"));
		switch(exponent) {
			case 2: {
				if(a != 0) {
					c -= y;
					disc = b * b - 4 * a * c;
					if(disc >= 0) {
						average = -b / (2 * a);
						value = Math.sqrt(disc) / (2 * a);
						if(disc > 0) {
							writer.writeln("x1 = ", average - value);
							writer.writeln("x2 = ", average + value);
						} else {
							writer.writeln("x1 = x2 = ", average);
						}
					} else {
						writer.writeln(translator.translate("The graph picture of this function hasn't any points at Y-axis "), y, translator.translate("."));
					}
					c += y;
				} else {
					throw new InvaildValueException("The value of CV a is invaild.");
				}
				break;
			}
			case 1: {
				c -= y;
				writer.writeln("x = ", -c / b);
				c += y;
				break;
			}
			case 0: {
				if(c != 0) {
					writer.writeln(translator.translate("The graph picture of this function hasn't any points at Y-axis "), c, translator.translate("."));
				} else {
					writer.writeln(translator.translate("The graph picture of this function has unlimited points at Y-axis "), c, translator.translate("."));
				}
				break;
			} 
			default: {
				throw new InvaildValueException("The exponent is error.");
			}
		}
		writer.writeln("--------------------");
	}
}
