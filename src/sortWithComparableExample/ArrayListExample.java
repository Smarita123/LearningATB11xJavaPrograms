package sortWithComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr1 = new ArrayList<String> ();
		arr1.add("Shoes");
		arr1.add("Bindis");
		arr1.add("Dress");
		arr1.add("HandBag");
		arr1.add("Hat");
		arr1.add("Stole");
		arr1.add("Scarf");
		
		
		 Collections.sort(arr1); 
		 System.out.println(arr1);
		 
		
		//Collections.sort(arr1, compare());
		//System.out.println(arr1);
		
		
		//Student ArrayList
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Shweta", 23, "Mumbai", "deptA"));
		students.add(new Student("Pradyumna", 30, "Delhi", "deptA"));
		students.add(new Student("Preeti", 25, "Mumbai", "deptB"));
		students.add(new Student("Prachi", 29, "Delhi", "deptB"));
		students.add(new Student("Hari", 70, "Mumbai", "deptA"));
		students.add(new Student("Arnab", 56, "Delhi", "deptB"));
		students.add(new Student("Debashish", 43, "Delhi", "deptA"));
		students.add(new Student("Kaushik", 27, "Mumbai", "deptA"));
		
		//sorted based on implementation of Comparable in Student class
		Collections.sort(students);
		System.out.println(students);
		
		//reversing the arralist using Collection.reverse()
		System.out.println("+++++++++++++++++++++++++++++++");
		Collections.reverse(students);
		System.out.println(students);
		
		System.out.println("******************************");
		//reversing the arralylist using reversed() method of ArrayList
		System.out.println(students.reversed());
		
		
		

	}

	

}
