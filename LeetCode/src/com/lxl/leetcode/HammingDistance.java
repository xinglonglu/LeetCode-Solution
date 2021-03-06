package com.lxl.leetcode;

public class HammingDistance {
/**
 * 	The Hamming distance between two integers is the number of positions
 *  at which the corresponding bits are different.
 *	Given two integers x and y, calculate the Hamming distance.
 */
	 public int hammingDistance(int x, int y) {
	        return Integer.bitCount(x ^ y);
	    }
}
