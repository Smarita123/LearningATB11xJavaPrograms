package ex_01_Java_Basic;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * Write a program that prints numbers from 1 to 100. However, for multiples of
		 * 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
		 * For numbers that are multiples of both 3 and 5, print "FizzBuzz."
		 */

		
		int num=1;
		for (num=1;num<101;num++) {
			if (num%3==0){
				if(num%5==0) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println("Fizz");
				}
			}else if(num%5==0) {
				System.out.println("Buzz");
			}else System.out.println(num);
		}

	}

}
