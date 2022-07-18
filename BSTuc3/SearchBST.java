package ex.bridgelabzs;

public class SearchBST {
	class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        }
    }
	Node root;
	SearchBST(){
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
	boolean search(int key) {
		root=search_Recursive(root,key);
		if(root!=null) {
			return true;
		}else
			return false;
	}
	Node search_Recursive(Node root,int key) {
		if(root==null || root.key==key) {
			return root;
		}
		if(root.key>key) {
			return search_Recursive(root.left,key);
		}else
			return search_Recursive(root.right,key);
	}
	public static void main(String[] args) {
		SearchBST bst=new SearchBST();
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
		System.out.println("the bst created with left-root-right input data");
		bst.inorder();
		boolean value=bst.search(63);
		System.out.println("\n key 63 found in bst:" +value);
	}
}
