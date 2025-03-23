package tasks;

import java.util.Arrays;

public class PalidromeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "madam";
		Boolean isPalindrome=isPalindrome(str);
		System.out.println(isPalindrome);

	}

	private static Boolean isPalindrome(String str) {
				
		String reversed="";
	
		for (int i=str.length()-1; i>=0; i--) {
			System.out.println(i);
			reversed=reversed+str.charAt(i);	
		}
		System.out.println(str);
		System.out.println(reversed);
		if (str.equals(reversed)) {
			return true;
		}
		return false;
	}

}
