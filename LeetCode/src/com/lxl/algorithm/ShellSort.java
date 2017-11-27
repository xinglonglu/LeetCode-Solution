package com.lxl.algorithm;

public class ShellSort {
public void sort(int a[] , int n){
		int i ,j,gap;
		for ( gap = n/2; gap > 0; gap /= 2) {
			for ( i = 0 ;i<gap; i++) {
				 for(j= i+gap;j<n;j+=gap){
					 int k = j-gap;
					 int temp=a[j];
					 for (; k>=0&&a[k]>temp;k-=gap) {
						a[k+gap]=a[k];
					}
					 a[k+gap]=temp;
				 }
			}
		}
		
}
}

