package ex_01_Java_Basic;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		/*
		 * Create a program that checks whether a given string is a palindrome. A
		 * palindrome is a word or phrase that reads the same backward as forward
		 * (ignoring spaces, punctuation, and capitalization). Use an if-else statement
		 * to determine if the string is a palindrome
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text");
		String str=scanner.nextLine();
		str=str.toLowerCase();
		str=str.replace(" ", "");
		str=str.replace(",", "");
		str=str.replace(".", "");
		str=str.replace("!", "");
		str=str.replace("?", "");
		StringBuffer reversed=new StringBuffer(str);
		reversed.reverse();
		System.out.println(reversed);
		if (str.equals(reversed.toString())) {
			System.out.println("The entered String is a Palindrome");
		}else {
			System.out.println("The entered String is NOT a Palindrome");
		}

	}

}
