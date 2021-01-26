package utils.io;

import java.io.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class InputReader {
	protected BufferedReader reader;

	public InputReader() throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public InputReader(String filepath) throws IOException {
		reader = new BufferedReader(new FileReader(new File(filepath)));
	}
	
	public InputReader(InputStream stream) throws IOException {
		reader = new BufferedReader(new InputStreamReader(stream));
	}
	
	public InputReader(File file) throws IOException {
		reader = new BufferedReader(new FileReader(file));
	}
	
	public InputReader(FileReader read) throws IOException {
		reader = new BufferedReader(read);
	}
	
	public void finalize() {
		try {
			close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String read() throws IOException {
		return reader.readLine();
	}

	public String readLines() throws IOException {
		StringBuilder result = new StringBuilder();
		String line = "";
		while((line = reader.readLine()) != null) {
			result.append(line + "\n");
		}
		return result.toString();
	}
	
	public byte readByte() throws Exception {
		return Byte.parseByte(read());
	}
	
	public short readShort() throws Exception {
		return Short.parseShort(read());
	}
	
	public int readInt() throws Exception {
		return Integer.parseInt(read());
	}
	
	public long readLong() throws Exception {
		return Long.parseLong(read());
	}
	
	public BigInteger readBigInteger() throws Exception {
		return new BigInteger(read());
	}
	
	public float readFloat() throws Exception {
		return Float.parseFloat(read());
	}
	
	public double readDouble() throws Exception {
		return Double.parseDouble(read());
	}
	
	public BigDecimal readBigDecimal() throws Exception {
		return new BigDecimal(read());
	}
	
	public void close() throws IOException {
		reader.close();
	}
}
