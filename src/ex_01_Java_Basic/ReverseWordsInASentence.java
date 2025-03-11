package ex_01_Java_Basic;

import java.util.Scanner;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		//program to reverse words in-place in a given sentence using user input:
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence=scanner.nextLine();
		//System.out.println(sentence.length());
		StringBuffer reversedSentence=new StringBuffer("");
		String word="";
		int i;
		for (i=0;i<sentence.length();i++){
			
			if (i==sentence.length()-1) {
				word =word+ sentence.charAt(i);
				//System.out.println(word);
				StringBuffer reverseWord=reverse(word);
				reversedSentence=reversedSentence.append(' ').append(reverseWord);
				word="";
				reverseWord= new StringBuffer("");
				//System.out.println(i);
				
			}else if (sentence.charAt(i)!= ' ') {
				word =word+ sentence.charAt(i);
				
				
			}else {
				//System.out.println(word);
				StringBuffer reverseWord=reverse(word);
				reversedSentence=reversedSentence.append(' ').append(reverseWord);
				word="";
				reverseWord= new StringBuffer("");
				//System.out.println(i);
				
			}
		}	
		System.out.println(reversedSentence.deleteCharAt(0));	
		
				
		

	}

	private static StringBuffer reverse(String word) {
		// TODO Auto-generated method stub
		StringBuffer strbuf = new StringBuffer (word);
		StringBuffer reverseword=strbuf.reverse();
		//System.out.println(reverseword);
		return (reverseword);
	}

}
