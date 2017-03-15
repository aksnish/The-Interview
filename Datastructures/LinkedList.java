package Datastructures;

class Node{
	Node next;
	int data;
	public Node(int data){
		this.data = data;
	}

}


public class LinkedList {
	Node head;

	public void append(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void deletWithVaue(int data){
		if(head == null) return;
		if(head.data == data){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	public void printList(){
		Node current = head;
		while(current != null){
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(13);
		list.append(15);
		list.append(16);
		list.append(21);

		
		
		list.prepend(45);
		list.deletWithVaue(15);
		list.deletWithVaue(13);
		
		list.printList();

	}

}
