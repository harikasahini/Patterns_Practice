package FinalFinallyFinalize;

public class finalKyWdExample extends MethodFinalExample {
	public static void main(String[] args)
    {
		
		final int year=2022;
		int day=7;
		try {
		System.out.println("Next day is "+day++);
		//Gives compilation error
		System.out.println("Next year is "+year++);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Throws error as it is a final method
		callFinalMe();
    }

}


class MethodFinalExample {
	final void callFinalMe() {
		return;
	}
}

final class ClassFinal{
	ClassFinal(){
		return;
	}
}

//Gives compilation error
class SubClass extends ClassFinal{
	
}
