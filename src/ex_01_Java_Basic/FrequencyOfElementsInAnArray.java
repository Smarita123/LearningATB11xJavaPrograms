package ex_01_Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FrequencyOfElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name= {"Supriya", "Priya", "Poonam", "Supriya", "Peter", "Poonam", "Supriya"};
		HashSet<String> duplicates=new HashSet<String>();

		HashMap<String, Integer> map=new HashMap<String, Integer>();
		int count=0;
		Integer i;
		for (i=0; i<name.length; i++) {

			if(!map.containsKey(name[i])) {
				map.put(name[i], 1);
				count=1;
			}else {
				map.put(name[i], map.get(name[i])+1);
				duplicates.add(name[i]);
			}
		}		
			System.out.println(map);
			System.out.println("duplicates:"+duplicates);

		
	}

}
