package playWithEmployeeRecords;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	/*
	 * This class implements Comparator<Employee>, and it is used to sort employees
	 * by name.
	 */
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		String name1=e1.getName();
		String name2=e2.getName();
		return (name1.compareTo(name2));
		//return (name2.compareTo(name1));
	}			
}


