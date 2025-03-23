package playWithEmployeeRecords;

import java.util.Comparator;
import java.util.Objects;

public class Employee {
	
	String name;
	int age;
	String  place;
	String dept;
	
	public Employee(String name, int age, String place, String dept) {
		this.name=name;
		this.age=age;
		this.place=place;
		this.dept=dept;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "\n"+getName()+" (age:"+getAge()+" place:"+getPlace()+" dept:"+getDept()+")";
	}
	
	/*
	 * In Java, the HashSet is used to store unique elements, but for it to properly
	 * determine whether an object is a duplicate, it needs to be able to
	 * distinguish between two objects of the same type. This is done by the
	 * equals() and hashCode() methods.
	 */
	
	//Overriding equals() to compare Employee objects based on their attributes
	 @Override
	public boolean equals(Object object) {
		 Employee employee= (Employee) object;
		if (employee.getName()==this.name) {
			if (employee.getAge()==this.age) {
				if (employee.getPlace()==this.place) {
					if (employee.getDept()==this.dept) {
						return true;
					}else return false;
				}else return false;
			}else return false;
		}else return false;
	}
	
	  // Overriding hashCode() to generate a hash value based on the attributes
	 @Override
	    public int hashCode() {
	        return Objects.hash(name, age, place, dept);
	    }
	
	
	
	
	
	

}
