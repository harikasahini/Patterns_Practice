package TryWithoutCatch;

public class TryCatchTest {
	
	public static void main(String[] args) {
		try {
			int i=10;
			System.out.println("Inside try block"+i/10);
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
