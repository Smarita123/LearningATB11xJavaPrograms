package LeetcodeChallenges;

import java.util.HashMap;
import java.util.Map;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="101010";
		String b="101011";		
		addBinary(a,b);		

	}

	private static void addBinary(String a, String b) {
		if (a.length()<b.length()) {
			int differenceInLength=b.length()-a.length();
			for (int i=0; i<differenceInLength; i++) {
				a="0"+a;
			}
		}else if(b.length()<a.length()) {
			int differenceInLength=a.length()-b.length();
			for (int i=0; i<differenceInLength; i++) {
				b="0"+b;
			}
		}
		System.out.println(a);
		System.out.println(b);
		String result="";
		char sum;
		char carry='0';
		
		for (int i=a.length()-1; i>=0; i--) {
			Map<String, Character> map=sum(a.charAt(i),b.charAt(i), carry);
			sum=map.get("Sum");
			carry=map.get("Carry");
			result=sum+result;
			
		}
		if (carry=='1') {
			result=carry+result;
		}
		System.out.println(result);
	}

	private static Map<String, Character> sum(char a, char b, char carry) {
		// TODO Auto-generated method stub
		char sum='0';
		if (carry=='0'){
				if(a=='0' && b=='0') {
					sum= '0';
					carry= '0';
				}else if((a=='1' && b=='0') || (a=='0' && b=='1')) {
					sum= '1';
					carry= '0';
				}else if(a=='1' && b=='1') {
					sum= '0';
					carry= '1';
				}
		}else if (carry=='1'){
			if(a=='0' && b=='0') {
				sum= '1';
				carry= '0';
			}else if((a=='1' && b=='0') || (a=='0' && b=='1')) {
				sum= '0';
				carry= '1';
			}else if(a=='1' && b=='1') {
				sum= '1';
				carry= '1';
			}
		}
			
		Map<String, Character> map = new HashMap<String, Character>();
		map.put("Sum", sum);
		map.put("Carry", carry);
		return map;
		
	}

}
