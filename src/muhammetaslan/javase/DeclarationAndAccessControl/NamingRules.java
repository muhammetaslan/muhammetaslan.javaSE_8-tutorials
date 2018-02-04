package muhammetaslan.javase.DeclarationAndAccessControl;

public class NamingRules {
	
	// getter methodlarında get.. seklinde setter methodlarında ise set.. olmalı
	// tipi boolean olan degerler ise get metodunda is.. olablir
	
	/*
	 * 
	 * listener isim standardı ise 
	 * 
	 * public void addMylistener(Mylistener m)
	 * public void removeMylistener(Mylistener m)
	 * 
	 * add veya remove olarak belirlenmeli
	 * 
	 * */
	
	private int ssn=0;
	private String name= null;
	private int age = 22;
	private boolean student=false;
	
	
	public NamingRules(int ssn, String name, int age, boolean student) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.student = student;
	}
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
}
