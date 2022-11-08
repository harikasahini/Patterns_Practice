package Java8Features;

import java.util.LinkedList;
import java.util.List;

public class forEachExample {

	public static void main(String[] args) {
		
	List<String> roomList = new LinkedList<String>();
	roomList.add("Kitchen");  
	roomList.add("Living room");  
	roomList.add("Bedroom");  
	roomList.add("Gym");
	roomList.forEach(room -> System.out.println(room));
	}
}
