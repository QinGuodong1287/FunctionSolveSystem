package com.QinGuodong1287.FunctionSolveSystem.logger;

import java.io.*;

import com.QinGuodong1287.FunctionSolveSystem.bugreport.BugReportHelper;
import com.QinGuodong1287.FunctionSolveSystem.config.ApplicationConfig;

public final class ExceptionLogger {
	protected static String logFilepath = "log/error.log";
	
	protected static BufferedWriter logger;
	protected static StringWriter trace;
	
	private ExceptionLogger() {
	}
	
	public static void logException(Exception exc) {
		logException(exc, logFilepath);
	}
	
	public static void logException(Exception exc, String filepath) {
		try {
			int index = 0, i = 0;
			while((i = filepath.indexOf("/", index + 1)) != -1) {
				index = i;
			}
			File file = new File(filepath.substring(0, index));
			if(!file.exists()) {
				file.mkdir();
			}
			file = new File(filepath);
			if(file.exists()) {
				file.delete();
			}
			file.createNewFile();
			logger = new BufferedWriter(new FileWriter(file, true));
			trace = new StringWriter();
			exc.printStackTrace(new PrintWriter(trace));
			logger.write(trace.toString() + "\n");
			logger.close();
		} catch(Exception e) {
			if(ApplicationConfig.enableChineseTranslatorService == false) {
				BugReportHelper.report("The exception can't log to log file.", exc, e);
			} else {
				BugReportHelper.report("异常无法导出到日志文件中。", exc, e);
			}
		}
	}
}
