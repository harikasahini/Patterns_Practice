package OverridedMethodsAccessModifiers;

public class SubClass extends ParentClass {

	//Overriding the public method in sub class 
	@Override
	public void methodPublic() {
		System.out.println("You are inside of public method in Sub class");
	}
	
	//Overriding the protected method with public specifier
	@Override
	public void methodProtected() {
		System.out.println("Protected method overrided with public modifier");
	}
	
	//Overriding the default method in protected with specifier
	@Override
	protected void methodDefault() {
		System.out.println("Default method overrided with protected mofifier");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass subObj=new SubClass();
		subObj.methodPublic();
		subObj.methodProtected();
		subObj.methodDefault();
	}

}
