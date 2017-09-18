package com.lxl.algorithm;

import java.util.LinkedList;
import java.util.List;

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
      public static void main(String[] args) {
    	  BinTree2 tree = new BinTree2();
    	  Node root = nodelist.get(0); 
    	  tree.createtree();
    	  tree.preOrderTraverse(root);
	}
}
