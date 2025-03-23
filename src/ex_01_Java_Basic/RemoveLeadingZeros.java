package ex_01_Java_Basic;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The code str = str.replaceFirst("^0+(?!$)", ""); is a regular expression
		 * operation that removes leading zeros from a string, but it handles the case
		 * where the string is just "0" carefully.
		 * 
		 * Let's break down the regular expression:
		 * 
		 * ^: Asserts the start of the string. 0+: Matches one or more occurrences of
		 * the digit "0". (?!$): This is a negative lookahead, which ensures that the
		 * zeros are not followed by the end of the string (i.e., it prevents removing
		 * the last zero if the string is just "0"). "": Replaces the matched pattern
		 * (the leading zeros) with an empty string.
		 */
		
		
		  String number= "0005634"; //String string=
		  number = number.replaceFirst("^0+(?!$)", "");
	         
	         System.out.println("String without leading zeros: '" + number + "'");
		 
		

	}

}
