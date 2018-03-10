
class Node{
	
	protected int data;
	protected Node next;
	
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
	protected Node head;
	protected Node tail;
	protected int size;
	
	public LinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
		
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void addEnd(int x){
		Node n = new Node(x);
		if(head == null){
			head = n;
			tail = head;
			size++;
			return;
		}else{
			tail.next = n;
			tail = n;
			size++;
			return;
		}
		
	}
	
	public void printList(){
		if (head == null){
			System.out.println("List is empty");
			return;
		}
		Node tmp = head;
		
		for(int i = 0; i < size; i++){
			System.out.println(tmp.data);
			tmp = tmp.next;
			
		}
		return;
		
	}
	
}