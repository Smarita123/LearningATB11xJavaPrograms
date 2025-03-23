package playWithEmployeeRecords;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
	
	/*
	 * This class implements Comparator<Employee>, and it is used to sort employees
	 * by age.
	 */

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return Integer.compare(e1.getAge(), e2.getAge());
	}			
}


