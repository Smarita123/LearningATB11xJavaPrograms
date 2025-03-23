package ex_01_Java_Basic;

import java.util.Arrays;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Betty better bought a bit of butter";
		
		char[] strArray=str.toCharArray();
		int numberOfSpaces=0;
		for (int i=0; i<strArray.length; i++) {
			if(strArray[i]==' ') {
				numberOfSpaces++;
			}
		}
		
		int numberOfWords=numberOfSpaces+1;
		System.out.println("numberOfWords: "+numberOfWords);
		
		//Alternate method
		String[] words = str.split("[ ]");
		System.out.println(Arrays.toString(words));
		System.out.println("numberOfWords: "+words.length);

	}

}
