package com.lxl.algorithm;

import java.util.Arrays;

public class Unique {
		public static int[] unique(int[] nums){
			Arrays.sort(nums);
			int index = 1;
			for (int i = 1; i < nums.length; i++) {
				if(nums[i] != nums[i-1]){
					nums[index++]=nums[i];
				}
			}

			return nums;
		}

}
