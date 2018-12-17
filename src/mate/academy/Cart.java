package mate.academy;


public class Cart {

	private Product[] arrayCart = new Product[10];
	int counter = 0;
	int total = 0;

	public void getInfo() {
		int n = 1;
		if (counter == 0) {
			System.out.println("Cart is empty!!!!");
		} else {
			System.out.println("Products list " + counter + " pcs : " + "\n");
			for (int i = 0; i < arrayCart.length; i++) {
				if (arrayCart[i] != null) {
					total = total + arrayCart[i].getPrice();

					System.out.println("Product # " + (n++) + "\n" + "Name: " + arrayCart[i].getName() + "; Price: "
							+ arrayCart[i].getPrice() + "\n");

				}
			}
			System.out.println("Total: " + total);
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

	public void removeProduct(String name) {
		for (int i = 0; i < arrayCart.length; i++) {
			if (arrayCart[i] != null && arrayCart[i].getName().equals(name)) {
				arrayCart[i] = null;
				counter--;
				break;
			}
		}

	}
}