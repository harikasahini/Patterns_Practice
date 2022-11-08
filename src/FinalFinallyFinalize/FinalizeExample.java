package FinalFinallyFinalize;

public class FinalizeExample {
	
	public static void main(String[] args)
    {
		FinalizeExample fe=new FinalizeExample();
		
		fe.finalize();
		
		//Calling garbage collector
		System.gc();
        System.out.println("Garbage collected");
		
    }
	
	public void finalize()
    {
        System.out.println("overrided finalize method");
    }

}
