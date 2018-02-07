package muhammetaslan.javase.modifier;

import java.util.logging.Logger;

/*
 * java da iki �e�it modifier mecuttur.
 *	
 * access modifiers ; public protected private
 * non-access ; final ve abstract
 * 
 * access modifier lar class tan�mlar iken sadece public seviye tan�mlanabilir.
 * di�er classlar package level dir.
 * 
 * 
 */

/*
 * eger ki bir A class � B class �na ula�abiliyor ise bunu �� �ekilde yapabilir
 * 
 * 1 ) create an instance of B => B b_obj = new B(); 
 * 2 ) extends class B => class A extends B
 * 3 ) yada access kontrol yolu ile yani B class �ndaki method veya variableslar �n access levelleri 
 * 	   vas�tas� ile public protexted , private
 * 
 */

/*
 * 	java da bir .java dosyasi alt�nda yaln�ca bir public class olur di�erlerinin access levelleri package 
 *  leveldir yani i�inde bulunduklar� paket i�inden ula��la bilirler 
 *  Default = package level
 *   
 * 
 * */
public class Modifier extends B {

	public String hello1 = "hello public";
	protected String hello2 = "hello protected";
	private String hello3 = "hello private";
	
	

	public Modifier(int num1, int num2, double price, String hello1, String hello2, String hello3) {
		super(num1, num2, price);
		this.hello1 = hello1;
		this.hello2 = hello2;
		this.hello3 = hello3;
	}

	

	public static void main(String[] args) {
		
		System.out.println("Modifier class main");
		
		A a_obj = new A();
		B b_obj = new B(2,5,12.5);
		
		String toStringA = a_obj.toString();
		
		System.out.println(toStringA + "\n" 
		+ "value 3 access level is protected : "+ a_obj.value_3);
		
		b_obj.setNum1(54);
		
		// class modifier extends class B ama hala addNumbers metodunu g�rm�yor private oldugu i�in bu method
		//int total = b_obj.addNumbers(1,5);
		
		System.out.println(b_obj.getNum1());
	
	}
}// end of class modifier

// pacakage lavel class A
class A{
	
	private int value_1;
	private int value_2;
	protected int value_3;
	public String $nameOfClass;
	
	
	
	public A() {
		super();
		this.value_1 = 1;
		this.value_2 = 2;
		this.value_3 = 3;
		this.$nameOfClass = "class A";
	}
	
	public int getValue_1() {
		return value_1;
	}
	public void setValue_1(int value_1) {
		this.value_1 = value_1;
	}
	public int getValue_2() {
		return value_2;
	}
	public void setValue_2(int value_2) {
		this.value_2 = value_2;
	}
	public int getValue_3() {
		return value_3;
	}

	public void setValue_3(int value_3) {
		this.value_3 = value_3;
	}

	@Override
	public String toString() {
		return "A [value_1=" + value_1 + ", value_2=" + value_2 + ", value_3=" + value_3 + ", $nameOfClass="
				+ $nameOfClass + "]";
	}
	
}

class B{
	
	private int num1;
	private int num2;
	private double price;
	
	public B(int num1, int num2, double price) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.price = price;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private int addNumbers(int a,int b) {
		
		return a + b ;
	}
	@Override
	public String toString() {
		return "B [num1=" + num1 + ", num2=" + num2 + ", price=" + price + "]";
	}
	
	

	
}

/*
 * class 'lar protected ve private access level degerlerini alamazlar
 * 
 * sadece public , default yani package level yada non-access modifier olarak abstrac veya final olur 
 * 
protected class B{
	
}

private class C{
	
}
*/

