package ex_01_Java_Basic;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name= {"Supriya", "Priya", "Poonam", "Supriya", "Peter", "Poonam", "Supriya"};
		System.out.println(name.length);
		String[] reverseArray= new String[name.length];
		int index=0;
		for (int i=name.length; i>0;i--) {
			//System.out.println(i); //6  
			if (index<name.length) {
				//System.out.println(index); //0
				//System.out.println("***"+name[i-1]);
				reverseArray[index]=name[i-1]; // reverseArray[0]=name[6]=Supriya
				index++;
			}
		}
		
		System.out.println(Arrays.toString(reverseArray));
	}

}
