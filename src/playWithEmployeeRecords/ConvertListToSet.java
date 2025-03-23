package playWithEmployeeRecords;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How do you convert a List to a Set?
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Shweta", 23, "Mumbai", "deptA"));
		list.add(new Employee("Pradyumna", 30, "Delhi", "deptA"));
		list.add(new Employee("Preeti", 25, "Mumbai", "deptB"));
		list.add(new Employee("Prachi", 29, "Delhi", "deptB"));
		list.add(new Employee("Hari", 70, "Mumbai", "deptA"));
		list.add(new Employee("Arnab", 56, "Delhi", "deptB"));
		list.add(new Employee("Debashish", 43, "Delhi", "deptA"));
		list.add(new Employee("Kaushik", 27, "Mumbai", "deptA"));
		list.add(new Employee("Hari", 70, "Mumbai", "deptA"));
		list.add(new Employee("Arnab", 56, "Delhi", "deptB"));
		
		/*
		 * In Java, the HashSet is used to store unique elements, but for it to properly
		 * determine whether an object is a duplicate, it needs to be able to
		 * distinguish between two objects of the same type. This is done by the
		 * equals() and hashCode() methods.
		 */
		
		HashSet<Employee> hashSetEmployee = new HashSet<Employee>(list);
		System.out.println("removed duplicates"+hashSetEmployee);

	}

}
