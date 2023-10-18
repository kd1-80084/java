package sunbeam.com;

public class ExceptionLineTooLong extends Exception {
	
	private int sizeOfString;
	
	public ExceptionLineTooLong() {
		
	}

	public ExceptionLineTooLong(int sizeOfString) {
		this.sizeOfString = sizeOfString;
	}

	public ExceptionLineTooLong(String string, int sizeOfString) {
		super(string);
		this.sizeOfString=sizeOfString;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [sizeOfString=" + sizeOfString + ", toString()=" + super.toString() + "]";
	}

	
	
}
