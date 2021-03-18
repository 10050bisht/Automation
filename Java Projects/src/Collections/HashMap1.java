package Collections;

import java.util.HashMap;
import java.util.Map;

public interface HashMap1 {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");   
	   map.put(1,"Grapes"); //trying duplicate key  
	   map.put(3,"Banana");   
	   map.put(4,"Grapes");   
	       
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
//	   Java HashMap example to add() elements
	   map.putIfAbsent(5,"Lichi");
	   System.out.println("After invoking putIfAbsent() method");
	   for(Map.Entry m: map.entrySet()) {
		   System.out.println(m.getKey()+" "+m.getValue());
		  
	   } 
//	   example to remove() elements
	   map.remove(3);
	   System.out.println(map);
	   
	   
}
}
