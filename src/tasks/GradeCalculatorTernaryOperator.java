package tasks;

public class GradeCalculatorTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that calculates and displays the letter grade for a given
		 * numerical score (e.g., A, B, C, D, or F) based on the following grading
		 * scale:
		 * 
		 * A: 90-100
		 * B: 80-89
		 * C: 70-79
		 * D: 60-69
		 * F: 0-59
		 */
		
		Integer marks=Integer.parseInt(args[0]);
		String grade="";
		
		grade=marks>=90? "A":
			(marks>=80 && marks<=89?"B":
				(marks>=70 && marks<=79?"C":
					(marks>=60 && marks<=69?"D": "F")));
		System.out.println("grade="+grade);
				

	}

}
