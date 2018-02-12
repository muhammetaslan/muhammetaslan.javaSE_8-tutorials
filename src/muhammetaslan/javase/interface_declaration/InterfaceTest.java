package muhammetaslan.javase.interface_declaration;

public class InterfaceTest {

	public static void main(String[] args) {
		
		A a_obj = new A();
		B b_obj = new B();
		
		a_obj.run();
	}

}


// Javada runnable diye bir arabirim vard�r 
class A implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Class A is run");
		
	}
	
}

class B implements Runnable{

	@Override
	public void run() {
		System.out.println("Class B is run");
		
	}
	
}
