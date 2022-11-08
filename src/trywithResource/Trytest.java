package trywithResource;

import java.util.Scanner;

public class Trytest {
	
	public static void main(String args[]){
		String ip = "";
		//Throws exception if input not "Harika"
		 while (!ip.equals("Harika")) {
			 //Scanner is used and released inside try block only
	            try(Scanner scanner = new Scanner(System.in)){
	                System.out.print("Input: ");
	                ip = scanner.nextLine();
	                System.out.println("Input was: " + ip);
	                scanner.close();
	            }
	            catch(Exception e) {
	            	System.out.println(e);
	            }
	        }  
	}

}
