package com.linkedlist;

public class LinkedListConnectingToHeadNode {

	Node head;
	
	public LinkedListConnectingToHeadNode() {
		head=null;
	}
	
	public void addToHead(int data) {
		Node node = new Node(data);//40, 30, 20, 10
		if(head==null) {
			head = node;
		} else {
			node.next = head;
			head = node;
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
		LinkedListConnectingToHeadNode list = new LinkedListConnectingToHeadNode();
		list.addToHead(10);
		list.addToHead(20);
		list.addToHead(30);
		list.addToHead(40);
		list.printList();
	}
}
