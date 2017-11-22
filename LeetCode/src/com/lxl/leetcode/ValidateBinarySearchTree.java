package com.lxl.leetcode;

import java.util.ArrayList;
import java.util.List;

//Validate Binary Search Tree 验证二叉搜索树
public class ValidateBinarySearchTree {
	public class TreeNode { 
		      int val; 
		      TreeNode left; 
		      TreeNode right; 
		      TreeNode(int x) { val = x; }
	}
	 public boolean isValidBST(TreeNode root) {
	        List<Integer> list = new ArrayList<Integer>();
	        inorder(root, list);
	        for (int i = 0; i < list.size() - 1; ++i) {
	            if (list.get(i) >= list.get(i + 1)) return false;
	        }
	        return true;
	    }
	    public void inorder(TreeNode node, List<Integer> list) {
	        if (node == null) return;
	        inorder(node.left, list);
	        list.add(node.val);
	        inorder(node.right, list);
	    }
}
