package com.lxl.leetcode;

import java.util.HashSet;
import java.util.LinkedList;

//Word Ladder 词语阶梯
//start = hit，end = cog，dict = [hot, dot, dog, lot, log]
public class WordLadder {
	 public int ladderLength(String start, String end, HashSet<String> dict) {
		 LinkedList<String>  wordqueue = new LinkedList<String>();
		 int level=1;  int curnum=1; int nextnum=0;
		 wordqueue.add(start);
		 while(!wordqueue.isEmpty()){
			 String word = wordqueue.poll();
			 curnum--;
			 for (int i = 0; i < word.length(); i++) {
				char[] wordunit=word.toCharArray();
				for(char j='a';j<='z';j++){
					wordunit[i]=j;
					String temp = new String(wordunit);
					if(temp.equals(end)){
						return level+1;
					}
					if(dict.contains(temp)){
						wordqueue.add(temp);
						nextnum++;
						dict.remove(temp);
						
					}
				}
			}
			 if(curnum==0){
				 curnum=nextnum;
				 nextnum=0;
				 level++;
			 }
		 }

		return 0;
		 
	 }
}
