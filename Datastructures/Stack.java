package Datastructures;

public class Stack {

	private class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}
	}
	
	private Node top; // we just need a top since its LIFO, always operations happen at one end
	
	public boolean isEmpty() {
		return top == null;
	}
	public int peek() {
		return top.data;
	}
	public void push (int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
		
	}
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}

}