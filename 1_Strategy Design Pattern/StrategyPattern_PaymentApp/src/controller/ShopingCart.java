package controller;


import java.util.ArrayList;
import java.util.List;

import model.Product;


public class ShopingCart {

	List<Product> productList;

	public ShopingCart() {
		this.productList = new ArrayList<>();
	}
	
	public void addProduct(Product product) { 
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	public int calculateTotal() {
		int total = 0;
		for (Product product : productList) {
			total += product.getAmount();
		}
		
		return total;
	}
	
	public void pay(Payment paymentStrategy) {
		int payPrice = calculateTotal();
		paymentStrategy.pay(payPrice);
	}
}
