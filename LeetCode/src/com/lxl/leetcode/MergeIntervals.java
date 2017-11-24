package com.lxl.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
//Given [1,3],[2,6],[8,10],[15,18],
//return [1,6],[8,10],[15,18].
public class MergeIntervals {
	public class Interval {
		      int start;
		      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
		  }
	public List<Interval> merge(List<Interval> intervals){
		 List<Interval> res = new LinkedList<>();
		 if(intervals.size()<=0){
	            return intervals;
		 }
		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				if(o1.start<o2.start){
					return -1;
				}else if(o1.start>o2.start){
					return 1;
				}else{
					return 0;
				}
			}
		});
		
		Interval top = intervals.get(0);
		int start = top.start;
		int end = top.end;
		for (int i = 0; i < intervals.size(); i++) {
			Interval cur = intervals.get(i);
			if(cur.start>end){
			 res.add(new Interval(start,end));
			 start=cur.start;
			 end=cur.end;
			}else{
				end=Math.max(end, cur.end);
			}
		}
		 res.add(new Interval(start, end)); 
		return res;
		
	}
}
