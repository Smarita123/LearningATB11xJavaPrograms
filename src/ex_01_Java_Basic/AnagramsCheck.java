package ex_01_Java_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string");
		String string1=scanner.nextLine();
		System.out.println("Enter the second string");
		String string2=scanner.nextLine();
		
		string1=string1.replaceAll("[^A-Za-z0-9]", "");
		string2=string2.replaceAll("[^A-Za-z0-9]", "");
		
		char[] strCharArray1=string1.toCharArray();
		char[] strCharArray2=string2.toCharArray();
		Arrays.sort(strCharArray1);
		Arrays.sort(strCharArray2);
		//Arrays.equals to compare the contents of arrays
		if (Arrays.equals(strCharArray1, strCharArray2)){
			System.out.println("The Strings are Anagrams");
		}else {
			System.out.println("The Strings are NOT Anagrams");
		}
		



	}

}
