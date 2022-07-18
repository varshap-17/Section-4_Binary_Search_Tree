package ex.bridgelabzs;

public class Bstparent_child {
	class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        }
    }
	Node root;
	Bstparent_child(){
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
		Bstparent_child bst=new Bstparent_child();
		bst.insert(56);
		bst.insert(30);
		bst.insert(22);
		bst.insert(11);
		bst.insert(3);
		bst.insert(16);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(65);
		bst.insert(63);
		bst.insert(67);
		bst.insert(95);
		System.out.println("the bst created with input data(left-root-right)");
		bst.inorder();
		System.out.println("11,30,65,70 are the parent nodes");
	}
}
