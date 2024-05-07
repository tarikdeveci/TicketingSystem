/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketingsystem;

/**
 *
 * @author omer-
 */
public class Tree {

	 private Node root;
	 
	 public Tree() {
	 root = null;
	 }
	 
	 public void insert(int key) {
	 root = insert(key, root);
	 }
	 
	 private static Node insert(int key, Node t) {
	 if (t == null)
		 t = new Node(key, null, null);
	 else if (key < t.getKey())
		 t.leftChild = insert(key, t.leftChild);
	 else if (key > t.getKey())
		 t.rightChild = insert(key, t.rightChild);
	 else ;
	 	return t;
	 }
	 
	 public Node search(int key) {
		 return search(key, root);
		 }
	 
	 private static Node search (int key, Node t) {
		 if (t == null)
			 return null;
		 else if (key < t.getKey())
			 return search(key, t.leftChild);
		 else if (key > t.getKey())
			 return search(key, t.rightChild);
		 else
			 return t;
		 }
		 
	 public void remove(int key) {
		 root = remove(key, root);
		}
	 
	 private static Node remove(int key, Node t) {
		 if (t == null)
			return t;
		 if (key < t.getKey())
		 t.leftChild = remove(key, t.leftChild);
		 else if (key > t.getKey())
		 t.rightChild = remove(key, t.rightChild);
		 else if (t.leftChild != null && t.rightChild != null) {
		 t.setKey(findMax(t.leftChild).getKey());
		 t.leftChild = remove(t.getKey(), t.leftChild);
		 } else if (t.leftChild != null)
		 t = t.leftChild;
		 else
		 t = t.rightChild;
		 	return t;
	 	}

	 public Node findMax() {
		 if(root == null)
			 return null;
		 return findMax(root);
	 }
	 
	 public static Node findMax(Node t) {
		 if(t.rightChild == null)
			 return t;
		 return findMax(t.rightChild);
	 }
	 
	 public Node findMin() {
		Node t = root;
		if(t != null)
			while(t.leftChild != null)
				t = t.leftChild;
		return t;
	 }
	 
	 static void preorder(Node t) {
		 if(t != null) {
			 System.out.println(t.getKey()); //root
			 preorder(t.leftChild);//left
			 preorder(t.rightChild);//right
		 }
	 }
	 
	 static void inorder(Node t) {
		 if(t != null) {
			 inorder(t.leftChild);//left
			 System.out.println(t.getKey()); //root
			 inorder(t.rightChild);//right
		 }
	 }
	 
	 static void postorder(Node t) {
		 if(t != null) {
			 postorder(t.leftChild);//left
			 postorder(t.rightChild);//right
			 System.out.println(t.getKey()); //root
		 }
	 }
	 
	 public static void main(String[] args) {
		Node a = new Node (3, null, null);
		Node b = new Node (6, null, null);
		Node c = new Node (13, null, null);
		Node d = new Node (11, null, c);
		Node e = new Node (9, b, d);
		Node f = new Node (5, a, e);
		Tree t1 = new Tree();
		t1.root = f;
		
		/*
		 * 						5
		 * 				3				9
		 * 							6		11
		 * 										13
		 * 
		 */
		
		System.out.println(t1.root.getKey());
		System.out.println("INORDER");
		inorder(t1.root);
		System.out.println("PREORDER");
		preorder(t1.root);
		System.out.println("POSTORDER");
		postorder(t1.root);
	}
	 
	 } 
