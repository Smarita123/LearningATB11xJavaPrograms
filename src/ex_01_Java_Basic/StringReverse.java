package ex_01_Java_Basic;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		StringBuffer reversedString=new StringBuffer(str);
		reversedString=reversedString.reverse();
		System.out.println("Reversed String="+reversedString);

	}

}
