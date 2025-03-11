package ex_01_Java_Basic;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text:");
		String str= scanner.nextLine();
		int vowels=0;
		int consonents=0;
		for (int i=0; i<str.length(); i++) {
			str=str.replaceAll("[^A-Za-z0-9 ]", "");
			str=str.toLowerCase();
			str=str.replace(" ", "");
			if ((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)=='u')) {
				vowels++;
			}else consonents++;
		}
		System.out.printf("Number of vowels are %d",vowels);
		System.out.println();
		System.out.printf("Number of vowels are %d",consonents);
		
		/*
		 * If you need to return the vaules using an integer Array wich holds the 2 values:
		 * 
		 * return(new int[]{vowels, consonents}));
		 */

	}

}
