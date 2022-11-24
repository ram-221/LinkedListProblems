package com.bridgelabz.linkedlistuc4;

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