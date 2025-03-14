package ex_01_Java_Basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello World";
					
		String output = removeDuplicates(str);
	    System.out.println(output);
		

	}
	
	public static String removeDuplicates(String str) {
	    
	    String result = "";

	    for(int i=0; i<str.length(); i++) {
	      char ch = str.charAt(i);
	      //(result.indexOf(ch) == -1) returns the index of the first occurrence of ch in the string result. If the character is not found, it returns -1.
	      if(result.indexOf(ch) == -1) {
	        result += ch;
	      }
	    }
	    
	    return result;
	  }


}
