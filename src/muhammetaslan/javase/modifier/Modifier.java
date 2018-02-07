package muhammetaslan.javase.modifier;

import java.util.logging.Logger;

/*
 * java da iki çeþit modifier mecuttur.
 *	
 * access modifiers ; public protected private
 * non-access ; final ve abstract
 * 
 * access modifier lar class tanýmlar iken sadece public seviye tanýmlanabilir.
 * diðer classlar package level dir.
 * 
 * 
 */

/*
 * eger ki bir A class ý B class ýna ulaþabiliyor ise bunu üç þekilde yapabilir
 * 
 * 1 ) create an instance of B => B b_obj = new B(); 
 * 2 ) extends class B => class A extends B
 * 3 ) yada access kontrol yolu ile yani B class ýndaki method veya variableslar ýn access levelleri 
 * 		vasýtasý ile public protexted , private
 * 
 */

/*
 * 	java da bir .java dosyasi altýnda yalnýca bir public class olur diðerlerinin access levelleri package 
 *  leveldir yani içinde bulunduklarý paket içinden ulaþýla bilirler 
 *   Default = package level
 *   
 * 
 * */
public class Modifier {

	public String hello1 = "hello public";
	protected String hello2 = "hello protected";
	private String hello3 = "hello private";


	public static void main(String[] args) {
		
		System.out.println("Modifier class main");
		
		A a_obj = new A();
		
		a_obj.toString();
	}
}// end of class modifier

// pacakage lavel class A
class A{
	
	private int value_1;
	private int value_2;
	public String $nameOfClass;
	
	
	
	public A() {
		super();
		this.value_1 = 1;
		this.value_2 = 2;
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

	@Override
	public String toString() {
		return "A [value_1=" + value_1 + ", value_2=" + value_2 + ", $nameOfClass=" + $nameOfClass + "]";
	}
	
	
	
	
}