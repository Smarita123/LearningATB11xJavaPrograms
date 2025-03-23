package ex_01_Java_Basic;

public class SwitchCaseWithLamda {

	public static void main(String[] args) {
		// Switch case using Lambda
		int day=5;
		switch(day){
			case 1 -> System.out.println("Sunday");
			case 2 -> System.out.println("Monday");
			case 3 -> System.out.println("Tuesday");
			case 4 -> System.out.println("Wednasday");
			case 5 -> System.out.println("Thursday");
			case 6 -> System.out.println("Friday");
			case 7 -> System.out.println("Saturday");
			
		}
			

	}

}
