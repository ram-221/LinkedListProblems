package com.bridgelabz.linkedlistuc2;

public class LinkedList {

	Node head;
	
	public Node push(int data) {
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
	
	public void Print() {
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
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.Print();
	}
}
