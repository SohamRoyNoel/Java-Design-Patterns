import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShopingCart;
import model.Product;

public class Main {

	public static void main(String[] args) {

		ShopingCart cart = new ShopingCart();
		
		Product pants = new Product("pants", 7485);
		Product underpants = new Product("chaddi", 7400);
		
		cart.addProduct(pants);
		cart.addProduct(underpants);
		
		cart.pay(new CreditCardAlgorithm("Soham", "4145894165165"));
		cart.pay(new PaypalAlgorithm("s@gmail.com", "748596"));
	}

}
