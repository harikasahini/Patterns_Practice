package FinalFinallyFinalize;

public class FinallyBlockExample {
	
	public static void main(String args[])
    {
        try {
            int i=10/0;
            System.out.println(i);
        }
        finally {
        	System.out.println("finally block, always executes");
        }
    }

}
