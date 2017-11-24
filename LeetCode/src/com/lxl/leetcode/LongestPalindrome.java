package com.lxl.leetcode;

import java.lang.Character.Subset;
//最长回文子串

//			c b b c
//		  c t f f t
//        b   t t f
//        b     t f
//        c       t
public class LongestPalindrome {
		public static String solution(String s){
			int maxlength=0;
			int maxstart=0;
			int slong = 0;
			int len = s.length();
			boolean[][] DP=new boolean[len][len];
			for (int i = 0; i < len; i++) {
				 for (int j = 0; j < i; j++) {
					DP[j][i]=(s.charAt(i)==s.charAt(j)&&(i-j<2||DP[j+1][i-1]));
					if(DP[j][i]&&slong<i-j+1){
						slong=i-j+1;
						maxstart=j;
						maxlength=i;
					}
				}
				 DP[i][i]=	true;
			}
			return  s.substring(maxstart,maxlength+maxstart+1);
		}
		public static void main(String[] args) {
			String s = "cbbc";
			System.out.println(solution(s));
		}
}
