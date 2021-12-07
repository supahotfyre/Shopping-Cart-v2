
public class Item {
	
	private String itemDescription;
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	public Item() {
		itemDescription = "none";
		itemQuantity = 0;
		itemPrice = 0;
		itemName = "";
	}
	
	public Item(String name, String description, double price, int itemQuantity) {
		this.itemDescription = description;
		this.itemName = name;
		this.itemPrice = price;
		this.itemQuantity = itemQuantity;
	}
	
	public String getDescription() {
		return itemDescription;
	}
	
	public void setDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	public void printItemCost() {
		System.out.println(itemName + " " + itemQuantity + " @ " + itemPrice + " = $" + (itemQuantity * itemPrice));
	}
	
	public void printItemDescription() {
		System.out.println(itemName + " " + itemDescription);
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
