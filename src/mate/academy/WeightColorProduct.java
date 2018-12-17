package mate.academy;

public class WeightColorProduct extends ColorProduct {

	private int weight;

	public WeightColorProduct() {

	}

	public WeightColorProduct(String name, int price, String color, int weight) {
		super(name, price, color);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Weight: " + weight + "\n");
	}
	
	
	
	

}
