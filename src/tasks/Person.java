package tasks;

public class Person {

	//Create a Class with the Person - where we have DC, PC , two types.

	int age;
	String name, address, phone;
	Gender gender;
	Boolean isMale;


	enum Gender {
		MALE, FEMALE
	}

	//Default constructor
	public Person() {
		System.out.println("Default constructor called");
	}

	//Parameterized constructor
	public Person(int age, String name, String address, String phone, Gender gender) {
		System.out.println("First Parameterized constructor called");
		this.age=age;
		this.name=name;
		this.address=address;
		this.gender=gender;
		if (gender==Gender.MALE) {
			this.isMale=true;
		}else {
			this.isMale=false;
		}
		this.phone=phone;

	}
	public Person(int age, String name, String address, String phone, Boolean isMale) {
		System.out.println("Second Parameterized constructor called");
		this.age=age;
		this.name=name;
		this.address=address;
		//this.gender=gender;
		if (isMale=true) {
			this.gender=Gender.MALE;
		}else {
			this.gender=Gender.FEMALE;
		}
		this.phone=phone;

	}

	public static void main(String[] args) {
		// Call the default constructor
		Person person1= new Person();
		System.out.println(person1);

		System.out.println("***********************************");
		// Call the first Parameterized constructor
		Person person2= new Person(30, "Prachi", "Mumbai", "9876543210", Gender.FEMALE);
		System.out.println(person2);

		System.out.println("***********************************");
		// Call the second Parameterized constructor
		Person person3= new Person(30, "Subrat", "Delhi", "9871898211", true);
		System.out.println(person3);
		
		person3.printDetails();


	}

	public String toString() {
		String str="Age="+age+" Name="+name+" Address="+address+" Phone="+phone+" Gender="+gender;
		return str;
	}

	public void eat() {
		System.out.println("Eating...");
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
	public void walk() {
		System.out.println("Walking...");
	}
	public void doHome() {
		System.out.println("Doing Homework...");
	}
	public void printDetails() {
		System.out.println("Printing details...");
		System.out.println(this.toString());
	}

}
