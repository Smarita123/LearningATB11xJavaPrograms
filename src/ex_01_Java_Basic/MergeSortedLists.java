package ex_01_Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1=new ArrayList<String>(Arrays.asList("Annie","Marylin","Sam", "Peter","Hitler"));
		List<String> list2=new ArrayList<String>(Arrays.asList("Betty","Christina","Harry", "Kim","Gary"));
		Collections.sort(list1);
		Collections.sort(list2);
		
		//System.out.println(list1);
		//System.out.println(list2);
		
		List<String> mergedlist=mergeList(list1, list2);
		System.out.println(mergedlist);

	}

	private static List<String> mergeList(List<String> list1, List<String> list2) {
		// TODO Auto-generated method stub
		for(String item: list2) {
			list1.add(item);
		}
		Collections.sort(list1);
		return(list1);
	}

}
