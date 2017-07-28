package com.lxl.algorithm;

public class ShellSort {
public void sort(int a[] , int n){
		int i ,j,gap;
		for ( gap = n/2; gap > 0; gap /= 2) {
			for ( i = 0 ;i<gap; i++) {
				 for(j= i+gap;j<n;j+=gap){
					 if(a[j]<a[j-gap]){
						 int temp = a[j];
						 int k = j-gap;
						 while(k>=0&&a[k]>temp){
							 a[k+gap]=a[k];
							 k-=gap;
						 }
						 a[k+gap]=temp;
					 }
				 }
			}
		}
		
}
}

