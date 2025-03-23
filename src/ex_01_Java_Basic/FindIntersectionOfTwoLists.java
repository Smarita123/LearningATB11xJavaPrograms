package ex_01_Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class FindIntersectionOfTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> listA=new ArrayList<String>(Arrays.asList("Swati","Shipra","Dhawan","Parag","Gayatri"));
		List <String> listB=new ArrayList<String>(Arrays.asList("Garima","Shipra","Kareena","Gayatri","Vivek"));
		List <String> listC=new ArrayList<String>();
		for(String item: listA) {
			if(listB.contains(item)) {
				listC.add(item);
			}	
		}
		System.out.println(listC);
		
		//Alternative method
		listA.retainAll(listB);//Retains only the elements of listA that are contained in listB 
		System.out.println(listA);
		;
		listA.addAll(Arrays.asList("Paras","Dheeraj","Shruti"));
		//Prepare hashset using list
		HashSet<String> hashSetA = new HashSet<String>(listA);
		HashSet<String> hashSetB = new HashSet<String>(listB);
		System.out.println(hashSetA);
		System.out.println(hashSetB);
		hashSetA.retainAll(hashSetB);
		System.out.println(hashSetA);
		System.out.println(new ArrayList<>(hashSetA));
		
		
	}

}
