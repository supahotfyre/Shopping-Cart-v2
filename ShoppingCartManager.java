import java.util.Scanner;

public class ShoppingCartManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Customer's Name: ");
		String customerName = scnr.nextLine();
		System.out.println("Enter Today's Date: ");
		String currentDate = scnr.nextLine();
		
		ShoppingCart s = new ShoppingCart(customerName, currentDate);
		
		System.out.println();
		System.out.println("Customer Name: " + s.getCustomerName());
		System.out.println("Today's Date: " + s.getCurrentDate());
		printMenu(s);
	}
	
	public static void printMenu(ShoppingCart s) {
		while(true) {
			System.out.println("MENU\na - Add item to cart\nd - Remove item from cart\nc - Change item quantity\ni - Output items' descriptions\no - Output shopping cart\nq - Quit\n\nChoose an option: ");
			Scanner scnr = new Scanner(System.in);
			char ch = scnr.next().charAt(0);
			scnr.nextLine();
			
			if (ch == 'a' || ch == 'A') {
				System.out.println("ADD ITEM TO CART");
				System.out.println("Enter Item Name: ");
				String name = scnr.nextLine();
				System.out.println("Enter Item Description: ");
				String itemDescritpion = scnr.nextLine();
				System.out.println("Enter Item Price: ");
				int itemPrice = scnr.nextInt();
				System.out.println("Enter Item Quantity: ");
				int quantity = scnr.nextInt();
				scnr.nextLine();
				ItemToPurchase item = new ItemToPurchase(name, itemDescritpion,itemPrice, quantity);
				s.addItem(item);
			}
			
			else if (ch == 'd' || ch == 'D') {
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of the item to remove: ");
				String name = scnr.nextLine();
				s.removeItem(name);
			}
			
			else if (ch == 'c' || ch == 'C') {
				System.out.println("CHANGE ITEM QUANTITY");
				System.out.println("Enter the item name: ");
				String name = scnr.nextLine();
				System.out.println("Enter the new quantity: ");
				int quantity = scnr.nextInt();
				ItemToPurchase item = new ItemToPurchase();
				item.setName(name);
				item.setItemQuantity(quantity);
				s.modifyItem(item);
			}
			
			else if (ch == 'I' || ch == 'i') {
				System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
				s.printDescriptions();
			}
			
			else if (ch == 'O' || ch == 'o') {
				System.out.println("OUTPUT SHOPPING CART");
				s.printTotal();
			}
			
			else if (ch == 'q' || ch == 'Q') {
				break;
			}
		}
	}
	
	
}
