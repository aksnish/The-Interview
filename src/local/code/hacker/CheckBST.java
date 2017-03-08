package local.code.hacker;


class NodeT{
	int data;
	NodeT right;
	NodeT left;
}

public class CheckBST {

	public boolean checkBST(NodeT root){
		while(root != null){
			if(root.data > root.left.data && root.left.left != null){
				root = root.left;
				checkBST(root);
			}
			else if(root.data < root.right.data && root.right.right != null){
				root = root.right;
				checkBST(root);
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		NodeT node = new NodeT();
		CheckBST chk = new CheckBST();
		node.right = new NodeT();
		node.left = new NodeT();
		node.data = 0;
		node.right.data = 5;
		node.left.data = 3;
//		node.right.right.data = 6;
//		node.right.left.data = 4;
//		node.right.right.data = 6;

		System.out.println(chk.checkBST(node));
	}
}
