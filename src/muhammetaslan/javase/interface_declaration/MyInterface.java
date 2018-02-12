package muhammetaslan.javase.interface_declaration;

// interface javada i�inde belirli variabler ve metodlar bulunduran class 'lara �ablon yap�daki .java uzant�l� belgelerdir
// ( java 8 le birlikte default ve static metotlar tanimlayabiliyoruz )
// interface'lerin methodlar� g�vdesizve abstract�r.
// bir class birden fazla interface 'i implement edebilir.
public interface MyInterface {
	
	public int price = 0;
	String name = "muhammet";
	
	// The blank final field surname may not have been initialized
	// interface i�inde tan�mlanan degerler bos b�rak�lamaz mutlaka bir deger atanmal�
	//public String surname ;
	
	/*
	 * Illegal modifier only public, static & final are permitted
	 * Interface i�indeki degerler acces modoifer olarak sadece public ve defult olabilirler
	private int price1 = 0;
	protected int price2 = 0;
	*/
	
}
