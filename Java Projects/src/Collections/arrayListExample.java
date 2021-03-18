package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayListExample {
	public static void main(String args[]){  
		  List<Integer> al=new ArrayList<Integer>();  
		  al.add(21);  
		  al.add(11);  
		  al.add(51);  
		  al.add(1);  
//		System.out.println(al);       //Printing the arraylist object 
		
		  System.out.println("Traversing list through List Iterator:");  //	  Traversing list through Iterator  

		  Iterator<Integer> itr=al.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		}  
		
//		  Reverse the list
		  System.out.println("For reverse list through List Iterator:");  
          //Here, element iterates in reverse order  
		  ListIterator<Integer> list=al.listIterator(al.size());  
             while(list.hasPrevious())  
             {  
                 Integer str=list.previous();  
                 System.out.println(str);  
             }
           //Sorting the list  
            System.out.println("Traversing Sorting the list  :");  
		   
		 Collections.sort(al);
		  //Traversing list through for-each loop  
		  for(Integer fruit:al)    
		    System.out.println(fruit); 
		  
		 
		  
		  System.out.println("Traversing list through List Iterator:");  
          //Here, element iterates in reverse order  
             ListIterator<Integer> list1=al.listIterator(al.size());  
             while(list1.hasPrevious())  
             {  
                 Integer str=list1.previous();  
                 System.out.println(str);  
             }  
       System.out.println("Traversing list through for loop:");  
          for(int i=0;i<al.size();i++)  
          {  
           System.out.println(al.get(i));     
          }  
             
       System.out.println("Traversing list through forEach() method:");  
       //The forEach() method is a new feature, introduced in Java 8.  
           al.forEach(a->{ //Here, we are using lambda expression  
               System.out.println(a);  
             });  
               
           System.out.println("Traversing list through forEachRemaining() method:");  
             Iterator<Integer> itr1=al.iterator();  
             itr1.forEachRemaining(a-> //Here, we are using lambda expression  
             {  
           System.out.println(a);  
             });  
	}
	}  