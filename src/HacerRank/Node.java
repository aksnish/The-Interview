package HacerRank;

//Please check this: come back to this later;

public class Node {
	Node left, right;
	int data;
	public Node(int data){
		this.data = data;
	}

	public void insert(int value){
		if(value <= data){
			if(left == null){
				left = new Node(value);
			}
			else{
				left.insert(value);
			}
		}
		else{
			if(right == null){
				right = new Node(value);
			}
			else{
				right.insert(value);
			}
		}
	}

	public boolean contains(int value){
		if(value == data){
			return true;
		}
		else if (value < data){
			if(left == null){
				return false;
			}
			else{
				return left.contains(value);
			}
		}
		else{
			if(right == null){
				return false;
			}
			else{
				return right.contains(value);
			}
		}
	}

	public void printInorder(){
		if(left != null){
			left.printInorder();
		}
		System.out.print(data+" ");
		if(right != null){
			right.printInorder();
		}
	}

	public void printPreorder(){
		System.out.print(data+" ");
		if(left != null){
			left.printPreorder();
		}
		if(right != null){
			right.printPreorder();
		}
	}

	public void printPostorder(){
		if(left != null){
			left.printPostorder();
		}
		if(right != null){
			right.printPostorder();
		}
		System.out.print(data+" ");
	}


	int minValue(Node root)
	{
		int minv = root.data;
		while (root.left != null)
		{
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}


	public static void main(String[] args) {
		Node node = new Node(0);
		node.insert(5);
		node.insert(1);
		node.insert(4);
		node.insert(3);
		node.insert(2);

		node.printInorder();
		System.out.println();
		node.printPreorder();
		System.out.println();
		node.printPostorder();

		System.out.println("\n"+node.contains(9));
	}
}
