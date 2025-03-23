package playWithEmployeeRecords;

import java.util.HashMap;
import java.util.Map.Entry;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Employee> employeeMap = new HashMap<Integer,Employee>();
		employeeMap.put(10001, new Employee("Shweta", 23, "Mumbai", "deptA"));
		employeeMap.put(10002, new Employee("Pradyumna", 30, "Delhi", "deptA"));
		employeeMap.put(10003, new Employee("Preeti", 25, "Mumbai", "deptB"));
		employeeMap.put(10004, new Employee("Prachi", 29, "Delhi", "deptB"));
		employeeMap.put(10005, new Employee("Hari", 70, "Mumbai", "deptA"));
		employeeMap.put(10006, new Employee("Arnab", 56, "Delhi", "deptB"));
		employeeMap.put(10007, new Employee("Debashish", 43, "Delhi", "deptA"));
		employeeMap.put(10008, new Employee("Kaushik", 27, "Mumbai", "deptA"));
		System.out.println("*******Iterating over Key Set*********");
		for(Integer key:employeeMap.keySet()) {
			System.out.println(key+"->"+employeeMap.get(key));
		}
		System.out.println("*******Iterating over Entry set*******");
		for(Entry<Integer, Employee> entry:employeeMap.entrySet()) {
			System.out.println(entry);
		}
	
	}

}
