package muhammetaslan.javase.Access1;

import java.util.Date;

public class Card {

	// private level sadece tan�mland��� class i�inde ula��labilir.
	// bu class ba�ka bir class taraf�ndan kal�t�lsa bile bu de�i�kene ula��m olmaz
	private int cardNumber;
	
	// default - package level 
	String custerName;
	
	// public variable t�m class 'larda ula��labilir.
	public Date usageDate;
	
	// sadece ayn� paketten ula��m olur
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
	
	// variable olu�turma ve access modifier 'e g�re ula��m kurallar� methodlar i�inde ayn�d�r
	
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
