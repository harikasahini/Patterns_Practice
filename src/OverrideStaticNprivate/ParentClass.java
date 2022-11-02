package OverrideStaticNprivate;

public class ParentClass {
	
	private void privateMeth() {
		System.out.println("Inside private method of Parent class");
	}
	
	public static void staticMeth() {
		System.out.println("Inside static method of Parent class");
	}

	public void printPrivate() {
		privateMeth();
	}
}
