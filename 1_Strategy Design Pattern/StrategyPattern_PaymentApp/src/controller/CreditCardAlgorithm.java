package controller;

public class CreditCardAlgorithm implements Payment {

	private String name;
	private String cardNo;
			
	public CreditCardAlgorithm(String name, String cardNo) {
		this.name = name;
		this.cardNo = cardNo;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with Card");
	}

}
