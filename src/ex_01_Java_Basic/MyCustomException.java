package ex_01_Java_Basic;

public class MyCustomException extends Exception {

	public static void main(String[] args) throws MyCustomException {
		// TODO Auto-generated method stub
		int age=85;
		if (age<18) {
			throw new MyCustomException("Custom exception occurred - NOT an adult");
		}
		else if (age>80) {
			throw new MyCustomException("Custom exception occurred - Too old");
		}
		

	}
	
	public MyCustomException(String message) {
		super(message);
	}

}
