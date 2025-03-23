package ex_01_Java_Basic;

import java.util.Arrays;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArray = {15, 25, 33, 10, 20, 30, 40, 50, 38, 48};
		int largest=0;
		int smallest=100000000;
		int sum=0;
	
		for (int i=0; i<numberArray.length; i++) {
			largest=Math.max(largest, numberArray[i]);
			smallest=Math.min(smallest, numberArray[i]);
			sum=sum+numberArray[i];
		}
		
		System.out.println("largest="+largest);
		System.out.println("smallest="+smallest);
		System.out.println("sum="+sum);
		Arrays.sort(numberArray);
		System.out.println(Arrays.toString(numberArray));
		secondLargestNumber(numberArray);
		secondSmallestNumber(numberArray);
		oddAndEvenNumbers(numberArray);

	}

	private static void oddAndEvenNumbers(int[] numberArray) {
		
		int[] evenNumbers = new int[10];
		int[] oddNumbers = new int[10];
		int evenCount=0, oddCount=0;
		for (int i=0;i<numberArray.length;i++) {
			if (numberArray[i]%2 == 0) {
				evenNumbers[evenCount]=numberArray[i];
				evenCount++;
			}else {
				oddNumbers[oddCount]=numberArray[i];
				oddCount++;
			}
		}
		System.out.println("evenNumbers="+Arrays.toString(evenNumbers));
		System.out.println("oddNumbers="+Arrays.toString(oddNumbers));
	}

	private static int secondSmallestNumber(int[] numberArray) {
		
		int smallest=numberArray[0];
		int secondSmallest=numberArray[0];
	
		Arrays.sort(numberArray);
		secondSmallest=numberArray[1];
		System.out.println("secondSmallest="+secondSmallest);
		return secondSmallest;
		
	}

	private static int secondLargestNumber(int[] numberArray) {
		// TODO Auto-generated method stub
			
		Arrays.sort(numberArray);
		int secondLargest=numberArray[numberArray.length-2];
		System.out.println("seconLargest="+secondLargest);
		return secondLargest;
	}

}
