package com.lxl.leetcode;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayNesting {
private static final List<Object> ArrayList<Object> = null;
/**
 * Input: A = [5,4,0,3,1,6,2]
   Output: 4
   Explanation: 
A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

   One of the longest S[K]:
S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 */
	
	
	public int arrayNesting(int[] nums) {
		boolean[] visited = new boolean[nums.length];
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if(! visited[i]){
				int start = nums[i] , count=0;
				do{
					start =nums[start];
					count++;
					visited[start] = true;
				}
				while(start != nums[i]);
					res=Math.max(res, count);
			}
		}
		return res;
		
	}
	public static void main(String[] args) throws Exception {
		List<Object> tempList= null;
		tempList.add("1");
		tempList.add(null);
		System.out.println(tempList.size());
	}
}
