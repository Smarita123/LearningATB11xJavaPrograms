package ex_01_Java_Basic;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		/*
		 * Write a program that calculates and displays the letter grade for a given
		 * numerical score (e.g., A, B, C, D, or F) based on the following grading
		 * scale:
		 * 
		 * A: 90-100 
		 * B: 80-89 
		 * C: 70-79 
		 * D: 60-69 
		 * F: 0-59
		 */

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your Score in numbers");
		Integer score=scanner.nextInt();
		String grade;
		
		if (score>=90 && score<=100) {
			grade="A";
			System.out.println("Grade="+grade);
		}else if (score>=80 && score<=89) {
			grade="B";
			System.out.println("Grade="+grade);
		}else if (score>=70 && score<=79) {
			grade="C";
			System.out.println("Grade="+grade);
		}else if (score>=60 && score<=69) {
			grade="D";
			System.out.println("Grade="+grade);
		}else if (score>=0 && score<=59) {
			grade="F";
			System.out.println("Grade="+grade);
		}

	}

}
