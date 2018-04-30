import java.util.*;
import java.io.*;

class LinkedListDriver{
	
	public static void main(String args[]) throws IOException{
		
		LinkedList l = new LinkedList();
		//l.printList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your linked list on a space separated line");
		l.addEnd(1);
		l.addEnd(2);
		l.addEnd(3);
		l.addEnd(4);
		l.addEnd(5);
		l.addFront(7);
		l.printList();
		l.reverse();
		l.printList();
		System.out.println();
		System.out.println(l.lengthR(l.head));
		l.printList();
		l.deleteSpecific(5);
		l.printList();
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(br.readLine());
		while(in.hasNextInt()){
			l.addEnd(in.nextInt());
		}
		
		//System.out.println(l.hashCode());
		
		//System.out.println(l.getSize());
		l.printList();
		//l.deleteEnd();
		//l.reverse();
		//l.deleteFront();
		//l.printList();
		//System.out.println(l.getSize());
		
		boolean quit = false;
		while(!quit){
			System.out.println("\nEnter a command, press h for help: ");
			String c = sc.next();
			switch (c){
				case "q": quit = true; 
							break;
				case "h": help();
							break;
				case "p": l.printList();
							break;
				case "d": System.out.println("Front or back? f or b");
							if(sc.next().equals("f")){
								l.deleteFront();
							}else{
								l.deleteEnd();
							}
							l.printList();
							break;
				case "s": System.out.println("Number of elements is "+ l.getSize());
							break;
				}
		}*/
		
	}
	
	static void help(){
		System.out.println("h: help menu");
		System.out.println("q: quit program");
		System.out.println("p: print current linked list");
		System.out.println("d: Delete a node");
		System.out.println("s: Size of linked list");
	}
	
	
}