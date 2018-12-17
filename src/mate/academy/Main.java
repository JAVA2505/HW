package mate.academy;

public class Main {

	public static void main(String[] args) {

		Product product1 = new WeightColorProduct();
		Product product2 = new ColorProduct();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();
		Product product7 = new Product();
		Product product8 = new Product();
		Product product9 = new Product();
		Product product10 = new Product();
		
		
		product1.setName("A");
		product1.setPrice(10);
		
		
		product2.setName("B");
		product2.setPrice(10);
		
		product3.setName("C");
		product3.setPrice(10);
		
		product4.setName("D");
		product4.setPrice(10);
		
		product5.setName("E");
		product5.setPrice(10);
		
		product6.setName("F");
		product6.setPrice(10);
		
		product7.setName("G");
		product7.setPrice(10);
		
		product8.setName("J");
		product8.setPrice(10);
		
		product9.setName("I");
		product9.setPrice(10);
		
		product10.setName("K");
		product10.setPrice(10);
		
		
		Cart cart = new Cart();
		Customer customer = new Customer();
		customer.addCart(cart);
		customer.addProduct(product1);
		customer.addProduct(product2);
		customer.addProduct(product3);
		customer.addProduct(product4);
		customer.addProduct(product5);
		customer.addProduct(product6);
		customer.addProduct(product7);
		customer.addProduct(product8);
		customer.addProduct(product9);
		customer.addProduct(product10);
		
				
		customer.removeProduct("A");
		customer.removeProduct("A");
		customer.removeProduct("C");
		customer.removeProduct("D");
		customer.removeProduct("E");
		customer.removeProduct("F");
		customer.removeProduct("G");
		customer.removeProduct("J");
		customer.removeProduct("p");

				
		customer.getInfo();
		
		
		
		
		

	}

}
