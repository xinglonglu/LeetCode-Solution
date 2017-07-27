package com.lxl.leetcode;
/**
 * 求absent的个数，和最大连续late的个数，若absent大于1，或者最大连续late大于2返回false
 * @author issuser
 *Input: "PPALLP"
 *Output: True
 *Input: "PPALLL"
 *Output: False
 *
 */
public class StudentAttendanceRecordI {
      public boolean solution(String s) {
    	  int anum=0,latenum=0,lastnum=0;
    	  String[] ss =s.split("");
    	  for (int i = 1; i < s.length(); i++) {
			if(ss[i]=="A"){
				anum++;
				lastnum=Math.max(lastnum, latenum);
				latenum=0;
			}
			else if(ss[i]=="L"){
				latenum++;
			}else{
				lastnum=Math.max(lastnum, latenum);
				latenum=0;
			}
			}
		if(anum>1||latenum>2){
		return false;
		}
	    return true;
     }
      public static void main(String[] args) {
    	  StudentAttendanceRecordI ss = new StudentAttendanceRecordI();
    	  String s = "PPALL";
    	  ss.solution(s);
	}
}
