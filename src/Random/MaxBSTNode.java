package Random;

public class MaxBSTNode {

	public int getMaxNode(Node root){
		if(root != null){
			return max(root.data, getMaxNode(root.left), getMaxNode(root.right));
		}
		return 0;
	}

	public int max(int a, int b, int c){
		return Math.max(a, Math.max(b, c));
	}

	public static void main(String[] args) {
		Node root = new Node(10);		
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(25);
		root.right.left=new Node(35);
		root.right.right= new Node(12);

		MaxBSTNode m = new MaxBSTNode();
		System.out.println("Max element in Binary Tree: " + m.getMaxNode(root));			
	}
}

