import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    private int qty;
	private double totalPrice = 0.00;
	private ArrayList<Item> availableProducts = new ArrayList<Item>();
	private ArrayList<Item> addedItems = new ArrayList<Item>();
	Scanner input = new Scanner(System.in);
	
	
	public ShoppingCart() {
		System.out.print("\n");
		availableItems();
		System.out.print("\n");
		System.out.print("\nHow many item you want to add (enter 3): ");
		int noItem = input.nextInt();

		//after input for integer, need to add this in prevent String input be skipped
		//prevent next line be skipped
		input.nextLine(); 
		for(int i=0; i<noItem; i++) {
			System.out.print("\n");
			System.out.print("Item Name (please follow name format in list) : ");
			String itemName = input.nextLine();
			System.out.print("\n");
			System.out.print("Item quantity : ");
			int qty = input.nextInt();
			input.nextLine();
			additem(itemName,qty);
		}
		
		setTotalPrice();
		
	}

	
	public void setTotalPrice() {
		for(int i=0; i<getAddedItems().size(); i++) {
			totalPrice = totalPrice +getAddedItems().get(i).getPrice()*getAddedItems().get(i).getQty();
			
		}
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void additem(String itemName, int qty) {
		
		try {
			for(int i=0; i<availableProducts.size(); i++) {
				String name = availableProducts.get(i).getName();
				if(itemName.equals(name)) {
					addedItems.add(availableProducts.get(i));
					availableProducts.get(i).setQty(qty);
				}
				else {
					
				}
			
			}
		}
		catch(Exception e){
			System.out.print("Product is not available now");
			
		}
		
		
	}
		
	
	
	public void availableItems() {
		
		Item Almond = new Item("Almond","1 x 100g", 1000, 10.00, "g");
		Item Apple = new Item("Apple","5 piece", 200, 10.00, "piece");
		Item Avacado = new Item("Avacado","1 piece", 150, 2.00, "piece");
		Item AWsarsi = new Item("A&W Sarsi","4 x 320ml", 400, 5.89, "ml");
		Item Cabbages = new Item("Cabbages","1 x 800g+-", 100, 6.00, "g");
		Item WBCabbages = new Item("Wombok Cabbages","1 x 600g+-", 100, 7.00, "g");
		
		availableProducts.add(Almond);
		availableProducts.add(Apple);
		availableProducts.add(Avacado);
		availableProducts.add(AWsarsi);
		availableProducts.add(Cabbages);
		availableProducts.add(WBCabbages);
		
		System.out.print("Available products: " + availableProducts);
	}


	public ArrayList<Item> getAddedItems() {
		return addedItems;
	}



}
