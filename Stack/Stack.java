class Stack{
	int top;
	int[] s;
	
	public Stack(int size){
		s = new int[size];
		top = -1;
		
	}
	
	public void push(int element){
		top++;
		s[top] = element;
	}
	
	public int pop(){
		return s[top--];
		//return x;
	}
	
	public int peek(){
		return s[top];
	}
	
	public int getTop(){
		return top;
	}
	
	public static void main(String args[]){
		Stack st = new Stack(10);
		st.push(5);
		st.push(4);
		st.push(3);
		System.out.println(st.pop()+" "+st.getTop());
	
	}
}

