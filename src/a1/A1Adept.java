package a1;

import java.util.Scanner;



public class A1Adept {
	public class Item {
		String name;
		double price;
		int quantity;
	}
	
	public class Customer {
		String firstName, lastName;
		int itemCount;
		Item[] itemsBought;
		
		public Customer(int amountOfItems) {
			itemsBought = new Item[amountOfItems];
			itemCount = amountOfItems;
		}
	}

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
		
		/* 
		 * An integer count of the number of customers
		 * Then for each customer...
		 * The first name of the customer
		 * The last name of the customer
		   */
		// customers' input
		int numberOfCustomers = scan.nextInt();
		
		
	}
}
