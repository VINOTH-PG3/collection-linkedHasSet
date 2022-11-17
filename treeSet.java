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
		
		System.out.println(tree);  // values display in random order
		
		Iterator<Integer> irrtd = tree.iterator();
		while(irrtd.hasNext()){
			System.out.println(irrtd.next());
		}
		
	}
	

}
