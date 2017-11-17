package com.lxl.leetcode;
//题意：给两个数组n1[1,2,3],n2[3,4,5],把n2合并到n1中去，n1长度<=n1.length+n2.length
public class MergeSortedArray {
public static void main(String[] args) {
	int[] a = {1,2,3};
	int[] b = {3,4,5};
	int n = a.length;
	int m = b.length;
	MergeArray(a,b,n,m);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}

private static void MergeArray(int[] a, int[] b, int n, int m) {
	// TODO Auto-generated method stub
	int indexa=n-1;
	int indexb=m-1;
	int index=m+n;
	while(indexa>=0&&indexb>=0){
		if(a[indexa]<b[indexb]){
			a[index--]=b[indexb--];
		}else{
			a[index--]=a[indexa--];
		}
	}
	while(indexa>0){
		a[index--]=a[indexa--];
	}
	while(indexb>0){
		a[index--]=b[indexb--];
	}
}
}
