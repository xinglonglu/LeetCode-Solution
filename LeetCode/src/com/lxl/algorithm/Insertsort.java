package com.lxl.algorithm;



public class Insertsort {
public static void sort(int n){
	int a[] ={0,3,2,1};
	int i;
	for (i = 1; i < n; i++) {
		int temp=a[i];
		int j=i-1;
		for (;j>=0&&a[j]>temp;j--) {
			a[j+1]=a[j];
		}
		a[j+1]=temp;
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

