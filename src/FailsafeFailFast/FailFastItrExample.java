package FailsafeFailFast;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
  
public class FailFastItrExample {
	
	public static void main(String[] args)
    {
        Map<Integer, Integer> ageDob = new HashMap<Integer, Integer>();
        ageDob.put(12, 1999);
        ageDob.put(13, 2000);

  
        Iterator itr = ageDob.keySet().iterator();
  
        while (itr.hasNext()) {
            System.out.println(ageDob.get(itr.next()));
            //if we add or remove an element it will throw exception
            ageDob.put(14, 2001);
        }
    }

}
