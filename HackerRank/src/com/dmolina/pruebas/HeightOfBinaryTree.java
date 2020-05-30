package com.dmolina.pruebas;

public class HeightOfBinaryTree {
	

	
	public static int height(Node root) {
		int res = 0;
		Node nodo_actual = root;

		if(nodo_actual == null) {
			return 0;
		}else{
			if(nodo_actual.left != null) {
				return height(nodo_actual.left) + 1;
			}
				
			if(nodo_actual.right != null) {
				return height(nodo_actual.right) + 1;
			}
		}
		
      	return res;
    }
	
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	//The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree:

	public static void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.data);
	        traverseInOrder(node.right);
	    }
	}
	
	//Pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
	public static void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(" " + node.data);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	//Post-order traversal visits the left subtree, the right subtree, and the root node at the end:
	public static void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.data);
	    }
	}
	

	public static void main(String[] args) {
		Node root = null;
		int n = 7;
		int[] lis = new int[n];
		lis[0] = 6;
		lis[1] = 4;
		lis[2] = 8;
		lis[3] = 3;
		lis[4] = 5;
		lis[5] = 7;
		lis[6] = 9;
		
		for(int i = 0; i < lis.length;i++) {
			root = insert(root,lis[i]);
			n++;
		}
		
		System.out.println("traverseInOrder");
		traverseInOrder(root);
		
		System.out.println(" ");
		System.out.println("traversePreOrder");
		traversePreOrder(root);
		
		System.out.println(" ");
		System.out.println("traversePostOrder");
		traversePostOrder(root);
		
		System.out.println(" ");
		System.out.println("height: " + height(root));
		
	}

}
