package com.lxl.leetcode;

public class MoreHalf {
	public static int morehalf(int[] nums){
		int result = nums[0];
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if(count == 0){
				result = nums[i];
				count++;
				continue;
			}
			if(result==nums[i]){
				count++;
			}else{
				count--;
			}
		}
		

		return result;
		
	}
	public static void main(String[] args) {
		int[] nums = {1,2,2,2,3,4};
		System.out.println(morehalf(nums));
	}
}
