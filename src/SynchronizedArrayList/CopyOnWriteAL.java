package SynchronizedArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a synchronized arraylist
		CopyOnWriteArrayList<String> syncList= new CopyOnWriteArrayList<String>();

    // Adding elements to synchronized ArrayList
		syncList.add("Harika ");
		syncList.add("made ");
		syncList.add("Synchronized arraylist");

    System.out.println("Elements of synchronized ArrayList :");

    // Iterating on the synchronized ArrayList using iterator.
    Iterator<String> itr = syncList.iterator();

    while (itr.hasNext())
        System.out.print(itr.next());
	}

}
