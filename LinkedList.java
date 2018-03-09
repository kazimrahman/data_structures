
class Node{
	
	private int data;
	private Node next;
	
	public Node(){
		this.data = 0;
		this.next = null;
	}
	
	public Node(int x){
		this.data = x;
		this.next = null;
	}
	
	public int getData(){
		return this.data;
	}
	 public void setData(int x){
		 this.data = x;
	 }

	public Node getNext(){
		return this.next;
	}
	 public void setNext(Node n){
		 this.next = n;
	 }
	 
}

class LinkedList{
	private Node start;
	private Node end;
	private int size;
	
	public LinkedList(){
		start = null;
		end = null;
		size = 0;
		
	}
	
	public void insertAtEnd(){}
	
	
	
}