package muhammetaslan.javase.modifier;

// abstract class ý extend ettiðimizde yalnýzca içinde abstract olarak tanýmlanmýs methodlarý kullanmamýz ister
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

//eger ki bir class içerisinde abstract bir metod tanýmlamak istiyor iseniz o class da abstrac olmak
//zorundadýr. yoksa o class içirisinde abstrac bir metod tanýmlanamaz.
abstract class A2{
	
	final int MAX_SALARY = 45000;
	public abstract void getSalary();
	public abstract void getMoney();
	
}

final class A3{
	
	 private static String NAME = "MUHAMMET";
	 
}