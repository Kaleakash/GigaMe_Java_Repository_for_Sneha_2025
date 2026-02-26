package com.linkedlistdemo;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedList {
	Node insertAtBegin(Node head) {
	    Node newNode = new Node(head.data);
	    newNode.next = head;
	    return newNode;
	}
								// in container node added. [data,next]
	
	void traverse(Node head) {
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.next;		// link to next node 
	    }
	}

}
public class LinkedListDemo {

	public static void main(String[] args) {
		
	Node firstNode = new Node(10);
	Node secondNode = new Node(20);
	Node thirdNode = new Node(30);
	Node fourthNode = new Node(40);
	
	SingleLinkedList sll = new SingleLinkedList();
	sll.insertAtBegin(firstNode);
	sll.insertAtBegin(secondNode);
	sll.insertAtBegin(thirdNode);
	sll.insertAtBegin(fourthNode);
	
	sll.traverse(firstNode);
	}

}
