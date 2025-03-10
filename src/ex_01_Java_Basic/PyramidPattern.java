package ex_01_Java_Basic;

public class PyramidPattern {

	public static void main(String[] args) {

		/*
		 
		      * 
		     *** 
		    ***** 
		   ******* 
		  ********* 

		 
		*/
		
		int rows = 10;
		String[][] arr= new String[rows][2*rows];
				
		for (int i=0; i<rows;i++) {
			System.out.println();
			for (int j=0; j<=((rows-1)+i);j++) {
				if (j<((rows-1)-i)) {
					System.out.print(" ");
				}else {
				arr[i][j]="*";
				System.out.print(arr[i][j]);
				}
			}
		}
	}
}
