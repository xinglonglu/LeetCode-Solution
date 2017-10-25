package com.lxl.algorithm;

import com.lxl.algorithm.LinkList.Node;

public class SortLinklist {
	static class Node {
		Node next ;
		int data;
		public Node(int val){
			this.data=val;
		}
	}
	Node first;
	public void insert(int value){
		Node node = new Node(value);
		Node pre = first;
		Node cur = first;
		while(cur!=null&&node.data>cur.data){
			pre = cur;
			cur = cur.next;
		}
		pre.next = node ;
		node.next = cur;
	}
}
