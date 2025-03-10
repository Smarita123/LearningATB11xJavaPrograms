package ex_01_Java_Basic;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		*/
		
		String[][] arr=new String[5][5] ;
		
		for (int i=0;i<5;i++){
			System.out.println();
			for (int j=0;j<5-i;j++){
			arr[i][j]="*";
			System.out.print(arr[i][j]);
			}
		}

	}

}
