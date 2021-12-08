import java.util.ArrayList;

public class ShoppingCart {

	private String customerName;
	private String currentDate;
	private ArrayList<Item> cartItems = new ArrayList<Item>();
	
	public ShoppingCart() {
		this.cartItems = new ArrayList<Item>();
		currentDate = "December 1, 2021";
		customerName = "none";
				
	}
	
	public ShoppingCart(String name, String date) {
		this.cartItems = new ArrayList<Item>();
		this.currentDate = date;
		this.customerName = name;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getDate() {
		return currentDate;
	}
	
	public void setDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	public void addItem(Item i) {
		cartItems.add(i);
	}
	
	public void removeItem(String name) {
		boolean found = false;
		
		for (Item i: cartItems) {
			if (i.getName().equalsIgnoreCase(name)) {
				cartItems.remove(i);
				found = true;
				break;
			}
		}
		
		if (!found) 
		System.out.println("Item not found in cart. Nothing removed");
		
	}
	
	public void modifyItem(Item item) {
		boolean found = false;
		  
		for (Item i: cartItems) {
			if (i.getName().equalsIgnoreCase(item.getName())) {
				i.setItemQuantity(item.getItemQuantity());
		  
				found = true;
				break;
			}
		}
		
		if (!found)
		System.out.println("Item not found in cart. Nothing removed");
	}
	
	
	public int getNumItemsInCart() {
		int sum = 0;
		
		for (Item i: cartItems) {
			sum = sum + i.getItemQuantity();
		}
		return sum;
	}
	
	public double getCostOfCart() {
		double sum = 0;
		
		for (Item i: cartItems) {
			sum = sum + i.getPrice();
		}
		return sum;
	}
	
	public void printTotal() {
		double tot = 0;
		
		if (cartItems != null && cartItems.size() > 0) {
			System.out.println(customerName + "'s Shopping Cart - " + currentDate);
			System.out.println("Number of Items: " + getNumItemsInCart());
			System.out.println();
			
			for (Item i : cartItems) {
				tot += i.getPrice() * i.getItemQuantity();
				i.printItemCost();
			}
			
			System.out.println("\nTotal: $" + tot);
			System.out.println();
		}
		
		else {
			System.out.println("SHOPPING CART IS EMPTY");
		}
	}
	
}
