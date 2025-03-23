package ex_01_Java_Basic;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Given an array of integers nums and an integer target, return indices of the
		 * two numbers such that they add up to target.
		 */
		
		Integer[] numbers = {0, 10, 20, 30, 40, 50};
		Integer target=40;
		for (int i=0; i<numbers.length; i++) {
			Integer compliment=target-numbers[i];
			if (compliment>0){
				for (int j=0; j<(numbers.length); j++) {
					if (numbers[j].equals(compliment)){
						Integer[] result = {i,j};
						System.out.println(Arrays.toString(result));
						//System.out.println("{"+i+","+j+"}");
					}
					
				}
			}
			
		}
		

	}

}
