package muhammetaslan.javase.Access1;

import java.util.Date;

public class Card {

	// private level sadece tanýmlandýðý class içinde ulaþýlabilir.
	// bu class baþka bir class tarafýndan kalýtýlsa bile bu deðiþkene ulaþým olmaz
	private int cardNumber;
	
	// default - package level 
	String custerName;
	
	// public variable tüm class 'larda ulaþýlabilir.
	public Date usageDate;
	
	// sadece ayný paketten ulaþým olur
	protected int securityNumber;

	
	public Card(){
		
	}
	
	public Card(int cardNumber, String custerName, Date usageDate, int securityNumber) {
		super();
		this.cardNumber = cardNumber;
		this.custerName = custerName;
		this.usageDate = usageDate;
		this.securityNumber = securityNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCusterName() {
		return custerName;
	}

	public void setCusterName(String custerName) {
		this.custerName = custerName;
	}

	public Date getUsageDate() {
		return usageDate;
	}

	public void setUsageDate(Date usageDate) {
		this.usageDate = usageDate;
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}
	
	// variable oluþturma ve access modifier 'e göre ulaþým kurallarý methodlar içinde aynýdýr
	
	private String buyItems() {
		return "I am buying somethings";
	}
	
	protected void giveAccessLevel() {
		System.out.println("My access level is protected");
	}
	
	public double calculateCircleArea(int R) {
		
		return Math.PI * Math.pow(R, 2);
	}
	
	void methodDefault() {
		System.out.println("My access level is default package level");
	}
	
}// end of class
