package com.bridgelabz.linkedlistuc4;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		System.out.println("Welcome to linkedList DataStructure Program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start"); 
		System.out.println("Enter 2 to add the data at the End"); 
		System.out.println("Enter 3 to add the data at In Between "); 
		switch (scan.nextInt()) {

		case 1:
			linkedList.insert(70);
			linkedList.insert(30);
			linkedList.insert(56);

			linkedList.print();
			break;
		case 2:
			linkedList.append(56);
			linkedList.append(30);
			linkedList.append(70);

			linkedList.print();
			break;
		case 3:
			Node secondNode = linkedList.insert(70);
			Node firstNode = linkedList.insert(56);
			Node newNode = new Node(30);
			System.out.println("Before:");
			linkedList.print();
			linkedList.insertInBetween(firstNode,newNode);
			System.out.println(" ");
			System.out.println("After");
			linkedList.print();
		}
		scan.close();
	}
}
