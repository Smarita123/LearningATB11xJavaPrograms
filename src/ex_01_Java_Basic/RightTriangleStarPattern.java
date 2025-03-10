package ex_01_Java_Basic;

import java.lang.reflect.Array;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		/*
		 
		 * 
		 **
		 ***
		 ****
		 *****
		 
		*/
		
		String[][] arr=new String[5][5] ;
		
		for (int i=0;i<5;i++){
			System.out.println();
			for (int j=0;j<i+1;j++){
			arr[i][j]="*";
			System.out.print(arr[i][j]);
			}
		}

	}

}
