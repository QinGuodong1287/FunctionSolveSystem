package com.QinGuodong1287.FunctionSolveSystem.checker;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FunctionChecker {
	protected static String[] patterns = {
		"^$", 
		"[\u4e00-\u9fa5]", 
		"[^x0-9\\.\\^\\+\\-]", 
		"x\\^2[^\\+\\-]", 
		"x\\^[^2]", 
		"x\\^$", 
		"x[^\\^\\+\\-]", 
		"\\d+[^\\.\\d+\\+\\-x]", 
		"\\d+[\\+\\-]$", 
		"^[\\+\\-]$"
	};
	
	public static boolean check(String function) {
		for(int i = 0; i < patterns.length; i ++) {
			if(Pattern.compile(patterns[i]).matcher(function).find()) {
				return false;
			}
		}
		return true;
	}
}
