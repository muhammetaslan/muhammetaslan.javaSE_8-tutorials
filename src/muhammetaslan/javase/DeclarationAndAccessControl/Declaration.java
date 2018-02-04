// package dosyadaki ilk ifade deger olmak zorundadýr
package muhammetaslan.javase.DeclarationAndAccessControl;

// import ifadeleri islermelri package ile class arasýnda olmalýdýr
import java.awt.List;

// .java dosyasýnda public olan class simi ile dosya isme ayný olmalýdýr.
public class Declaration {

	int temp = 0;
	int $aslan = 22;
	String name = "muhammet";
	double _pi = 3.14;
	
	

	/*
	rakam ve $,_ dýsndakaki karakter ile identifier ler basalmaz
	int 2number ;
	String /name;
	 */


	public static void main(String[] args) {

		// javada metodlara , degiþkenlere , class'lara , interface'lere verilen isimlere 
		// identifier denir.
		// degisken isimleri $,_,ve karakterler ile baþlar sadece
		// degiþken isimlerinde herhangi bir karakter sayýsý limiti yoktur

		Car car1 = new Car();
		
		List car = car1.getCars();
		
		for (int i = 0; i < car.getItemCount(); i++) {
			System.out.println(car.getItem(i));
		}//end of for
		

	}

}
class Car{

	private List carList = new List();

	public List getCars(){

		carList.add("Ferrari");
		carList.add("Toyata");

		return carList;
	}

	/*
	 * not legal 
	public void (removeVar{

	}
	 */
}

/*
 * not lagal
class 2Car{

}
 */

/*
 *	Bir .java belgesinde yalnýzca bir public class buluna bilir 
 *
public class Meyve{
	
}
*/