package tasks;

public class TriangleClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer s1=Integer.parseInt(args[0]);
		Integer s2=Integer.parseInt(args[1]);
		Integer s3=Integer.parseInt(args[2]);
		
		String type;
		
		type=(s1==s2 && s2==s3) ? "equilateral" : 
			((s1==s2 && s2!=s3)? "isoseles":
				((s1!=s2 && s2==s3)?  "isoseles" : 
					s1==s3 && s2!=s3? "isosceles" :
							"scalene"  ));
		
		System.out.println(type);

	}

}
