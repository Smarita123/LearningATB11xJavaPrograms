package tasks;

import java.util.ArrayList;

public class EvenOrOddInArray {

	public static void main(String[] args) {
		// Odd and Even Numbers from an Array
		
		int[] array = {25,22,47,89,59,30,44};
		
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		
		for (int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				evenNumbers.add(array[i]);
			}else {
				oddNumbers.add(array[i]);
			}
		}
		System.out.println("Even numbers"+evenNumbers);
		System.out.println("Odd numbers"+oddNumbers);
	

	}

}
