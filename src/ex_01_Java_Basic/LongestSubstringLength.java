package ex_01_Java_Basic;

import java.util.HashSet;

public class LongestSubstringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * This program finds the length of the longest substring without repeating
		 * characters in a given string s. It uses a sliding window technique combined
		 * with a HashSet to keep track of the characters in the current window of the
		 * string.
		 */
		
		String string="asdfghjklqwertyuiopshfg";
		int maxLength=findLongestSubstring(string);
		System.out.println(maxLength);
		

	}

	private static int findLongestSubstring(String string) {
		// TODO Auto-generated method stub
		
		
		HashSet<Character> set = new HashSet<>();
		int leftPointer = 0;
	    int maxLength = 0;

	    		for (int rightPointer = 0; rightPointer < string.length(); rightPointer++) {
	    			 while (set.contains(string.charAt(rightPointer))) {

	    	               set.remove(string.charAt(leftPointer));
	    	               leftPointer++;
	    	           }
	    			 set.add(string.charAt(rightPointer));
	    	           maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
	    		}
	    		System.out.println(set);
	    		return maxLength;
	    		
	}

}
