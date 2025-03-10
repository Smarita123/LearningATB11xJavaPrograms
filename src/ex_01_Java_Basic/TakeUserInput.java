package ex_01_Java_Basic;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		// Read a line of text entered by the user
		String name=scanner.nextLine();
		
		System.out.println("Enter your age");
		// Read a line of text entered by the user
		String age=scanner.nextLine();
		
		System.out.println("Hello "+name+", you are "+age+" years old");
		

	}

}
