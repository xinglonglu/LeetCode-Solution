package com.lxl.algorithm;

public class Largest_substring2 {
    //  A B C D
	//C 0 0 1 0
	//B 0 1 0 0
	//C 0 0 2 0
	//E 0 0 0 0
		public static String maxsubstring(String str1,String str2){
			int len1 = str1.length();//横
			int len2 = str2.length();//纵
			int[] oldline = new int[len1];//上一行数据
			int[] curline = new int[len1];//当前行
			int pos = 0;//最大数据出现的列
			int maxnum = 0;//最大值
			for(int i = 0;i<len2;i++){
				char ch = str2.charAt(i);
				for(int j=0;j<len1;j++){
					if (ch==str1.charAt(j)){
						if(i==0){
							curline[j]=1;
						}else{
							curline[j]=oldline[j-1]+1;
						}
						if(curline[j]>maxnum){
							maxnum=curline[j];
							pos=j;
						}
					}
				}
				for(int k=0;k<len1;k++){
					oldline[k]=curline[k];
					curline[k]=0;
				}
			}
			
			return str1.substring(pos-maxnum+1,pos+1);
			
		}
		public static void main(String[] args) {
			String str1="ABCFD";
			String str2="CDBCFE";
			String str3=maxsubstring(str1,str2);
			System.out.println(str3);
		}
   
}
