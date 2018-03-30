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
		inOrder(n.right);
				System.out.println(n.value);

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
		return check(n);
	}
	
	/*public static boolean check(Node n, Node prev){
		
		if(n != null){
		
		
			if(n.left.data > n.data){
				return false;
			}
			if(n.right.data < n.data){
				return false;
			}
			
		
		}
		
		return true;
	}*/
	
	public static void levelOrder(Node n){
		Queue<Node> q = new LinkedList<Node>();
		q.add(n);
		/*while(q.isEmpty()==false){
			Node temp = q.poll();
			System.out.println(temp.value);
			if(temp.left != null) {q.offer(temp.left);}
			
			if(temp.right != null){ q.offer(temp.right);}
			
			temp = q.poll();
			*/
			while (!q.isEmpty()){
			Node temp = q.poll(); 
			System.out.print(temp.value + " ");
			if (temp.left != null) q.offer(temp.left);
			
			if (temp.right != null) q.offer(temp.right);
		//}
		}
		return;
		
	}
	
	public static void main(String[] args){
		Tree t = new Tree();
		t.root = new Node(5);
		t.root.left = new Node(3);
		t.root.left.right = new Node(4);
		t.root.left.left = new Node(2);
		t.root.right = new Node(7);
		t.root.right.right = new Node(11);
		t.root.right.left = new Node(6);
		inOrder(t.root);
		System.out.println();
		levelOrder(t.root);
		System.out.println();
		
		System.out.println(height(t.root));
		
		Node[] meep = {t.root,t.root.left};
	}
}

