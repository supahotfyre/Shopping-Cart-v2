import java.util.ArrayList;

public class ShoppingCart {

	private String customerName;
	private String currentDate;
	ArrayList<ItemToPurchase> cartItems = null;
	
	public ShoppingCart() {
		this.cartItems = new ArrayList<ItemToPurchase>();
		currentDate = "December 1, 2021";
		customerName = "none";
				
	}
	
	public ShoppingCart(String name, String date) {
		this.cartItems = new ArrayList<ItemToPurchase>();
		this.currentDate = date;
		this.customerName = name;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCurrentDate() {
		return currentDate;
	}
	
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	public void addItem(ItemToPurchase i) {
		cartItems.add(i);
	}
	
	public void removeItem(String name) {
		boolean found = false;
		
		for (ItemToPurchase i : cartItems) {
			if (i.getName().equalsIgnoreCase(name)) {
				cartItems.remove(i);
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("Item not found in cart. Nothing removed");
		}
	}
	
	public int getNumItemsInCart() {
		int sum = 0;
		
		for (ItemToPurchase i : cartItems) {
			sum = sum + i.getItemQuantity();
		}
		return sum;
	}
	
	public double getCostOfCart() {
		double sum = 0;
		
		for (ItemToPurchase i : cartItems) {
			sum = sum + i.getPrice();
		}
		return sum;
	}
	
	public void printTotal() {
		int tot = 0;
		
		if (cartItems != null && cartItems.size() > 0) {
			System.out.println(customerName + "'s Shopping Cart - " + currentDate);
			System.out.println("Number of Items: " + getNumItemsInCart());
			System.out.println();
			
			for (ItemToPurchase i : cartItems) {
				tot += i.getPrice() * i.getItemQuantity();
				i.printItemCost();
			}
			
			System.out.println("\nTotal: $" + tot);
		}
		
		else {
			System.out.println("SHOPPING CART IS EMPTY");
		}
		
	}
	
	public void printDescriptions() {
		System.out.println(customerName = "'s Shopping Cart - " + currentDate);
		System.out.println("Number of Items: " + getNumItemsInCart());
		System.out.println();
		System.out.println("Item Descriptions");
		
		for (ItemToPurchase i : cartItems) {
			i.printItemDescription();
		}
	}
	
}
