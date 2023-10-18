package sunbeam.com;

import java.util.Scanner;


public class program {
	
	
	public static void main(String args[])
	{
		LengthString l1=new LengthString();
		
		try {
			l1.setString("my name is king krishna");
		}
		catch( ExceptionLineTooLong e)
		{
			e.printStackTrace();	
		}
		
	}
}
