package List;
import java.util.*;  


public class linkedHashSet {
	
	  
	 public static void main(String args[]){  
	                     //Creating HashSet and adding elements  
	        LinkedHashSet<String> sDistrict=new LinkedHashSet();  
	               sDistrict.add("maduai");    
	               sDistrict.add("trichy");    
	               sDistrict.add("theni");   
	               sDistrict.add("sivakasi");  
	               sDistrict.add("Tirunelveli");  
	               
	             // adding element to set 
	               System.out.println("ADD METHOD adding elements in the set");
	               System.out.println(sDistrict);
	               System.out.println();
	               System.out.println();
	               

	            
	          // remove method
	           //theni is removed from Sdistrict
	            System.out.println("REMOVE METHOD               :"+sDistrict);
	            sDistrict.remove("theni");
	            System.out.println("theni removed from the set  :"+sDistrict);
	            System.out.println();
	            System.out.println();
	            
	    
	             
	            
	            Iterator<String> distrit=sDistrict.iterator();  
	               while(distrit.hasNext())  
	               {  
	               System.out.println(distrit.next());  
	               }  
	               
	               
	 }  
	}  

