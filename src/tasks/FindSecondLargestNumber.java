package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {50, 37, 44, 10, 22, 100, 33, 73, 8};
		int[] sortedArray=sort(array);
		System.out.println(Arrays.toString(sortedArray));
		System.out.println("Second largest="+sortedArray[1]);
		ArrayList<Integer> aa=  new ArrayList<Integer>();

	}

	private static int[] sort(int[] array) {
		
		for (int i=0; i<array.length-1; i++) {
			for (int j=i+1; j<array.length; j++) {
				if(array[i]<array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
						
			}
			
		}
		
		return array;
	}

}
