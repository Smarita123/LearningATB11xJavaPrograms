package ex_01_Java_Basic;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		/*
		 * Create a program that determines whether a given year is a leap year. A leap
		 * year is divisible by 4, but not by 100 unless it is also divisible by 400.
		 * Use an if-else statement to make this determination.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year:");
		Integer year= scanner.nextInt();
		if ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 &&year%400==0)) {
			System.out.println("The year "+year+" is a leap year");
		}else {
			System.out.println("The year "+year+" is NOT a leap year");
		}

	}

}
