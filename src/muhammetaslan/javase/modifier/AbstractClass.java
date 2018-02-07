package muhammetaslan.javase.modifier;

//bir sinif eger abstract olarak tanimlanmissa bu durumda bu sinifin kalitilacagi anlamina gelmektedir.
//final ise kalitima engeldir!
//abstract anahtar kelimesi class ve metot taniminda kullanilabilir, degiskenler icin boyle bir sey yoktur.
//abstract classlardan nesne/obje olusturamayiz. new AbsClass() derleme hatasi verir!!

//egerki abstract methodlar tan�mlamak istiyorsak onlar�n bulundugu class da abstract olmal�d�r.
//eger ki bir class abstract bir class � extend ederse i�indeki abstract metodlar� override etmemizi isteyecektir

public abstract class AbstractClass {
	
	/*
	 * Illegal modifier for the field denemeAbstract; 
	 * only public, protected, private, static, final, 
	 * transient & volatile are permitted
	
	abstract int denemeAbstract=0;
	
	*/
	
	private int id;
	private String comment;
	private static final double PI = 3.14;
	
	// method tan�m�m�za absract degerini girdi�imizde methoda body {} k�sm�n� eklemek zorunda degiliz
	public abstract void showClassName();
	
	//abstract metodlar�n body k�sm� olmaz
	/*
	public abstract int calculateArea() {
		
		return 0;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static double getPi() {
		return PI;
	}
	
	
}




