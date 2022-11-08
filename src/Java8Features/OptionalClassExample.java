package Java8Features;

import java.util.Optional;

public class OptionalClassExample {
	 public static void main(String[] args) {   
	        Integer[] age = new Integer[10];   
	        Optional<Integer> checkAgeNull = Optional.ofNullable(null);   
	        if (checkAgeNull.isPresent()) {   
	              
	            System.out.print(age);   
	         } else 
	           System.out.println("Age is not given");   
	    }  
}
