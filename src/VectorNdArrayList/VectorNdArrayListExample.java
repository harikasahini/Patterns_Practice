package VectorNdArrayList;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorNdArrayListExample {
	
	public static void main(String args[]) {
	ArrayList<Integer> age = new ArrayList<Integer>();
	 age.add(1);
	 age.add(2);
	 age.add(3);
    System.out.println("ArrayList elements are:");
    //Using iterator on Arraylist
	  Iterator itr = (Iterator) age.iterator();
      while (itr.hasNext())
          System.out.println(itr.next());

      // creating Vector
      Vector<String> vec = new Vector<String>();
      vec.addElement("An Apple");
      vec.addElement("a day");
      vec.addElement("keeps doctor");
      vec.addElement("away");

      System.out.println("\nVector elements are:");
      //Traversing vector using Enumeration
      Enumeration evec = vec.elements();
      while (evec.hasMoreElements())
          System.out.print(evec.nextElement()+" ");
	}

}
