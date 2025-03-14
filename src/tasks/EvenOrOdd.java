package tasks;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		
		String type;
		
		type=(number%2)==0 ?"even" : "odd" ;
		
		System.out.println("The number is "+type);

	}

}
