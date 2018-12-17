package mate.academy;

public class ColorProduct extends Product {
	
	private String color;
	
	

	public ColorProduct() {
		super();
	}

	public ColorProduct(String name, int price, String color) {
		super(name, price);
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Color: " + color + "\n");
	}
	
	
	
}
