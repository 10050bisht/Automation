package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public interface MapInterface {

	
	 public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(102,"Rahul");  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
//		  Java Map Example: Generic (New Style)
		  //Elements can traverse in any order  
		  System.out.println("Simple map printing");
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
//		  Java Map Example: comparingByKey()
	      System.out.println("Simple example of comparingByKey:");
		  //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
//	      Java Map Example: comparingByKey() in Descending Order
		  System.out.println("Descending  order comparingByKey:");
	      //Returns a Set view of the mappings contained in this map    
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
//	      Java Map Example: comparingByValue()
	      System.out.println("Simple example of comparingByValue:");
	      //Returns a Set view of the mappings contained in this map    
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByValue())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	      
//	      Java Map Example: comparingByValue() in Descending Order
		  System.out.println("Descending  order comparingByValue:");
		  //Returns a Set view of the mappings contained in this map    
		     map.entrySet()  
		     //Returns a sequential Stream with this collection as its source  
		     .stream()  
		     //Sorted according to the provided Comparator  
		     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
		     //Performs an action for each element of this stream  
		     .forEach(System.out::println);  
		     
//			   example to remove() elements
		     map.remove(100);
			   System.out.println(map);
			   
		 }  
		}  