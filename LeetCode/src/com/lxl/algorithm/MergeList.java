package com.lxl.algorithm;

import java.util.Scanner;

public class MergeList {
	public static class ListNode{
	    int val;
	    ListNode next;
	    public ListNode (int value){
	    	this.val=value;
	    }
	}
	 public static ListNode Merge(ListNode list1,ListNode list2) {  
	       if(list1==null)return list2; //判断到某个链表为空就返回另一个链表。如果两个链表都为空呢？没关系，这时候随便返回哪个链表，不也是空的吗?  
	       if(list2==null)return list1;  
	       ListNode list0=null;//定义一个链表作为返回值  
	        if(list1.val<list2.val){//判断此时的值，如果list1比较小，就先把list1赋值给list0，反之亦然  
	           list0=list1;  
	           list0.next=Merge(list1.next, list2);//做递归，求链表的下一跳的值  
	           }  
	           else{  
	           list0=list2;  
	           list0.next=Merge(list1, list2.next);  
	           }  
	 return list0;  
	    } 
	 public static void main(String[] args) {
//		 ListNode list1=new ListNode(1);
//		 ListNode list2=new ListNode(2);
//		 ListNode list3=new ListNode(3);
//		 list2.next=list3;
//		 ListNode list0=Merge(list1, list2);
//		 System.out.println(list0);
		 System.out.println(345%10);
	}
}