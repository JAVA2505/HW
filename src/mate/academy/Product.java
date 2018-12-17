package mate.academy;

public class Product {
	
	
	
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}



	public Product() {
	}
	
	
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void getInfo() {
		System.out.println("Name: " + name + "\n" + "Price: " + price);
	}
	
}
