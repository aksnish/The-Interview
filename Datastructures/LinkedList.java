package Datastructures;

class Node{
	Node next;
	int data;
	public Node(int data){
		this.data = data;
	}

}

public class LinkedList {
	static Node head;

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

	public void insertAtPos(int data, int pos){
		if(head == null){
			return;
		}
		if(head.data == data){
			prepend(data);
			return;
		}
		Node prev = null;
		Node current = head;
		while( current != null && current.data != data){
			prev = current;
			current = current.next;
		}
		if(current != null){
			Node newN = new Node(pos);
			prev.next = newN;
			newN.next = current;
		}
	}

	public void insertAtPosA(int data, int pos){
		if(head == null){
			return;
		}

		if(pos == 0){
			prepend(data);
			return;
		}

		Node prev = null;
		Node current = head;
		int i=0;
		while( current != null && i !=pos){
			prev = current;
			current = current.next;
			i++;
		}
		if(current != null){
			Node newN = new Node(data);
			prev.next = newN;
			newN.next = current;
		}
		else if(current == null){
			append(data);
		}
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

	public Node searchData(int data){
		Node cur = head;
		while(cur != null && cur.data != data){
			cur = cur.next;
		}
		return cur;
	}

	public void RemoveDuplicates(Node head) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		if(head == null){
			return;
		}
		Node cur = head;

		while(cur.next != null ){
			if( cur.data == cur.next.data){
				cur.next = cur.next.next;
			}
			else{
				cur = cur.next;
			}
		}
	}


	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(13);
		list.append(15);
		list.append(15);
		list.append(16);
		list.append(16);
		list.append(21);
		list.append(21);
		list.append(21);
		

		list.prepend(45);
//		list.deletWithVaue(15);
		list.deletWithVaue(13);

		//		list.printList();

		//list.insertAtPosA(6, 0);

		list.printList();
		list.RemoveDuplicates(head);
		System.out.println();
		list.printList();
		System.out.println("\n"+list.size());
		System.out.println("\n"+list.searchData(45));

	}

	private int size() {

		int size = 0;
		Node current = head;
		while(current.next != null){
			current = current.next;
			size++;
		}

		return size;
	}

}
