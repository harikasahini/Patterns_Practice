package OverridedMethodsAccessModifiers;

public class ParentClass {

	public void methodPublic() {
		System.out.println("You are inside of public method in parent class");
	}
	
	protected void methodProtected() {
		System.out.println("You are inside of public method in parent class");
	}
	
	void methodDefault() {
		System.out.println("You are inside of public method in parent class");
	}
	
	private void methodPrivate() {
		System.out.println("You are inside of public method in parent class");
	}
}
