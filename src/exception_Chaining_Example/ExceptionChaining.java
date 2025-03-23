package exception_Chaining_Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionChaining {
	
	/*
	 * Exception chaining is a technique where one exception is used to cause
	 * another. It is useful for maintaining the stack trace of the original
	 * exception. This is done using constructors in Throwable class that accept a
	 * cause.
	 */

	public static void main(String[] args)   {
		
		FileReader filereader=new FileReader();
			try {
				filereader.readFile("C://filname.xlsx");
			} catch (MyCustomException e) {
				// Print the original exception along with the custom exception
				e.printStackTrace();
			}
			
	
				

	}
	


}
