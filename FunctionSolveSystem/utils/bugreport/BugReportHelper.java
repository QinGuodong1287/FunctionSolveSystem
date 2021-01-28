package utils.bugreport;

import utils.config.ApplicationConfig;

public class BugReportHelper {
	private BugReportHelper() {
	}
	
	protected static String[] ways = new String[2];
	static {
		if(ApplicationConfig.enableChineseTranslatorService == false) {
			ways[0] = "Send an email with below exception context at 'qinguodong07@qq.com' or 'qinguodong07@foxmail.com'.";
			ways[1] = "Go to the Github Issues page 'https://github.com/QinGuodong1287/FunctionSolveSystem/issues', and submit a issue with below exception context.";
		} else {
			ways[0] = "发送一条包含以下异常内容的邮件到“qinguodong07@qq.com”或“qinguodong07@foxmail.com”。";
			ways[1] = "到Github的Issues页“https://github.com/QinGuodong1287/FunctionSolveSystem/issues”，点击“New Issue”，并提交一条包含以下异常信息的Issue。";
		}
	}
	protected static String author = "QinGuodong1287";
	
	public static void report(String message, Exception... exceptions) {
		if(ApplicationConfig.enableChineseTranslatorService == false) {
			System.out.print("Sorry, there was an error. ");
		} else {
			System.out.print("抱歉，这里出现了一个错误。");
		}
		System.out.print(message);
		if(ApplicationConfig.enableChineseTranslatorService == false) {
			System.out.print(" Please report this bug to the author ");
		} else {
			System.out.print("请报告这个bug给作者");
		}
		System.out.print(author);
		if(ApplicationConfig.enableChineseTranslatorService == false) {
			System.out.println(". You can choose a way to report:");
		} else {
			System.out.println("。你可以选择一种方式来报告：");
		}
		for(int i = 0; i < ways.length; i ++) {
			System.out.print((i + 1) + ".");
			System.out.println(ways[i]);
		}
		System.out.println("--------------------");
		if(ApplicationConfig.enableChineseTranslatorService == false) {
			System.out.println("Exception context:");
		} else {
			System.out.println("异常内容：");
		}
		for(Exception e: exceptions) {
			e.printStackTrace();
		}
	}
}
