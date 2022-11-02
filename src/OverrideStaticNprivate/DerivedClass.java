package OverrideStaticNprivate;

public class DerivedClass extends ParentClass{

	//Signature same as in parent class but it is not overrided method
	public static void staticMeth() {
		System.out.println("Inside static method of Derived class");
	}
	
	public static void main(String[] args) {
		
		DerivedClass dc=new DerivedClass();
		
		ParentClass pc= new ParentClass();
		//This calls static method in Derived class
		dc.staticMeth();
		//This calls static method in parent class
		pc.staticMeth();
		//This calls public method in parent class, inside it which access private method of parent class[
		pc.printPrivate();
	}
}
