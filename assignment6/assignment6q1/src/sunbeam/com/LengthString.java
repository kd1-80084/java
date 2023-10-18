package sunbeam.com;

import java.util.Scanner;

public class  LengthString {
	
	private String s1;

	public LengthString() {
		
	}

	public LengthString(String s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "LengthString [string=" + s1 + "]";
	}
	

	public void setString(String s1) throws ExceptionLineTooLong {  
		if(s1.length() > 10)
			throw new ExceptionLineTooLong("string shoud have less than 10 character",s1.length());
			this.s1 = s1;
		
	}
	
	
}
