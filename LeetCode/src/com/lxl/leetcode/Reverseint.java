package com.lxl.leetcode;

public class Reverseint {
	public static String reverse(int a){
		if(a<0) return "" ;
		if(a<10) return Integer.toString(a);
		int last = a-(a/10)*10;
		return Integer.toString(last)+reverse(a/10);		
	}
}
