package com.linkedlist;

public class LinkedListConnectingToTailNode {
	Node head;
	public void addToHead(int data) {
		Node node = new Node(data);//40, 30, 20, 10
		if(head==null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	public void addNodeToTail(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
		} else {
			Node currentNode = head;
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
	}
	
	public void printList() {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	public static void main(String[] args) {
		LinkedListConnectingToTailNode ltn = new LinkedListConnectingToTailNode();
		ltn.addToHead(10);
		ltn.addToHead(20);
		ltn.addToHead(30);
		ltn.addToHead(40);
		ltn.addNodeToTail(45);
		ltn.addNodeToTail(50);
		ltn.printList();
	}
}
