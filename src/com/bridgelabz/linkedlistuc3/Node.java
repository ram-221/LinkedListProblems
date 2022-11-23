package com.bridgelabz.linkedlistuc3;

public class Node {

	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public String toString() {
		return "Node{"+
	"data ="+data+
	",next ="+next+
	'}';
	}
}
