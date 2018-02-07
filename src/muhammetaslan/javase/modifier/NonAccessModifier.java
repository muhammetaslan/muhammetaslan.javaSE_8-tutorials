package muhammetaslan.javase.modifier;

// abstract class ý extend ettiðimizde yalnýzca içinde abstract olarak tanýmlanmýs methodlarý kullanmamýz ister
public class NonAccessModifier extends AbstractClass{

	public static void main(String[] args) {
		
		A3 a3_obj = new A3();
		
		a3_obj.showA4();
		a3_obj.showFinalClass();
		
		System.out.println("worked");
	}

	@Override
	public void showClassName() {
		System.out.println("I am from abstract class");		
	}

}

// A1 class ý abstract olan A2 class ýný extend etti ve yalnýzca abstract class lar override edildi.
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
	private int age;
	protected String villageName;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public int getMAX_SALARY() {
		return MAX_SALARY;
	}
	
	public abstract void getSalary();
	public abstract void getMoney();
	
}

/*
 * B4 final class olan A3 un subclass ý olmaz final classlara extend edilemez
class B4 extends A3{
	
}
*/

class A4{
	
	int ssn;
	private int age;
	
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showA4() {
		System.out.println("A4");
	}
}


// ama final classlar baska classlara extend edip kalýtabilirler.
final class A3 extends A4{
	
	
	private static String NAME = "MUHAMMET";
	protected String name;
	public String surname;
	
	
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public static String getNAME() {
		return NAME;
	}

	public static void setNAME(String nAME) {
		NAME = nAME;
	}



	public void showFinalClass() {
		System.out.println("I am final class");
	}
}