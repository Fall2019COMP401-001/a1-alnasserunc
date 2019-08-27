package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// store's input
		int numberOfItems = scan.nextInt();
		
		// even: name
		// odd: price 
		String[] itemsPrices = new String[numberOfItems * 2];
		
		for (int i = 0; i < numberOfItems; i++) {
			itemsPrices[i * 2] = scan.next(); // name
			itemsPrices[i * 2 + 1] = scan.next(); // price
		}
		
	}
}
