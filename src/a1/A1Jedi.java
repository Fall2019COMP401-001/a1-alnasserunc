package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

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
		
		// customers' input
		int numberOfCustomers = scan.nextInt();
		Customer[] customers = new Customer[numberOfCustomers];
		
		for (int i = 0; i < customers.length; i++) {
			// fill out the customers data
			
			Customer currentCustomer = new Customer();
			customers[i] = currentCustomer;
			
			customers[i].setFirstName(scan.next());
			customers[i].setLastName(scan.next());
			customers[i].itemCount = scan.nextInt();
			customers[i].itemsBought = new Item[customers[i].itemCount];
			
			for (int j = 0; j < customers[i].itemCount;  j++) {
				// fill out each item's info
				Item currentItem = new Item();
				customers[i].itemsBought[j] = currentItem;
				customers[i].itemsBought[j].quantity = scan.nextInt();
				customers[i].itemsBought[j].name = scan.next();
			}
		}
		
		String[] itemNames = new String[numberOfItems];
		int[] customerCount =  new int[numberOfItems];
		int[] itemCount =  new int[numberOfItems];
		
		for (int i = 0; i < numberOfItems; i++) {
			itemNames[i] = itemsPrices[i * 2];
			customerCount[i] = 0;
			itemCount[i] = 0;
		}
		
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers[i].itemsBought.length; j++) {
				customerCount[findIndex(itemNames, numberOfItems, customers[i].itemsBought[j].name)] += 1;
				itemCount[findIndex(itemNames, numberOfItems, customers[i].itemsBought[j].name)] += customers[i].itemsBought[j].quantity;
			}
		}
		
		for (int i = 0; i < numberOfItems; i++) {
			if (customerCount[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customerCount[i] + " customers bought " + itemCount[i] + " " + itemNames[i]);
			}
		}
		
	}
	
	public static int findIndex (String[] arr, int len, String str) {
		for (int i = 0; i < len; i++) {
			if (arr[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
}
