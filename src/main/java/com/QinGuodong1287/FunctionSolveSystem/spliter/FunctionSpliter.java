package com.QinGuodong1287.FunctionSolveSystem.spliter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.QinGuodong1287.FunctionSolveSystem.spliter.SplitResult;
import com.QinGuodong1287.FunctionSolveSystem.checker.FunctionChecker;
import com.QinGuodong1287.FunctionSolveSystem.exceptions.InvaildValueException;

public class FunctionSpliter {
	protected static double a = 0, b = 0, c = 0;
	protected static int exponent = 0;
	
	private FunctionSpliter() {
	}
	
	public static SplitResult split(String function) throws InvaildValueException {
		// Remove all spaces, add a symbol to the home and end.
		function = function.charAt(0) == '+' || function.charAt(0) == '-'? function: "+" + function;
		// Check function string is vaild.
		if(!FunctionChecker.check(function)) {
			// If the function string is invaild, throw a InvaildValueException.
			throw new InvaildValueException("This function string is invaild.");
		}
		function += "+";
		splitCV(function);
		if(a != 0) {
			exponent = 2;
		} else if(b != 0) {
			exponent = 1;
		} else {
			exponent = 0;
		}
		return new SplitResult(a, b, c, exponent);
	}
	
	protected static void splitCV(String function) {
		// Get three parts.
		String[] patterns = {
			"(?:\\+|-)\\d*(?:\\.\\d*)?x\\^2(?:\\+|-)", 
			"(?:\\+|-)\\d*(?:\\.\\d*)?x(?:\\+|-)", 
			"(?:\\+|-)\\d+(?:\\.\\d*)?(?:\\+|-)", 
		};
		String[] zeros = {
			"0x^2+", 
			"0x+", 
			"0+"
		};
		String[] parts = new String[3];
		Matcher m;
		for(int i = 0; i < 3; i ++) {
			m = Pattern.compile(patterns[i]).matcher(function);
			if(m.find()) {
				parts[i] = m.group();
			} else {
				parts[i] = zeros[i];
			}
		}
		// Get first CV.
		parts[0] = parts[0].substring(0, parts[0].length() - 1);
		if(parts[0].charAt(0) == 'x') {
			parts[0] = "+1x^2";
		} else if(parts[0].charAt(1) == 'x') {
			if(parts[0].charAt(0) == '+') {
				parts[0] = "+1x^2";
			} else if(parts[0].charAt(0) == '-') {
				parts[0] = "-1x^2";
			}
		}
		parts[0] = parts[0].substring(0, parts[0].length() - 3);
		a = Double.parseDouble(parts[0]);
		// Get second CV.
		parts[1] = parts[1].substring(0, parts[1].length() - 1);
		if(parts[1].charAt(0) == 'x') {
			parts[1] = "+1x";
		} else if(parts[1].charAt(1) == 'x') {
			if(parts[1].charAt(0) == '+') {
				parts[1] = "+1x";
			} else if(parts[1].charAt(0) == '-') {
				parts[1] = "-1x";
			}
		}
		parts[1] = parts[1].substring(0, parts[1].length() - 1);
		b = Double.parseDouble(parts[1]);
		// Get third CV.
		parts[2] = parts[2].substring(0, parts[2].length() - 1);
		if("".equals(parts[2])) {
			parts[2] = "0";
		}
		c = Double.parseDouble(parts[2]);
	}
}
