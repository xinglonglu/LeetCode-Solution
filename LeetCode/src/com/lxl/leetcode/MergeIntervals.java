package com.lxl.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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
		res.add(top);
		for (int i = 0; i < intervals.size(); i++) {
			Interval cur = intervals.get(i);
			Interval top1 = intervals.get(res.size()-1);
			if(cur.start<top1.start){
				top1.end=Math.max(cur.end, top1.end);				
			}else{
				res.add(cur);
			}
		}
		
		return res;
		
	}
}
