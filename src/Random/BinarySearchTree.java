package Random;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import HacerRank.CheckBST;



class NodeB{
	NodeB left,right;
	int data;
	NodeB(int data){
		this.data=data;
		left=right=null;
	}
}
public class BinarySearchTree {
	public static boolean checkBST(NodeB root){
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	//takes O(n) and space complexity if its a balanced tree is O(log n)
	private static boolean checkBST(NodeB root, int min, int max) {
		//base case
		if(root == null){
			return true;
		}
		if(root.data < min || root.data > max){
			return false;
		}
		return (checkBST(root.left, min, root.data-1) && checkBST(root.left, root.data+1, max));
	}

	public static int getHeight(NodeB root){
		if(root == null){
			return -1;
		}
		else{
			return 1+ Math.max(getHeight(root.left),
					getHeight(root.right));
		}
	}

	public static NodeB insert(NodeB root,int data){
		if(root==null){
			return new NodeB(data);
		}
		else{
			NodeB cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	
    static void levelOrder(NodeB root){
    // using a queue to store the node        
    Queue<NodeB> queue = new LinkedList();
    // add the root into the queue
    if (root != null) {
        queue.add(root);
    }
    while (!queue.isEmpty()) {
        // get element at head of queue and print it out            
    	NodeB node = queue.poll(); 
        System.out.printf("%d ", node.data);
        // add the left to the queue
        if (node.left != null)
            queue.add(node.left);
        //add right to queue
        if (node.right != null)
            queue.add(node.right);
    }
}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		NodeB root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		int height=getHeight(root);
		System.out.println(height);
//		System.out.println(checkBST(root));
//		levelOrder(root);
	}	
}

