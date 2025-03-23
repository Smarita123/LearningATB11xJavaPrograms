package playWithEmployeeRecords;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> linkList1=new LinkedList<Employee>();
		
		linkList1.add(new Employee("Shweta", 23, "Mumbai", "deptA"));
		linkList1.add(new Employee("Pradyumna", 30, "Delhi", "deptA"));
		linkList1.add(new Employee("Preeti", 25, "Mumbai", "deptB"));
		linkList1.add(new Employee("Prachi", 29, "Delhi", "deptB"));
		linkList1.add(new Employee("Hari", 70, "Mumbai", "deptA"));
		linkList1.add(new Employee("Arnab", 56, "Delhi", "deptB"));
		linkList1.add(new Employee("Debashish", 43, "Delhi", "deptA"));
		linkList1.add(new Employee("Kaushik", 27, "Mumbai", "deptA"));
		
		Collections.sort(linkList1, new NameComparator());
		
		System.out.println(linkList1);
		
		System.out.println("***max val***"+Collections.max(linkList1, new NameComparator()));
		System.out.println("***min val***"+Collections.min(linkList1, new NameComparator()));
		
		List<String> nameList = new LinkedList<String>();
		for (Employee employee: linkList1) {
			nameList.add(employee.getName());
		}
		Collections.sort(nameList);
		System.out.println(nameList);

	}

}
