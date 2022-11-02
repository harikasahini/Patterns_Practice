package StringBufferNdStringBuilder;

public class MutableStrings {
	
	public static void main(String[] args) {
		
		StringBuffer sbuffer = new StringBuffer("Harika");
	    System.out.println(sbuffer);
	    
    	//using the StringBuffer methods to manipulate the object value
	    sbuffer.append("Sahini");
	    System.out.println(sbuffer);
	    
	    StringBuilder sbuilder = new StringBuilder("Prasad");
	    System.out.println(sbuilder);

	   //using the StringBuilder methods to manipulate the object value
	    sbuilder.append("Sahini");
	    System.out.println(sbuilder);
	}

}
