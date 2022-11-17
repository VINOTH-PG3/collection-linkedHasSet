package List;

import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
// java.lang.reflect.Array;

public class setExample {
public static void main(String[] args) {
	Set <String> students = new HashSet<String>();
	students.add("pandiyarajan");
	students.add("sunder");
	students.add("vinoth b.s");
	students.add("vinoth");
	students.add("veera");
	students.add("kathick");
	
	        
	
	
	// the values is not displayed in given order  set the given value will print in ascending order
	   System.out.println("students name added using ADD METHOD   :"+students);
	
	   System.out.println();
	//CONTAINS METHOD is used to mention true/false if this set contains the specified element.
       System.out.println("CONTAINS METHOD is used to return true if this set contains the specified element."); 
       System.out.println(students);
      
       
       System.out.print("set students contains the name veera  :");System.out.println(students.contains("veera"));
       System.out.print("set students contains the name pandi  :");System.out.println(students.contains("pandi"));
       System.out.println();
       System.out.println();
       System.out.println();
    // isEmpty METHOD It is used to  mention true/false if this set contains no elements.
       System.out.println("set contains any empty Space  : "+students.isEmpty());
       System.out.println();
       System.out.println();
       System.out.println();
   
   //REMOVE METHOD  It is used to remove the specified element from the set.
       System.out.println("REMOVE METHOD//  Students SET  :"+students);

       students.remove("vinoth");
       System.out.println("Remove name Vinoth from set  :"+students);
       System.out.println();
       System.out.println();
       System.out.println();
       
       //SIZE METHOD  It is used to display number of element in the set.
       System.out.println("SIZE METHOD            Students SET :"+students);
       System.out.println("The Size Of Student Set is  :"+students.size());
       System.out.println();
       System.out.println();
       System.out.println();
       
//       String arrays[]=new String[10];
//       students.toArray(arrays);
//       
//       System.out.println("toArray method  :"+students.toArray());
   //Iterate method
       System.out.println("USING FOR EACH METHOD  ");
   for (String sData : students) {
	System.out.println(sData);
}
   System.out.println();
   System.out.println();
   System.out.println();
       
   Iterator<String> stIterator = students.iterator();
   System.out.println("USING ITERATOR METHOD");
   System.out.println();
   while(stIterator.hasNext()){
	   System.out.println(stIterator.next());  
   }
   System.out.println();
   System.out.println();
   System.out.println();
   
		   //CLEAR METHOD is used to clear /delete all data in given set  
	students.clear();
	System.out.println("clear method delete all data so its display empty values   :"+students);
	
}
}
