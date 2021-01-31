package com.QinGuodong1287.FunctionSolveSystem.translate;

import java.lang.invoke.*;

import com.QinGuodong1287.FunctionSolveSystem.translate.exceptions.InvaildLanguageException;

public class Translator {
	protected class Sentence {
		protected String english = "";
		protected String chinese = "";
		
		public Sentence(String english, String chinese) {
			this.english = english;
			this.chinese = chinese;
		}
		
		public String getEnglish() {
			return english;
		}
		
		public String getChinese() {
			return chinese;
		}
		
		public String get(String language) throws InvaildLanguageException {
			StringBuilder context = new StringBuilder();
			for(int i = 0; i < language.length(); i ++) {
				context.append(Character.toLowerCase(language.charAt(i)));
			}
			language = context.toString();
			switch(language) {
				case "english": {
					return english;
				}
				case "chinese": {
					return chinese;
				}
				default: {
					throw new InvaildLanguageException("The language '" + language + "' is not supported.");
				}
			}
		}
	}
	protected String[] supported = {
		"English", 
		"Chinese", 
	};
	protected Sentence[] dict = {
		new Sentence("Welcome to the Function Solve System!", "欢迎来到函数解析系统！"), 
		new Sentence("Too many arguments.", "参数太多。"), 
		new Sentence("Thank you for using, goodbye!", "感谢您的使用，再见！"), 
		new Sentence("Someone of your enter is not a number.", "你的输入中有些不是一个数字。"), 
		new Sentence("Please enter a function(enter empty string, the program will exiting):", "请输入一个函数（输入空字符串，程序将会退出）："), 
		new Sentence("(must be a constant function, a linear function, or a quadratic function)", "（必须是一个常函数、一次函数或二次函数）"), 
		new Sentence("Sorry, your function isn't a constant function, a linear function, or a quadratic function.", "抱歉，你的函数不是一个常函数、一次函数或二次函数。"), 
		new Sentence("Please try it again.", "请重新尝试。"), 
		new Sentence("Please enter 2 points' Y-axis you search for:", "请输入你查找的2个点的Y坐标："), 
		new Sentence("Please enter 1 point's Y-axis you search for:", "请输入你查找的1个点的Y坐标："), 
		new Sentence("Sorry, your enter is wrong.", "抱歉，你的输入有误。"), 
		new Sentence("Result:", "结果："), 
		new Sentence("The graph picture of this function hasn't any points at Y-axis ", "该函数的图像没有点位于Y坐标"), 
		new Sentence(".", "。"), 
		new Sentence("The graph picture of this function has unlimited points at Y-axis ", "该函数的图像有无数个点位于Y坐标"), 
	};
	protected String language = "";
	
	public Translator(String language) throws InvaildLanguageException {
		setLanguage(language);
	}
	
	public void setLanguage(String language) throws InvaildLanguageException {
		StringBuilder context = new StringBuilder();
		context.append(Character.toUpperCase(language.charAt(0)));
		for(int i = 1; i < language.length(); i ++) {
			context.append(Character.toLowerCase(language.charAt(i)));
		}
		language = context.toString();
		int number = 0;
		for(number = 0; number < supported.length; number ++) {
			if(supported[number].equals(language)) {
				this.language = language;
				break;
			}
		}
		if(number == supported.length) {
			throw new InvaildLanguageException("The language '" + language + "' is not supported.");
		}
	}
	
	public String getLanguage() {
		return language;
	}
	
	public String translate(String sentence) {
		for(int i = 0; i < dict.length; i ++) {
			if(dict[i].getEnglish().equals(sentence)) {
				try {
					return dict[i].get(language);
				} catch(Exception e) {
					return "";
				}
			}
		}
		return "";
	}
}
