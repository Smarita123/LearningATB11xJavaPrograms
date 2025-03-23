package ex_01_Java_Basic;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that classifies a triangle based on its side lengths. Given
		 * three input values representing the lengths of the sides, determine if the
		 * triangle is equilateral (all sides are equal), isosceles (exactly two sides
		 * are equal), or scalene (no sides are equal). Use an if-else statement to
		 * classify the triangle.
		 */
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter length of first side");
		Integer sideA=scanner.nextInt();
		System.out.println("Enter length of second side");
		Integer sideB=scanner.nextInt();
		System.out.println("Enter length of third side");
		Integer sideC=scanner.nextInt();
		
		if (sideA==sideB && sideA==sideC) {
			System.out.println("Its an Equilateral Triangle");
		}else if ((sideA==sideB) || (sideA==sideC) || (sideB==sideC)){
			System.out.println("Its an Isosceles Triangle");
		}else {
			System.out.println("Its an Scalene Triangle");
		}


	}

}
