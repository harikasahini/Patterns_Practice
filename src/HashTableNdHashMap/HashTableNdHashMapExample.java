package HashTableNdHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableNdHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> hashMaptest=new HashMap<String,String>();
		hashMaptest.put("Harish","Amit");
		hashMaptest.put("Gurgindar","Amit"); 
		hashMaptest.put("Hema","Vijay");
        
        System.out.println("-----------Hash map-----------");
        System.out.println("Team members are:");
        for (HashMap.Entry team:hashMaptest.entrySet()) {
            System.out.println(team.getKey()+" and "+team.getValue());
        }
        
        Hashtable<String,String> hashTabletest=new Hashtable<String,String>();
        hashTabletest.put("Harish","Amit");
        hashTabletest.put("Gurgindar","Amit"); 
        hashTabletest.put("Hema","Vijay");
        
        System.out.println("-----------Hash Table-----------");
        System.out.println("Team members are:");
        for (Entry<String, String> team:hashTabletest.entrySet()) {
            System.out.println(team.getKey()+" and "+team.getValue());
        }
	}

}
