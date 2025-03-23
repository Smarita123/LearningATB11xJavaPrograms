package tasks;

public class CountVowelAndConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Good, morning, dear!!!";
		int[] countVowelsAndConsonents=countVowelsAndConsonents(str);
		System.out.println("Vowels:"+countVowelsAndConsonents[0]);
		System.out.println("Consonants:"+countVowelsAndConsonents[1]);

	}

	private static int[] countVowelsAndConsonents(String str) {
		str=str.toLowerCase();
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		int vowelCount=0;
		int consonentCount=0;
		for (int i=0;i<str.length();i++) {
			
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowelCount++;
			}else consonentCount++;
		}
		return new int[] {vowelCount, consonentCount};
	}

}
