package muhammetaslan.javase.modifiertest;

import muhammetaslan.javase.modifier.AbstractClass;
import muhammetaslan.javase.modifier.Modifier;
import muhammetaslan.javase.modifier.NonAccessModifier;

public class ClassAccessTest {

	public static void main(String[] args) {
		
		// Abstract class lar�n objesi olu�turalamaz
		//AbstractClass abst_obj = new AbstractClass();
		
		// Modifier class � public oldugundan baska bir paket i�indeki classta import edildi�inde 
		// ula��labiliyor.
		Modifier m_obj = new Modifier(1, 2,3, "hello","hello2","hello2");
		
		System.out.println(m_obj.getNum1());
	
	}

}
