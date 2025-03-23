package ex_01_Java_Basic;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		Integer originalNumber=scanner.nextInt();
		Integer number=originalNumber;
		Integer reversed=0;
		for (int i=0; number>0; i++) {
			int lastDigit=number%10;
			reversed= (reversed*10)+lastDigit ;
			number=(number-lastDigit)/10;
			//1234System.out.println(reversed);
		}
		System.out.println("Original number="+originalNumber);
		System.out.println("Number after reversing the digits="+reversed);
		if (originalNumber.equals(reversed)) {
			System.out.println("The number is a Palindrome");
		}else System.out.println("The number is NOT a Palindrome");
		
		
		
	}

}
