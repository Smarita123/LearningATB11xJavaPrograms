package tasks;

public class FibonacciSeries {
	
	//print the first 30 numbers in the Fibonacci sequence!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 100;
		Integer x=0; Integer y=1;
		System.out.println(x);
		System.out.println(y);
		for (int i=2; i<30; i++) {
			int temp=y;
			y=y+x;
			x=temp;
			System.out.println(y);
		}

	}

}
