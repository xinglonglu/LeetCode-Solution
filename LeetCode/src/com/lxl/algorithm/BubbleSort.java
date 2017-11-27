package com.lxl.algorithm;

public class BubbleSort {
public void sort (int[] numbers){
	int n =  numbers.length-1 ;
	int t;
	for (int i = n; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if(numbers[j]>numbers[j+1]){
				t=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=t;
			}
		}
	}
}
}
