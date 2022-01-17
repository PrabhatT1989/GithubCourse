package CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		
		LinkedList<String> ll = new LinkedList<String>();
		
		
		ll.add("A");
		
		ll.add("B");
		
		ll.add("C");
		
		ll.add("D");

		ll.add("D");

		ll.add("D");
		
		
		ll.add(null);

		ll.add(0, null);
		
		
		System.out.println("Objects  in linkedlist " + ll);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(11);
		ll1.add(12);
		ll1.add(12);
		
		ll1.add(12);
		
		LinkedList ll2 = new LinkedList(ll);
		
   ll2.addAll(ll1);
   
   System.out.println(ll2);
		
		
		
		
		
		
		
		System.out.println(ll1);
		
		
		
	}

}
