package mate.academy;

public class Cart {

	private Product[] arrayCart = new Product[10];
	int counter = 0;
	

	public void getInfo() {
		System.out.println("Products list " + counter + " pcs : " + "\n");
		for (int i = 0; i < arrayCart.length; i++) {
			if (arrayCart[i] != null) {
				System.out.println("Product # " + (i+1) + "\n" + "Name: " + arrayCart[i].getName()
						+ "; Price: " + arrayCart[i].getPrice() + "\n");
			}
		}
	}

	public void addProduct(Product prodact) {
		for (int i = 0; i < arrayCart.length; i++) {
			if (arrayCart[i] == null) {
				arrayCart[i] = prodact;
				counter++;
				break;
			} else if (arrayCart[arrayCart.length - 1] != null) {
				break;
			} else if (prodact == null) {
				break;
			}
		}
	}

}
