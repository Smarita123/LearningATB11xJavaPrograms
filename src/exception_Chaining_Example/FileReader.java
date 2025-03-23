package exception_Chaining_Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	
	public static void readFile(String filePath) throws MyCustomException  {
		// TODO Auto-generated method stub
		
		FileInputStream fin;
		try {
			fin = new FileInputStream(filePath);
			fin.read();
			
		} catch (FileNotFoundException e) {
			throw new MyCustomException("File is NOT available in the Path", e);			
		}catch (IOException e) {
			throw new MyCustomException("IO Exception has occured", e);			
		}
				

	}

}
