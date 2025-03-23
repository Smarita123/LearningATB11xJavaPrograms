package ex_01_Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



public class MostFrequentElementInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<String>(Arrays.asList("Preeti","Swati","Peter","Swati","Harry","Swati","Peter","Gary"));
		System.out.println("****findMostFrequentElement="+findMostFrequentElement(list));
		//System.out.println(list);

	}

	private static String findMostFrequentElement(List<String> list) {
		
		HashMap<String, Integer> hashmap = new HashMap();
		
		for(String item:list) {
			if (!hashmap.containsKey(item)) {
				hashmap.put(item, 1);
			}else {
				hashmap.put(item, (hashmap.get(item)+1));
			}					
		}
		System.out.println(hashmap);
		Integer max=0;
		String mostFrequentElelment=null;
		for (String item:hashmap.keySet()) {
			if(hashmap.get(item)>max) {
				max=hashmap.get(item);
				mostFrequentElelment=item;
			}
		}
		return(mostFrequentElelment);
		
		
	}

}
