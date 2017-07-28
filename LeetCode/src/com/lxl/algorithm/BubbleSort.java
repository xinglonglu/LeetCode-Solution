package com.lxl.algorithm;

public class BubbleSort {
public void sort (int[] numbers){
	int n =  numbers.length-1 ;
	int t;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n-i; j++) {
			if(numbers[j]<numbers[j+1]){
				t=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=t;
			}
		}
	}
}
}
