package ex_01_Java_Basic;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// A prime number is only divisible by 1 and itself
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number between 1 to 100:");
		Integer number=scanner.nextInt();
		String type=null;
		for (int i=2;i<100;i++) {
			
			if (!(i == number)) {
				if (number%i==0) {
					type="NOT Prime";
					System.out.println("Number is "+type);
					return;
				}
			}	
		}
		if (type==null) {
			type="Prime";
			System.out.println("Number is "+type);
		}
	}

}
