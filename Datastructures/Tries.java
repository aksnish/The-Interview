package Datastructures;

import java.util.Scanner;

public class Tries {
	public static class Node{
		private static int NUMBER_OF_CHARACTERS = 26;
		Node [] children = new Node[NUMBER_OF_CHARACTERS];
		int size = 0;

		private static int getCharIndex(char c){
			return c - 'a';
		}

		private Node getNode (char c){
			return children[getCharIndex(c)];
		}

		private void setNode(char c, Node node) {
			children[getCharIndex(c)] = node;
		}


		public void add(String str){
			add(str, 0);
		}

		private void add (String str, int index) {
			size++;
			if(str.length() == index) return;
			char current = str.charAt(index);
			int charCode = getCharIndex(current);
			Node child = getNode(current);
			if(child == null){
				setNode(current, new Node());
			}

		}

		public int findCount (String str, int index){
			if(index == str.length()){
				return size;
			}
			Node child = getNode(str.charAt(index));
			if(child == null){
				return 0;
			}
			return child.findCount(str, index+1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Node node = new Node();
		for(int a0 = 0; a0 < n; a0++){
			String op = in.next();
			String contact = in.next();
			if(op.equalsIgnoreCase("add")){
				node.add(contact);
			}
			else{
				System.out.println(node.findCount(contact, 0));
			}
		}
	}

}
