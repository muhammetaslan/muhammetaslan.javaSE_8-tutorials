package muhammetaslan.javase.interface_declaration;

// interface javada içinde belirli variabler ve metodlar bulunduran class 'lara þablon yapýdaki .java uzantýlý belgelerdir
// ( java 8 le birlikte default ve static metotlar tanimlayabiliyoruz )
// interface'lerin methodlarý gövdesizve abstractýr.
// bir class birden fazla interface 'i implement edebilir.
public interface MyInterface {
	
	public int price = 0;
	String name = "muhammet";
	
	// The blank final field surname may not have been initialized
	// interface içinde tanýmlanan degerler bos býrakýlamaz mutlaka bir deger atanmalý
	//public String surname ;
	
	/*
	 * Illegal modifier only public, static & final are permitted
	 * Interface içindeki degerler acces modoifer olarak sadece public ve defult olabilirler
	private int price1 = 0;
	protected int price2 = 0;
	*/
	
}
