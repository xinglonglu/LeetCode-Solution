package com.lxl.algorithm;

public class QuickSort {
		public int getMiddle(int[]a,int low,int high){
			int temp=a[low];
			while(low<high){
				while(low<high&&a[high]>temp){
					high--;
				}
				a[low]=a[high];
				while(low<high&&a[low]<temp){
					low++;
				}
				a[high]=a[low];
			}
			
			a[low]=temp;

			return low;
			
		}
		public void _quicksort(int[] list, int low,int high){
			if(low<high){
				int middle = getMiddle(list, low, high);
				_quicksort(list, low, middle - 1);
				_quicksort(list, middle + 1, high);
			}
		}
		
}
