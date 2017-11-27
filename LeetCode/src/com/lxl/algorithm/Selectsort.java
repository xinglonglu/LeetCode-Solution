package com.lxl.algorithm;

public class Selectsort {
		public static void selectsort(){
			int[] a= {1,3,4,2};
			int pos=0;
			for (int i = 0; i < a.length; i++) {
				
				int j = i+1;
				int temp = a[i];
				pos=i;
				for (; j < a.length; j++) {
					if(a[j]<temp){
						temp=a[j];
						pos=j;
					}
				}
				
				a[pos]=a[i];
				a[i]=temp;
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
		public static void main(String[] args) {
			selectsort();
		}
}
