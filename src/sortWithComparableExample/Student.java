package sortWithComparableExample;

public class Student implements Comparable<Student> {
	
	String name;
	int age;
	String  place;
	String dept;
	
	public Student(String name, int age, String place, String dept) {
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

	@Override
	public int compareTo(Student student) {
		
		return Integer.compare(this.age, student.getAge());
	}
	

}
