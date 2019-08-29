package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		// number of customers
		// first name
		// last name
		// number of items
		
		// quantity
		// name of item
		// price
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfCustomers = scan.nextInt();
		
		String[] outputString = new String[numberOfCustomers];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			
			int numberOfItems = scan.nextInt();
			
			// input the items to be purchased
			String[][] items = new String[3][numberOfItems];
			for (int j = 0; j < numberOfItems; j++) {
				items[0][j] = scan.next();
				items[1][j] = scan.next();
				items[2][j] = scan.next();
			}
			
			scan.close();
			
			// calculate the output and save it
			double sum = 0.0;
			for (int j = 0; j < numberOfItems; j++) {
				// source: https://www.journaldev.com/18392/java-convert-string-to-double
				sum += Double.parseDouble(items[0][j]) * Double.parseDouble(items[2][j]);
			}
			
			outputString[i] = firstName.substring(0, 1) + ". " + lastName + ": " + String.format("%.2f", sum);
		}
		
		// print the output to the console
		for (int i = 0; i < numberOfCustomers; i++) {
			System.out.println(outputString[i]);
		}
	}
}
