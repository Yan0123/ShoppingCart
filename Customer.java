import java.util.ArrayList;

public class Customer extends User {
	private double point;

	public Customer(String name, String phone, String email, String password, String address) {
		super(name, phone, email, password, address );
		System.out.printf("Please enter 3 products\n");
		ShoppingCart cart = new ShoppingCart();
		point = cart.getTotalPrice() ;
		System.out.printf("\n");
		Order orderDetails = new Order();
		System.out.printf("\nName : %s", getName());
		System.out.printf("\nTel : %s", getPhone());
		System.out.printf("\nAddress : %s", getAddress());
		System.out.print("\n");
		System.out.printf("\nOrder Items");
		System.out.print("\n--------------");
		System.out.print("\nName             Qty            Total");
		System.out.printf("\n%s              %d           RM%.2f ",cart.getAddedItems().get(0).getName(),cart.getAddedItems().get(0).getQty(),cart.getAddedItems().get(0).getPrice()*cart.getAddedItems().get(0).getQty());
		System.out.printf("\n%s              %d           RM%.2f ",cart.getAddedItems().get(1).getName(),cart.getAddedItems().get(1).getQty(),cart.getAddedItems().get(1).getPrice()*cart.getAddedItems().get(1).getQty());
		System.out.printf("\n%s              %d           RM%.2f ",cart.getAddedItems().get(1).getName(),cart.getAddedItems().get(2).getQty(),cart.getAddedItems().get(2).getPrice()*cart.getAddedItems().get(2).getQty());
		System.out.printf("\n");
		System.out.printf("\nTotal amount paid: RM%.2f", cart.getTotalPrice());
		
		System.out.print("\n" + getPoint());
	}
	
	public void setPoint(double num) {
		point = num;
	}
	
	public double getPoint() {
		return point;
	}
	
	
	

}
