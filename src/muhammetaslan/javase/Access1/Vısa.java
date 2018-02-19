package muhammetaslan.javase.Access1;

import java.util.Date;

//V�sa sin�f� olarak Card s�n�f�na extend ediliyor fakat private de�i�ken ve methodlar hala invisible

public class V�sa {

	private void main() {
		
		Card card1 = new Card();
		
		card1.setCardNumber(121215);
		card1.setUsageDate(new Date(2020,02,15));
		// Card . custerName access level is default - packeage level bu y�zden ula�abildik  
		String a = card1.custerName;
		
		System.out.println("Security number access level is protected" + card1.securityNumber);
		System.out.println("Usage Data is and access level is public" + card1.usageDate);
	}
}
