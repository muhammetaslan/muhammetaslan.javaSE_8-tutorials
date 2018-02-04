// package dosyadaki ilk ifade deger olmak zorundad�r
package muhammetaslan.javase.DeclarationAndAccessControl;

// import ifadeleri islermelri package ile class aras�nda olmal�d�r
import java.awt.List;

// .java dosyas�nda public olan class simi ile dosya isme ayn� olmal�d�r.
public class Declaration {

	int temp = 0;
	int $aslan = 22;
	String name = "muhammet";
	double _pi = 3.14;
	
	

	/*
	rakam ve $,_ d�sndakaki karakter ile identifier ler basalmaz
	int 2number ;
	String /name;
	 */


	public static void main(String[] args) {

		// javada metodlara , degi�kenlere , class'lara , interface'lere verilen isimlere 
		// identifier denir.
		// degisken isimleri $,_,ve karakterler ile ba�lar sadece
		// degi�ken isimlerinde herhangi bir karakter say�s� limiti yoktur

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
 *	Bir .java belgesinde yaln�zca bir public class buluna bilir 
 *
public class Meyve{
	
}
*/