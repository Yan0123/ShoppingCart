public class Item {
    private String name;
	private String description;
	private int stock;
	private double price;
	private String measure;
	private int qty;
	
	public Item() {
		name = null;
		description = null;
		stock = 0;
		price = 0.00;
		measure = null;
	}

	public Item(String name, String description, int stock, double price, String measure) {
		this.name = name;
		this.description = description;
		this.stock = stock;
		this.price = price;
		this.measure = measure;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}
	
	public void setQty(int qty) {
		this.qty=qty;
	}
	
	public int getQty() {
		return qty;
	}

	public String toString() {
		return String.format("\n[name=%s, description=%s, price=%.2f]", name, description, price);
	}
	
	
	
	

}

