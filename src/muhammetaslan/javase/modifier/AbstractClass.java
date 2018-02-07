package muhammetaslan.javase.modifier;

//bir sinif eger abstract olarak tanimlanmissa bu durumda bu sinifin kalitilacagi anlamina gelmektedir.
//final ise kalitima engeldir!
//abstract anahtar kelimesi class ve metot taniminda kullanilabilir, degiskenler icin boyle bir sey yoktur.
//abstract classlardan nesne/obje olusturamayiz. new AbsClass() derleme hatasi verir!!

//egerki abstract methodlar tanýmlamak istiyorsak onlarýn bulundugu class da abstract olmalýdýr.
//eger ki bir class abstract bir class ý extend ederse içindeki abstract metodlarý override etmemizi isteyecektir

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
	
	// method tanýmýmýza absract degerini girdiðimizde methoda body {} kýsmýný eklemek zorunda degiliz
	public abstract void showClassName();
	
	//abstract metodlarýn body kýsmý olmaz
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




