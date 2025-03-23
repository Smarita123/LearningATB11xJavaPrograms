package ex_01_Java_Basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class TokenizationExample {
	
	/*
	 * Tokenization refers to the process of breaking a string or text into smaller
	 * pieces (tokens), such as words, numbers, or symbols, based on delimiters
	 * (spaces, commas, etc.). Tokenization is commonly used when reading input from
	 * files, especially when dealing with structured data like CSV files, logs, or
	 * space-separated values.
	 */
	
	public static void tokenizeLine(String line) {
		StringTokenizer tokenizer= new StringTokenizer(line, " ,.;|?");
		
		while(tokenizer.hasMoreTokens()) {
			String token=tokenizer.nextToken();
			System.out.println(token);
		}
	}

	public static void main(String[] args) {

		

		String str="She sells seashells by the seashore. Peter Piper picked a peck of pickled peppers.";
		
		tokenizeLine(str);
		
		//tokenization based on delimiters such as spaces
		String[] tokens=str.split(" ");
		for (String token: tokens) {
			System.out.println(token);
		}
		System.out.println();
		System.out.println();
		//tokenization based on delimiters such as ,
		String vehicleList="Volvo, BMW, Ford, Mazda";
		String[] tokens1=vehicleList.split(", ");
		for (String token: tokens1) {
			System.out.println(token);
		}


		//tokenization using Scanner
		
		Path path=Path.of("C:\\Users\\pc\\eclipse-workspace\\LearningATB11xJavaPrograms\\resources\\example.txt");
		Scanner scanner=null;
		try {
			scanner = new Scanner(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.useDelimiter("[,]");
		while (scanner.hasNext()) {
			String token=scanner.next();   // Get the next token (word, number, etc.)
			token=token.replace("'", "");
			token=token.replace(" ", "");
			System.out.println(token);
			
		}
		
		//tokenize by calling tokenize() method
		try (BufferedReader bufferReader= new BufferedReader(new FileReader(path.toString()))){
			String line;
			while(( line=bufferReader.readLine())!=null) {
				//System.out.println("*****"+line);
				tokenizeLine(line.replace("'", ""));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	

}
