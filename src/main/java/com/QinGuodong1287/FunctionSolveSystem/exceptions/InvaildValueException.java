package utils.exceptions;

public class InvaildValueException extends Exception {
	public InvaildValueException() {
		super();
	}
	
	public InvaildValueException(String message) {
		super(message);
	}
	
	public InvaildValueException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public InvaildValueException(Throwable cause) {
		super(cause);
	}
}
