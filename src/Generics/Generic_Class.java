package Generics;


//Implementing generic class
public class Generic_Class<T> {

	T year;
	
	Generic_Class(T year) {
		this.year=year;
	}
	
	//Using method with generic return type
	public T getPassedObject() { return this.year; }
	
	//method to prove that Generic classes will allow objects with different Generic data types
	public void onPrintRequest() {
		System.out.println("Value passed to the generic class is "+getPassedObject());
		System.out.println("Value passed is of type:"+this.year.getClass());
		System.out.println("******************************************************************************");
		
	}
	
}
