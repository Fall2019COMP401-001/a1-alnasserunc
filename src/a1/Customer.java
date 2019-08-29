package a1;

public class Customer {
	String firstName, lastName;
	int itemCount;
	double amountSpent;
	Item[] itemsBought;
	
	public Customer() {
		firstName = "";
		lastName = "";
		itemCount =  0;
		amountSpent = 0.0;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	public void setLastName(String name) {
		lastName = name;
	}
}