package com.lxl.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinTree2 {
      private int[] array = {1,2,3,4,5,6,7,8,9};
      private static List<Node> nodelist = null;
      private static class Node{
    	  Node childleft;
    	  Node childright;
    	  int date;
    	  Node(int newdate){
    		  childleft=null;
    		  childright=null;
    		  date=newdate;
    	  }
      }
      public void createtree(){
    	  nodelist = new LinkedList<Node>();
    	  for(int index=0;index<array.length;index++){
    		  nodelist.add(new Node(array[index]));
    	  }
    	  for(int parentIndex=0;parentIndex<array.length/2-1;parentIndex++){
    		  nodelist.get(parentIndex).childleft = nodelist.get(parentIndex*2+1);
    		  nodelist.get(parentIndex).childright = nodelist.get(parentIndex*2+2);
    	  }
    	  int lastparentindex = array.length/2-1;
    	  nodelist.get(lastparentindex).childleft = nodelist.get(lastparentindex*2+1);
    	  if(array.length%2==1){
    		  nodelist.get(lastparentindex).childleft = nodelist.get(lastparentindex*2+2);
    	  }
      }
      public static void preOrderTraverse(Node node) {  
          if (node == null)  
              return;  
          System.out.print(node.date + " ");  
          preOrderTraverse(node.childleft);  
          preOrderTraverse(node.childright);  
      }
      public static void preorder2(Node node){
    	  Stack<Node> s = new Stack<Node>();
    	  while(node !=null || !s.isEmpty()){
    		  while(node!=null){
    			  System.out.println(node.date);
    			  s.push(node);
    			  node=node.childleft;
    		  }
    		  if(!s.isEmpty()){
    			  node=s.pop();
    			  node=node.childright;
    		  }
    	  }
      }
      public static void inorder2(Node node){
    	  Stack<Node> s = new Stack<Node>();
    	  while(node !=null || !s.isEmpty()){
    		  while(node!=null){
    			  s.push(node);
    			  node=node.childleft;
    		  }
    		  if(!s.isEmpty()){
    			  node=s.pop();
    			  System.out.println(node.date);
    			  node=node.childright;
    		  }
    	  }
      }
      public static void PostOrder2(Node node) { 
    	  Stack<Node> s = new Stack<Node>();
    	  Stack<Integer> s2 = new Stack<Integer>();
    	  Integer i = new Integer(1);
    	  while(node !=null || !s.isEmpty()){
    		  while(node!=null){
    			  s.push(node);
    			  s2.push(new Integer(0));
    			  node=node.childleft;
    		  }
    		  while(!s.isEmpty()||s2.peek().equals(i)){
    			  s2.pop();
    			  System.out.println(s.pop().date);
    		  }
    		  if(!s.empty()){
    			  s2.pop();
    			  s2.push(new Integer(1));
    			  node=s.peek();
    			  node=node.childright;
    		  }	  
    	  }
   	  
      }
      public static void main(String[] args) {
    	  BinTree2 tree = new BinTree2();
    	  Node root = nodelist.get(0); 
    	  tree.createtree();
    	  tree.preOrderTraverse(root);
    	  tree.preorder2(root);
	}
}
