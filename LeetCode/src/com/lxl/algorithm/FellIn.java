package com.lxl.algorithm;
/**
 * 
 * @author lxl
 *  排队买票递归问题
 */
public class FellIn {
			public static long fell(int m  , int n){
				long sum;
				if(n==0){
					sum=1;
				}else if(m<n){
					sum=0;
				}else{
					sum = fell(m-1,n)+fell(m,n-1);
				}
				return sum;
			}
			public static void main(String[] args) {
				//2个拿零钱的 1个拿整钱的
				System.out.println(fell(2,1));
			}
}
