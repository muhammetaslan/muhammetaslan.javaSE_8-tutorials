package muhammetaslan.javase.modifier;

// abstract class � extend etti�imizde yaln�zca i�inde abstract olarak tan�mlanm�s methodlar� kullanmam�z ister
public class NonAccessModifier extends AbstractClass{

	public static void main(String[] args) {
		
		System.out.println("worked");
	}

	@Override
	public void showClassName() {
		System.out.println("I am from abstract class");		
	}

}

class A1 extends A2{

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		
	}
	
}

//eger ki bir class i�erisinde abstract bir metod tan�mlamak istiyor iseniz o class da abstrac olmak
//zorundad�r. yoksa o class i�irisinde abstrac bir metod tan�mlanamaz.
abstract class A2{
	
	final int MAX_SALARY = 45000;
	public abstract void getSalary();
	public abstract void getMoney();
	
}

final class A3{
	
	 private static String NAME = "MUHAMMET";
	 
}