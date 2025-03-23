package ex_01_Java_Basic;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Swati");
		linkedList.add("Priya");
		linkedList.add("Shaswat");
		linkedList.add("Preetam");
		linkedList.add("Vikas");
		linkedList.add("Ritu");
		for (String item:linkedList) {
			System.out.println(item);
		}

	}

}
