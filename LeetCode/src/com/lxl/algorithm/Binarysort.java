package com.lxl.algorithm;

import java.util.LinkedList;

public class Binarysort {
public static int  binarysort(int[] nums ,int num) {
	int low = 0 ;
	int high = nums.length -1;
	while(low<high){
		int mid = (low + high )/2;
		if(num< nums[mid]){
			high = mid-1;
		}else if(num>nums[mid]){
			low = mid+1;
		}else{
			return mid;
		}
		
	}
	return -1;
	
}
public static void bubblesort(int[] nums){
	int t;
	for(int i =0 ; i<nums.length-1 ; i ++){
		  for (int j=0 ;j< nums.length-1 -i;j++){
			  if(nums[j] > nums[j+1]){
				  t=nums[j];
				  nums[j]=nums[j+1];
				  nums[j+1]=t;
				  
			  }
		  }
	}
}
public void insertsort(int[] nums){
	int i,j,k;
	for(i=1;i<nums.length;i++){
		 for(j=i-1;j>=0;j--){
			 if(nums[j]<nums[i]){
				 break;
			 }
		 }
		 if(j!=i-1){
			 int temp=nums[i];
		 
		 for(k=i-1;k>j;k--){
			 nums[k+1]=nums[k];
		 }
		 nums[k+1]=temp;
		 }
	}
}
public static void main(String[] args) {
//	int[]  nums={5,4,3,2,1};
//	bubblesort(nums);
//	System.out.println(nums[0]);
//	System.out.println(binarysort(nums ,3));
	LinkedList  a = new LinkedList();
	a.add(1);
	a.add(2);
	System.out.println(a);
}
}
