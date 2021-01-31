package com.QinGuodong1287.FunctionSolveSystem.io;

import java.io.*;

import com.QinGuodong1287.FunctionSolveSystem.bugreport.BugReportHelper;
import com.QinGuodong1287.FunctionSolveSystem.config.ApplicationConfig;

public final class OutputWriter {
	protected BufferedWriter writer;
	
	public OutputWriter() throws IOException {
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	public OutputWriter(String filepath) throws IOException {
		writer = new BufferedWriter(new FileWriter(new File(filepath), true));
	}
	
	public OutputWriter(OutputStream stream) throws IOException {
		writer = new BufferedWriter(new OutputStreamWriter(stream));
	}
	
	public OutputWriter(PrintStream stream) throws IOException {
		writer = new BufferedWriter(new OutputStreamWriter(stream));
	}
	
	public OutputWriter(File file) throws IOException {
		writer = new BufferedWriter(new FileWriter(file));
	}
	
	public OutputWriter(FileWriter write) throws IOException {
		writer = new BufferedWriter(write);
	}
	
	public void finalize() {
		try {
			close();
		} catch(IOException e) {
			if(ApplicationConfig.enableChineseTranslatorService == true) {
				BugReportHelper.report("IO工具出现了异常。", e);
			} else {
				BugReportHelper.report("The IO tool has a exception.", e);
			}
		}	
	}
	
	public void write(String... string) throws Exception {
		StringBuilder context = new StringBuilder();
		for(String str: string) {
			context.append(str);
		}
		writer.write(context.toString());
		writer.flush();
	}
	
	public void writeln(String... string) throws Exception {
		StringBuilder context = new StringBuilder();
		for(String str: string) {
			context.append(str);
		}
		context.append("\n");
		writer.write(context.toString());
		writer.flush();
	}
	
	public void write(Object... object) throws Exception {
		StringBuilder context = new StringBuilder();
		for(Object obj: object) {
			context.append(obj);
		}
		writer.write(context.toString());
		writer.flush();
	}

	public void writeln(Object... object) throws Exception {
		StringBuilder context = new StringBuilder();
		for(Object obj: object) {
			context.append(obj);
		}
		context.append("\n");
		writer.write(context.toString());
		writer.flush();
	}

	public void close() throws IOException {
		writer.close();
	}
}
