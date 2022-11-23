package com.bridgelabz.linkedlistuc3;

public class LinkedList {

	Node head;
	Node tail;
	
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked List is Empty");
		}
		else {
			Node temp = head;
			while(head != null) {
				System.out.println(temp.data+" ");
			temp = temp.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}
}
