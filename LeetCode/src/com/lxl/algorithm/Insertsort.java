package com.lxl.algorithm;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Insertsort {
public void sort(int n){
	int a[] ={0,3,2,1};
	int i,j,k;
	for (i = 1; i < n; i++) {
		for(j=i-1;j>=0;j--){
			if(a[j]<a[i]){
				break;
			}
		}
		if(j!=i-1){
			int temp = a[i];
		for(k=i-1;k>j;k--){
			a[k+1]=a[k];
		}
		a[k+1]=temp;
	}
	}
	for(int z=0;z<n;z++){
		System.out.println(a[z]);
	}
}
public static void main(String[] args) {
	Insertsort sort = new Insertsort();
	int a[] ={0,3,2,1};
	sort.sort(4);
}

}

