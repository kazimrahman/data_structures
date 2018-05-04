import java.util.*;
class Node{
	int value;
	Node left;
	Node right;
	
	public Node(int val){
		this.value = val;
	}
}



class Tree{
	Node root;
	
	public Tree(){
		root = null;
	}
	
	public static void inOrder(Node n){
		if(n == null){
			return;
		}
		
		inOrder(n.left);
		System.out.println(n.value);
		inOrder(n.right);

		return;
		
	}
	public static int height(Node n){
		if(n == null){return -1;}
			
		int left = height(n.left);
		int right = height(n.right);
		
		if(left > right){
			return left + 1;
		}else{
			return right + 1;
		}
	}
	
	public static boolean check(Node n){
		Node prev = null;
		return check(n, prev);
	}
	
	public static boolean check(Node n, Node prev){
		
		if(n != null){
			if(check(n.left,prev) != true){
				return false;
			}
			if(prev != null && n.value <= prev.value){
				return false;
			}
			prev = n;
			return check(n.right, prev);
		}
		
		
		return true;
	}
	
	
	public static void levelOrder(Node n){
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		while (!q.isEmpty()){
			Node temp = q.poll(); 
			System.out.print(temp.value + " ");
			if (temp.left != null) 
				q.offer(temp.left);

			if (temp.right != null) 
				q.offer(temp.right);
			
			System.out.println();
		}
		return;
		
	}
	
	public static void main(String[] args){
		Tree t = new Tree();
		t.root = new Node(5);
		t.root.left = new Node(8);
		t.root.left.right = new Node(4);
		t.root.left.left = new Node(2);
		t.root.right = new Node(7);
		t.root.right.right = new Node(11);
		t.root.right.left = new Node(6);
		inOrder(t.root);
		System.out.println();
		levelOrder(t.root);
		System.out.println();
		
		System.out.println(check(t.root));
		
		System.out.println(height(t.root));
		
		Node[] meep = {t.root,t.root.left};
	}
}

