package com.lxl.leetcode;

public class MaximumAverageSubarrayI {

	/**
	 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
	 * And you need to output the maximum average value.
	 */
	public double findmaxavg(int[] nums, int k){
		double res = Integer.MIN_VALUE;
		for (int s = 0; s < nums.length -k + 1; s++) {
			double sum = 0;
			for (int i = 0; i < k; i++) {
				sum+=nums[i+s];
			}
			res = Math.max(res, sum/k);
		}
		return res;		
	//Time complexity : O(n*k). 
	//Space complexity : O(1).
	
		
		

	}
	
	
	
	
	
	
	
}
