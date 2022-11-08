package StringNdStringBuffer;

public class StringMutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here we can observe the time taken by String and String Buffer to perform concat operation
		 long currentTime = System.currentTimeMillis();  
	        stringConcat();  
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-currentTime)+"ms");  
	        currentTime = System.currentTimeMillis();  
	        stringBufferConcat();  
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-currentTime)+"ms"); 
	        
	        System.out.println("String concat is taking more time than StringBuffer Concat. So StringBuffer is better in performance");
       
	}
	
	public static void stringConcat() {
		String s = new String("Northwest");
        s += "Missouri";
        s += "State University";
        System.out.println(s);
	}
	
	public static void stringBufferConcat() {
		StringBuffer sb = new StringBuffer("Northwest");
        sb.append("Missouri");
        sb.append("State University");
        System.out.println(sb);
	}

}
