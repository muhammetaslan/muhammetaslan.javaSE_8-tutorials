package muhammetaslan.javase.interface_declaration;

import java.util.List;

interface Deneme1{
	
	public void controlInterface();
	// default
	void getAccount(); 
	
}// end of interface

interface Deneme2{
	
	public void callDog();
	public List<String> showList(); 
	
	/*
	 * not legal
	public int getResult(int a , int b) {
		
	}
	*/
	
	
	// �nterface i�ide static ve default olarak access modifier '� belirli methodlar 
	// i�inde bulunduklar� interface ba�ka bir class tan imlement edildigi zaman illaki Override 
	// edilmek zorunda de�ildir
	
	default void seeAnimals() {
		System.out.println("Default methodlar�n interface'lere de body k�sm� olabilir.Java 8 ile birlikte");
	}
	
	// yine ayn� sekilde static methodlarda body k�sm�na sahip olabilir interface te tan�mlanan
	static String showName() {
		return "muhammet aslan";
	}
	
	
}

public class DefaultAndStaticMethods implements Deneme1,Deneme2{

	@Override
	public void controlInterface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAccount() {
		// TODO Auto-generated method stub
		
	}
	
	//---------------------------- deneme 2 interface
	@Override
	public void callDog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> showList() {
		// TODO Auto-generated method stub
		return null;
	}

}
