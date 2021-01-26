package utils.bugreport;

public class BugReportHelper {
	private BugReportHelper() {
	}
	
	/*
	protected static String[] ways = {
		"send an email with below exception context at 'qinguodong07@qq.com' or 'qinguodong07@foxmail.com'.", 
		"Go to the Github Issues page 'https://github.com/QinGuodong1287/FunctionSolveSystem/issues', and submit a issue with below exception context.", 
	};
	*/
	protected static String[] ways = {
		"发送一条包含以下异常内容的邮件到“qinguodong07@qq.com”或“qinguodong07@foxmail.com”。", 
		"到Github的Issues页“https://github.com/QinGuodong1287/FunctionSolveSystem/issues”，点击“New Issue”，并提交一条包含以下异常信息的Issue。", 
	};
	protected static String authur = "QinGuodong1287";
	
	public static void report(String message, Exception e) {
		// System.out.print("Sorry, there was an error. ");
		System.out.print("抱歉，这里出现了一个错误。");
		System.out.print(message);
		// System.out.print(" Please report this bug to the authur ");
		System.out.print("请报告这个bug给作者");
		System.out.print(authur);
		// System.out.println(". You can choose a way to report:");
		System.out.println("。你可以选择一种方式来报告：");
		for(int i = 0; i < ways.length; i ++) {
			System.out.print(i + ".");
			System.out.println(ways[i]);
		}
		System.out.println("--------------------");
		// System.out.println("Exception context:");
		System.out.println("异常内容：");
		e.printStackTrace();
	}
}
