package tasks;

public class TriangleClassifier {

	public static void main(String[] args) {

		/*
		 * Write a program that classifies a triangle based on its side lengths. Given
		 * three input values representing the lengths of the sides, determine if the
		 * triangle is equilateral (all sides are equal), isosceles (exactly two sides
		 * are equal), or scalene (no sides are equal). Use an if-else statement to
		 * classify the triangle
		 */
		
		Integer s1=Integer.parseInt(args[0]);
		Integer s2=Integer.parseInt(args[1]);
		Integer s3=Integer.parseInt(args[2]);
		
		String type;
			
		/*
		 * type=(s1==s2 && s2==s3) ? "equilateral" : ((s1==s2 && s2!=s3)? "isosceles":
		 * ((s1!=s2 && s2==s3)? "isosceles" : s1==s3 && s2!=s3? "isosceles" : "scalene"
		 * ));
		 */
		
		
		if (s1==s2 && s2==s3) {
			type="equilateral";
		} else if (s1==s2 && s2!=s3) {
			type="isosceles";
		} else if (s1!=s2 && s2==s3){
			type="isosceles";
		} else if (s1==s3 && s2!=s3){
			type="isosceles";
		} else {
			type="scalene";						
		}
		
		System.out.println(type);

	}

}
