package tasks;

import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Take a user input - Name, Age and Salary and print them in the end. */
		
		//Using Scanner class
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Name");
		String name=scanner.nextLine();
		
		System.out.println("Enter Age");
		int age=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter Salary");
		int salary=scanner.nextInt();
		
		System.out.println("For Employee name="+name+", age="+age+", and salary="+salary);
		
		//Using CLI option in Run Configurations
		System.out.println("For Employee name="+args[0]+", age="+args[1]+", and salary="+args[2]);
		
		

	}

}
