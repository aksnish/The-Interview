package Datastructures;

import javax.print.attribute.standard.Sides;

public class Queue {

	private class NodeQ{
		int data;
		NodeQ next;
		public NodeQ(int data){
			this.data = data;
		}

	}

	private Node head; //Remove data from here, since this the data that came in 1st
	private Node tail; //Add data from here, which is end of the queue
	private int size = 0;
	//if head is empty then the queue is empty if not false
	public boolean isEmpty(){
		return head == null;
	}
	
	public int peek() {
		return head.data;
	}
	public void add(int data) {
		
		Node node = new Node(data);
		if(tail != null){
			tail = tail.next;
		}
		tail = node;
		size++;
		if(head == null){
			head = node;
		}
	}
	public int remove() {
		int data = head.data;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return data;
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(5);
		queue.add(15);
		
		
		System.out.println(queue.head.data);
		System.out.println(queue.tail.data);
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size);
		System.out.println(queue.remove());
		
	}


}
