package Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkeList {
	public static void main(String args[]){  
//		LinkedList<String> al=new LinkedList<String>();  
//		al.add("aman");  
//		al.add("raman");  
//		al.add("chaman");  
//		al.add("Ajay");  
//		System.out.println(al);  
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
//		
//		System.out.println("For Add the list");//For add
//        al.add(1, "Gaurav");  
//        al.add(2,"Saurav");
//		System.out.println(al);  
//		System.out.println("For remove the list");//for remove
//		al.remove(0);
//		System.out.println(al);
//		
//		System.out.println("For reverse the list");//rever the list
//        Iterator<String> itr1=al.descendingIterator();  
//        while(itr1.hasNext()) {
//        	System.out.println(itr1.next());
//        }
		
		
        String[] array={"Java","Python","PHP","C++"};  //Convert array to String
        System.out.println("printing array"+ ""+ Arrays.toString(array));
        List<String> li= new LinkedList<String>();
        for(String a:array) {
        	li.add(a);
        }
        	System.out.println("printing list"+ li);
        
		
		}  
		}  