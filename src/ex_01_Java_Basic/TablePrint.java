package ex_01_Java_Basic;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sample input (Enter your number):");
		String number= scanner.nextLine();
		//System.out.println(number);
		Integer n=Integer.valueOf(number);
		//System.out.println(n);
		for (int i=1;i<=10;i++){
			//System.out.println(n);
			//System.out.println(i);
			System.out.println(n+"*"+i+"="+n*(i));
		}

	}

}
