package utils.translate.exceptions;

public class InvaildLanguageException extends Exception {
	public InvaildLanguageException() {
		super();
	}
	
	public InvaildLanguageException(String message){
		super(message);
	}
	
	public InvaildLanguageException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public InvaildLanguageException(Throwable cause) {
		super(cause);
	}
}
