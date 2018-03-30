
class Node{
	int key;
	String data;
	Node next;
	
	public Node(int k, String s){
		this.key = k;
		this.data = s;
	}
	
	public int getKey(){
		return this.key;
	}

	public String getData(){
		return this.data;
	}
	
	public void setNext(Node n){
		this.next = n;
		return;
	}
}




class HashTable{
	private static final int SIZE = 128;
	
	Node[] table;
	
	public HashTable(){
		table = new Node[SIZE];
		for(int i = 0; i < SIZE-1;i++){
			table[i] = null;
		}
	}
	
	public void put(int key, String s){
		int hash = key % SIZE;
		Node n = new Node(key, s);
		if(table[hash] == null){
			table[hash] = n;
		}
		Node head = table[hash];
		while(head != null){
			head = head.next;
		}
		head = n;
		
	}
	
	public String get(int key){
		int hash = key % SIZE;
		
		if(table[hash].next == null){
			return table[hash].data;	
		}
		return table[hash].data;
	}
	
	public static void main(String args[]){
		HashTable ht = new HashTable();
		ht.put(5, "hi");
		ht.put(5, "poop");
		String x = ht.get(5);
		System.out.println(x);
	}
	
	

}
