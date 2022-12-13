import java.util.ArrayList;

public class ProductList {
    ArrayList<Item> productsList = new ArrayList<Item>();
	 public ProductList() {
		 System.out.print(productsList);
		 	
	 }
	 
	 public void products() {
		 	Item Almond = new Item("Almond","1 x 100g", 1000, 10.00, "g");
			Item Apple = new Item("Apple","5 piece", 200, 10.00, "piece");
			Item Avacado = new Item("Avacado","1 piece", 150, 2.00, "piece");
			Item AWsarsi = new Item("A&W Sarsi","4 x 320ml", 400, 5.89, "ml");
			Item Cabbages = new Item("Cabbages","1 x 800g+-", 100, 6.00, "g");
			Item WBCabbages = new Item("Wombok Cabbages","1 x 600g+-", 100, 7.00, "g");
			
			productsList.add(Almond);
			productsList.add(Apple);
			productsList.add(Avacado);
			productsList.add(AWsarsi);
			productsList.add(Cabbages);
			productsList.add(WBCabbages);
			
			System.out.print(productsList);

	 }
}
