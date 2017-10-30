package com.lxl.leetcode;

public class WiggleSort {

	//Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

    //For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		for (int i = 1; i < nums.length; i+=2) {
			if((i%2==0&&nums[i]<=nums[i-1])||(i%2==1&&nums[i]>=nums[i-1])){
				swap(nums,i,i-1);
			}
			
		}
		for (int j = 0; j< nums.length; j++) {
			System.out.println(nums[j]);
		}
		
		
	}

	private static void swap(int[] nums, int i, int j) {
		nums[i]^=nums[j];
		nums[j]^=nums[i];
		nums[i]^=nums[j];
		
	}


		
	


}
