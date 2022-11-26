package com.bridgelabz.linkedlistuc5;

public class LinkedList {

	Node head;
	Node tail;
	
	public Node insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
	}
	
	public void print() {
			Node temp = head;
			while(head != null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
	
	public int pop() {
		int deleteValue = head.data;
		head = head.next;
		return deleteValue;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(70);
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.pop();
		linkedList.print();
	}
}
