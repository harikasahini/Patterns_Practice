package SynchronizedArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncAlCollectionsExample {

	
	public static void main (String[] args)
    {
        List<String> array =Collections.synchronizedList(new ArrayList<String>());
 
        array.add("Array list ");
        array.add("synchronized ");
        array.add("Using ");
        array.add("Collections.synchronizedList");
 
        synchronized(array)
        {
            // must be in synchronized block
            Iterator<String> itr = array.iterator();
 
            while (itr.hasNext())
                System.out.print(itr.next());
        }
    }
}
