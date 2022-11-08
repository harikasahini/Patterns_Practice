package FailsafeFailFast;


import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
	  
public class FailSafeItrExample {
	 public static void main(String args[])
	    {
	      CopyOnWriteArrayList<Integer> listex= new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2, 3, 4 });
	        Iterator itr = listex.iterator();
	        while (itr.hasNext()) {
	            Integer value = (Integer)itr.next();
	            //since it works on new copy the operations performed wouldn't affect
	            if (value == 1)
	            	listex.remove(3);
	            System.out.println(value);
	        }
	    }
}