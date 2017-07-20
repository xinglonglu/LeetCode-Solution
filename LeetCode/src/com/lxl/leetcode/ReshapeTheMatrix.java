package com.lxl.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ReshapeTheMatrix {
	  public int[][] matrixReshape(int[][] nums, int r, int c) {
	        int[][] res = new int[r][c];
	        if (nums.length == 0 || r * c != nums.length * nums[0].length)
	            return nums;
	        int rows = 0, cols = 0;
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[0].length; j++) {
	                res[rows][cols] = nums[i][j];
	                cols++;
	                if (cols == c) {
	                    rows++;
	                    cols = 0;
	                }
	            }
	        }
	        return res;
	    }
	  public int[][] matrixReshape2(int[][] nums, int r, int c) {
	        int[][] res = new int[r][c];
	        if (nums.length == 0 || r * c != nums.length * nums[0].length)
	            return nums;
	        int count = 0;
	        Queue < Integer > queue = new LinkedList <Integer > ();
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[0].length; j++) {
	                queue.add(nums[i][j]);
	            }
	        }
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	                res[i][j] = queue.remove();
	            }
	        }
	        return res;
	    }
}
