package mate.academy;

public class Customer {

	private Cart cart;

	public Customer() {

	}

	public void addCart(Cart cart) {
		this.cart = cart;
	}

	public void addProduct(Product product) {
		cart.addProduct(product);
	}

	public Cart moveCart() {
		Cart tempCart = cart;
		cart = null;
		return tempCart;
	}

	public void removeProduct(String name) {
		cart.removeProduct(name);
	}
	
	public void getInfo() {
		cart.getInfo();
	}
	
}


