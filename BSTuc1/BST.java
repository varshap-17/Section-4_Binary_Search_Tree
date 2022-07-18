package ex.bridgelabzs;

public class BST {
	class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        }
    }
	Node root;
	BST(){
		root=null;
	}
	void insert(int key) {
		root=insert_Recursive(root,key);
	}
	Node insert_Recursive(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key) {
			root.left=insert_Recursive(root.left,key);
		}else if(key>root.key) {
			root.right=insert_Recursive(root.right,key);
		}
		return root;
	}
	void inorder() {
		inorder_Recursive(root);
	}
	void inorder_Recursive(Node root) {
		if(root!=null) {
			inorder_Recursive(root.left);
			System.out.println(root.key+ " ");
			inorder_Recursive(root.right);
		}
	}
	public static void main(String[] args) {
		BST bst=new BST();
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		System.out.println("the binary search tree created with input data(in order as left-root-right)");
		bst.inorder();
	}
}
