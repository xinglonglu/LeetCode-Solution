package com.lxl.leetcode;
//   b b b a b 
//b  1 2 3 3 4
//b    1 2 2 3
//b      1 1 3
//a        1 1
//b          1


//  c b b d
//c 1 1 2 2
//b   1 2 2
//b     1 1
//d       1
public class LongestPalindromic {
public static int Solution()  {
	String str = "cbbd";
	int n = str.length();
	int[][]  DP = new int[4][4];
	for(int i = 0 ; i<n;i++){
		DP[i][i]=1;
	}
    for(int i = n-2;i>=0;i--){
    	for(int j=i+1;j<=n;j++){
    		if(str.charAt(i)==str.charAt(j)){
    			 if(j==i+1){
    				 DP[i][j]=2;
    			 }else{
    				 DP[i][j]=DP[i+1][j-1]+2;
    			 }
    		}else{
    			DP[i][j]=Math.max(DP[i][j-1], DP[i+1][j]);
    		}
    	}
    }
	
    	
	
	return DP[0][n-1];	
}
public static void main(String[] args) {
	System.out.println(Solution());
}
}