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
				
				// calculate how much each customer spends
				customers[i].amountSpent += customers[i].itemsBought[j].quantity 
						* lookUpPrice(itemsPrices, customers[i].itemsBought[j].name);
			}
		}
		
		scan.close();
		
		System.out.println("Biggest: " + biggest(customers).firstName + " " + biggest(customers).lastName + " (" + biggest(customers).amountSpent + ")");
		System.out.println("Smallest: " + smallest(customers).firstName + " " + smallest(customers).lastName + " (" + smallest(customers).amountSpent + ")");
		System.out.println("Average: " + String.format("%.2f", sum(customers) / customers.length));
		
	}
	
	public static double lookUpPrice (String[] priceList, String item) {
		for (int i = 0; i < priceList.length / 2; i++) {
			if (priceList[i * 2].equals(item)) {
				return Double.parseDouble(priceList[i * 2 + 1]);
			}
		}
		
		return 0.0;
	}
	public static Customer biggest (Customer[] customers) {
		// assume customers.length is always > 0
		Customer big = customers[0];
		
		for (int i = 1; i < customers.length; i++) {
			if (customers[i].amountSpent > big.amountSpent) {
				big = customers[i];
			}
		}
		
		return big;
	}
	public static Customer smallest (Customer[] customers) {
		// assume customers.length is always > 0
		Customer small = customers[0];
		
		for (int i = 1; i < customers.length; i++) {
			if (customers[i].amountSpent < small.amountSpent) {
				small = customers[i];
			}
		}
		
		return small;
	}
	public static double sum (Customer[] customers) {
		// assume customers.length is always > 0
		double sum = customers[0].amountSpent;
		
		for (int i = 1; i < customers.length; i++) {
			sum += customers[i].amountSpent;
		}
		
		return sum;
	}
}
