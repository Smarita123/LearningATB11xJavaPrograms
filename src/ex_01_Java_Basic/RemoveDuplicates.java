package ex_01_Java_Basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello World";
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		hashmap.put(0, String.valueOf(str.charAt(0)) );
	
		for (int i=1; i<str.length(); i++) {
			for (int j=1; j<hashmap.size()+1 ; j++){
				//System.out.println(j);
				if (!hashmap.containsValue(String.valueOf(str.charAt(i)))){
					hashmap.put(Integer.valueOf(i), String.valueOf(str.charAt(i)));
					//System.out.println(hashmap.values());
				}
			}
											
		}
		System.out.println(hashmap.values());
		

	}

}
