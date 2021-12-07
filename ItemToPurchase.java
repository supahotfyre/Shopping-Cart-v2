
public class ItemToPurchase {
	private String itemDescription;
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	
	public ItemToPurchase() {
		itemDescription = "none";
		itemQuantity = 0;
		itemPrice = 0;
		itemName = "";
	}
	
	public ItemToPurchase(String name, String description, int price, int itemQuantity) {
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
	
	public int getPrice() {
		return itemPrice;
	}
	
	public void setPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
