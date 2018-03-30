
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
	
	public void reverse(){
		
		if(head == null || head.next == null){
			return;
		}
		Node bong = head;
		Node t = null;
		Node track = null;
		while(head!=null){
			track = head.next;
			head.next = t;
			t = head;
			head = track;
		}
		head = t;
		return;
	}
	
	public void deleteEnd(){
		if(head == null){return;}
		
		Node track = head;
		while(track.next != tail){
			track = track.next;
			
		}	
		tail = track;
		size--;
		return;
	}
	
	public void deleteFront(){
		if(head == null){return;}
		
		head = head.next;
		size--;
		return;
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
	
	public void addFront(int x){
		Node n = new Node(x);
		
		if(head == null){
			head = n;
			tail = head;
			size++;
			return;
		}else{
			n.next = head;
			head = n;
			size++;		
		}
		
	}
	
	public void printList(){
		if (head == null){
			System.out.println("List is empty");
			return;
		}
		Node tmp = head;
		System.out.print("[ " + tmp.data);
		tmp = tmp.next;
		
		if(tmp==null){return;}
		
		for(int i = 1; i < size; i++){
			System.out.print(" --> "+tmp.data);
			tmp = tmp.next;
			
		}
		
		System.out.println(" ]");
		
		
		return;
		
	}
	
}