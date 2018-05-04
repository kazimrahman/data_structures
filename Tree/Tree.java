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
	
	/*
	1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.
*/

	public static void inOrderIter(Node n){
		Stack s = new Stack<Node>();
		Node temp = n;
		
		while(temp != null){
			s.push(temp);
			temp = temp.left;
		}
		while(!s.isEmpty()){
				temp = (Node)s.pop();
				System.out.println(temp.value);
			if(temp.right != null){
				temp = temp.right;
				while(temp != null){
					s.push(temp);
					temp = temp.left;
				}
			}
		}
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
		
		while(true){
			int count = q.size();
			if(count == 0) break;
		while (count>0){
			Node temp = q.poll(); 
			System.out.print(temp.value + " ");
			if (temp.left != null) 
				q.offer(temp.left);

			if (temp.right != null) 
				q.offer(temp.right);
			
			count--;
		}
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
		
		inOrderIter(t.root);
		
		//System.out.println(check(t.root));
		
		//System.out.println(height(t.root));
		
		Node[] meep = {t.root,t.root.left};
	}
}

