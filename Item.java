
public class Item {
	
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	public Item() {
		itemQuantity = 0;
		itemPrice = 0.0;
		itemName = "none";
	}
	
	public Item(String name, double price, int itemQuantity) {
		this.itemName = name;
		this.itemPrice = price;
		this.itemQuantity = itemQuantity;
	}
	
	public void printItemCost() {
		System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
	}
	
	public String getName() {
		return itemName;
	}
	
	public void setName(String name) {
		this.itemName = name;
	}
	
	public double getPrice() {
		return itemPrice;
	}
	
	public void setPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
