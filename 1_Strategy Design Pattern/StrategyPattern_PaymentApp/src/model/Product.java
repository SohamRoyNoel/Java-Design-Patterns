package model;

public class Product {

	private String upcCode;
	private int amount;
	
	public Product(String upcCode, int amount) {
		this.upcCode = upcCode;
		this.amount = amount;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
