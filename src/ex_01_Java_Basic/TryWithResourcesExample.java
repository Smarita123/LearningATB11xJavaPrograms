package ex_01_Java_Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		// Using try-with-resources to read from a file. Resources are automatically
		// realeased when try block exits
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\pc\\eclipse-workspace\\LearningATB11xJavaPrograms\\resources\\example.txt"))) {

			
			 String line; 
			 while ((line = reader.readLine()) != null) {
				 System.out.println(line); // Read and print each line from the file
				 
			}
			 
			
			// alternative for loop
			 
			for (Object sentence : reader.lines().toArray()) {
				System.out.println(sentence);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// try-with-resources to automatically close BufferedWriter
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				"C:\\Users\\pc\\eclipse-workspace\\LearningATB11xJavaPrograms\\resources\\example.txt"))) {
			writer.write("'Yogesh', 'admin', 'active'\n");
			writer.write("'Poonam', 'developer', 'active'\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * String dbUrl = "jdbc:mysql://localhost:3306/myschema"; String dbUser =
		 * "root"; String dbPassword = "silky";
		 * 
		 * // try-with-resources with multiple resources (BufferedReader and Connection)
		 * try ( BufferedReader br = new BufferedReader(new FileReader(
		 * "C:\\Users\\pc\\eclipse-workspace\\LearningATB11xJavaPrograms\\resources\\example.txt"
		 * )); Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		 * Statement stmt = conn.createStatement() ) { String line; while ((line =
		 * br.readLine()) != null) { // Insert data into database (for example) //insert
		 * into user (login, roles, status) values (?,?,?) String query =
		 * "INSERT INTO user (login, roles, status) VALUES ('" + line + "')";
		 * stmt.executeUpdate(query); } } catch (IOException | SQLException e) {
		 * e.printStackTrace(); }
		 */

		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Swati");
		linkedHashSet.add("Shipra");
		linkedHashSet.add("Danny");
		linkedHashSet.add("Victor");
		linkedHashSet.add("Toral");
		linkedHashSet.add("Binni");

		System.out.println(linkedHashSet);

		TreeSet treeset = new TreeSet();
		treeset.add("Swati");
		treeset.add("Shipra");
		treeset.add("Danny");
		treeset.add("Victor");
		treeset.add("Toral");
		treeset.add("Binni");
		System.out.println(treeset);

		// System.out.println(treeset.descendingSet());

		LinkedHashMap linkHashmap = new LinkedHashMap();
		linkHashmap.put(1, "Swati");
		linkHashmap.put(2, "Shipra");
		linkHashmap.put(3, "Danny");
		linkHashmap.put(4, "Victor");
		linkHashmap.put(5, "Toral");
		linkHashmap.put(6, "Binni");

		System.out.println(linkHashmap.values());

	}
}
