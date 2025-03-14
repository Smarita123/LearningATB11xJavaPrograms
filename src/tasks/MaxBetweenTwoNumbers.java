package tasks;

public class MaxBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Take a user input 2 numbers from the arguments and calculate the maximum in
		 * between with ternary operator.
		 */
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		
		int max;
		max= x>y? x : y;
		
		System.out.println("max is "+max);

	}

}
