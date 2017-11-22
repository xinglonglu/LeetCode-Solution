package com.lxl.leetcode;

public class SetMatrixZeroes {
		public void setzeroes(int[][] matrix){
			int m = matrix.length;//行
			int n = matrix[0].length;//列
			int i,j;
			boolean firstrow = false;boolean firstcol = false;
			for (i = 0;  i< m; i++) {
				if(matrix[i][0]==0){
					firstrow=true;
				}
			}
			for (j = 0;  j< n; j++) {
				if(matrix[0][j]==0){
					firstcol=true;
				}
			}
			for(i=1; i<m; i++){
				for(j=1;j<n;j++){
					if(matrix[i][j]==0){
						matrix[i][0]=0;
						matrix[0][j]=0;
					}
				}
			}
			for(i=1;i<m;i++){
				if(matrix[i][0]==0){
					for(j=1;j<n;j++){
						matrix[i][j]=0;
					}
				}
			}
	        for (j = 1; j < n; j++) {  
	            if (0 == matrix[0][j]) {  
	                for (i = 1; i < m; i++) {  
	                    matrix[i][j] = 0;  
	                }  
	            }  
	        }  
	        if (firstrow) {  
	            for (j = 0; j < n; j++) {  
	                matrix[0][j] = 0;  
	            }  
	        }  
	        if (firstcol) {  
	            for (i = 0; i < m; i++) {  
	                matrix[i][0] = 0;  
	            }  
	        }  

		}
}
