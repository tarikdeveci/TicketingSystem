/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketingsystem;

/**
 *
 * @author salih
 */
public class Node {
	
	 private int key;
	 Node leftChild, rightChild;
	 
	 Node (int key, Node leftChild, Node rightChild) {
	 this.key = key;
	 this.leftChild = leftChild;
	 this.rightChild = rightChild;
	 }
	 
	 public int getKey() {
	 return key;
	 }
	 
	 public void setKey(int key) {
	 this.key = key;
	 }

}
