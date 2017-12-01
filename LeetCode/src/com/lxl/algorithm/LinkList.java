package com.lxl.algorithm;

public class LinkList {
	static class Node {
		Node next ;
		int data;
		public Node(int val){
			this.data=val;
		}
	}
	Node first;
	int pos = 0 ;
	public void addFirst(int value){
		Node node = new Node(value);
		node.next=first;
		first = node ;
	}
	public void add(int index , int value){
		Node node = new Node(value);
		Node cur = first;
		Node pre = first;
		while(pos !=index){
			pre = cur;
			cur = cur.next;
			pos++;
		}
		node.next = cur;
		pre.next=node;
		pos = 0;
	}
	public void del(int index){
		Node cur =first;
		Node pre = first;
		while (pos != index ){
			pre =cur;
			cur = cur.next;
			pos ++;
			
		}
		if(cur == first){
			first = first.next;
		}else{
			pre.next=cur.next;
			pos = 0;
		}
	}
	public Node reverse(){
		Node pre = first;	
		Node cur = first.next;
		Node temp;
		while(cur !=null){
			temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur =temp;
		}
		first.next=null;
		return pre;
	}
}
