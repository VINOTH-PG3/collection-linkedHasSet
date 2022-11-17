package List;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(80);
		tree.add(20);
		tree.add(50);
		tree.add(60);
		tree.add(30);
		tree.add(70);
		tree.add(40);
		//ADD is used to add elements to the set 
		System.out.println("the elements added are  :");
		System.out.println(tree);  // values display in random order
		System.out.println();
		
		// POLL FIRST AND POLL LAST- poll first gives the lowest value and poll last give the largest value
		System.out.println(tree);
		System.out.println("poll first method is used to find lowest value of element in set and remove it   "+tree.pollFirst());
	    System.out.println("poll last method is used to find highest value of element in set and remove it  "+tree.pollLast());
		
		
	    //hashcode- the sum of the set
	    System.out.println();
	    System.out.println("hashcode method print the given sum of the set  :"+tree.hashCode());
	    System.out.println();
	    System.out.println();
	    
	    //for each
	    for (Integer intTree : tree) {
			System.out.println(intTree);
		}
	   
	    
	    System.out.println();
		Iterator<Integer> irrtd = tree.iterator();
		while(irrtd.hasNext()){
			System.out.println(irrtd.next());
		}
		
	}
	

}












