package com.lxl.leetcode;

public class RotateImage {
	//旋转图像
//1 2 3    1 4 7    7 4 1
//4 5 6    2 5 8    8 5 2
//7 8 9    3 6 9    9 6 3
	
	public  void solution(){
		int[][] n  = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				swap(n[i][j],n[j][i]);
			}
			swap(n[i][0],n[i][2]);
		}
	}
}
