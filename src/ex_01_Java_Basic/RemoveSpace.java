package ex_01_Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpace {

	public static void main(String[] args) {
		
		
		//remove spaces
		String str="Hello Java Learning";
		char[] charArr = str.toCharArray();
		String finalString="" ;
		for (int i=0; i<charArr.length;i++) {
			if (charArr[i] != ' ') {
				finalString=finalString+charArr[i];
			}
		}
		System.out.println(finalString);		
		System.out.println(str.replace(" ", ""));
		
		System.out.println("***Common elements in 2 arrays***");
		Integer[] array1= {10, 48, 39, 100, 4267};
		Integer[] array2= {48, 900, 377, 100};
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
		list1.retainAll(list2);
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);

	}

}
