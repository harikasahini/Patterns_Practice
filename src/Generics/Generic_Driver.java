package Generics;

public class Generic_Driver {
	
	public static void main(String args[]) {

	//Creating an object of Generic class with Integer type as parameter
	Generic_Class<Integer> intYear= new Generic_Class<Integer>(2022);
	intYear.onPrintRequest();
	
	//Creating an object of Generic class with String type as parameter
	Generic_Class<String> stringYear= new Generic_Class<String>("Two Thousand Twenty Two");
	stringYear.onPrintRequest();
	}
 	
}


