package com.lxl.leetcode;
//寻找相同的子字符串
public class Strstr {
	public int solution(String str1,String str2){
		int m=str1.length();int n=str2.length();
		for(int i=0;i<m-n;i++){
			int j = 0;
			for(j=0;j<n;j++){
				if(str1.charAt(i+j)!=str2.charAt(j)){
					break;
				}
			}
			if(j==n){
				return i;
			}
		}
		return -1	;
		
	}
}
