package com.lxl.leetcode;

public class ClimbingStairs {
	
	//递归法
		public int fell(int n){
			if(n==0||n==1){
				n=1;
			}
			return fell(n-1)+fell(n-2);
			
		}
	//	dp
		public int climbingstairs(int n){
			int[] dp =new int [n];
			dp[0]=1;dp[1]=1;dp[2]=2;
			for (int i = 3; i < n; i++) {
				dp[n]=dp[n-1]+dp[n-2];
			}
			return dp[n];
		}
}
