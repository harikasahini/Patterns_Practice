package CoVariantReturnType;



public class ClassChild extends ClassParent {

	//By implementing CoVariant return type we changed the return type of overrided method from parent to child in ClassChild
	@Override
	public ClassChild printMethod() {
		
		System.out.print("Inside child class");
		return this;
	}
	
	public static void main(String[] args) {
		
		ClassChild child=new ClassChild();
		
		child.printMethod();
	}
}
