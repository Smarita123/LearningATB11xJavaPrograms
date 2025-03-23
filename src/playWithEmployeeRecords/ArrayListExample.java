package playWithEmployeeRecords;

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
		
		
		//Employee ArrayList
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Shweta", 23, "Mumbai", "deptA"));
		employees.add(new Employee("Pradyumna", 30, "Delhi", "deptA"));
		employees.add(new Employee("Preeti", 25, "Mumbai", "deptB"));
		employees.add(new Employee("Prachi", 29, "Delhi", "deptB"));
		employees.add(new Employee("Hari", 70, "Mumbai", "deptA"));
		employees.add(new Employee("Arnab", 56, "Delhi", "deptB"));
		employees.add(new Employee("Debashish", 43, "Delhi", "deptA"));
		employees.add(new Employee("Kaushik", 27, "Mumbai", "deptA"));
		
		Collections.sort(employees, new NameComparator());
		System.out.println(employees);
		
		Collections.sort(employees, new AgeComparator());
		System.out.println(employees);

	}

	

}
