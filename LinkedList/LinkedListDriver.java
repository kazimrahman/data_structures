import java.util.*;

class LinkedListDriver{
	
	public static void main(String args[]){
		
		LinkedList l = new LinkedList();
		//l.printList();
		l.addEnd(4);
		l.addEnd(3);
		l.addEnd(2);
		l.addEnd(1);
		
		
		
		System.out.println(l.getSize());
		l.printList();
		
	}
	
	
}