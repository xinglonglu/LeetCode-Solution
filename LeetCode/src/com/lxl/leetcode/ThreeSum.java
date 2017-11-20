package com.lxl.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
//For example, given array S = {-1 0 1 2 -1 -4},A solution set is:
//    (-1, 0, 1)
//    (-1, -1, 2)
	public static Set solution(int[] nums){
		Set res = new HashSet() ;
		Arrays.sort(nums);
		for(int k = 0;k<nums.length;k++){
			int target = 0-nums[k];
			int i = k+1;int j=nums.length-1;
			while(i<j){
				if(nums[i]+nums[j]==target){
				List reslist=new ArrayList();
				reslist.add(nums[k]);
				reslist.add(nums[i]);
				reslist.add(nums[j]);
				res.add(reslist);
				}else if(nums[i]+nums[j]<target){
					i++;
				}else{
					j--;
				}
			}
			
		}
		
		System.out.println(res);
		return res;
		
	}
	public static void main(String[] args) {
		int[] nums = {-1, 0 ,1 ,2 ,-1 ,-4};
		solution(nums);
	}
}
