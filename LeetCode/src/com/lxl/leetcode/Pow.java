package com.lxl.leetcode;
//Pow(x, n)
public class Pow {
	public static double mypow(double x,int n){
		if (n<0){
			return 1/power(x,n);
		}else{
			return power(x,n);
		}
	}
	public static double power(double x, int n) {
        if (n == 0) return 1;
        double half = power(x, n / 2);
        if (n % 2 == 0) return half * half;
        return x * half * half;
    }
	public static void main(String[] args) {
		System.out.println(mypow(3,6));
	}
}
