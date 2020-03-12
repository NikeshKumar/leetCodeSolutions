package com.java.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallerNumbersThanCurrentTest {
	
	/**
	 * 1365. How Many Numbers Are Smaller Than the Current Number
	 * **/

	@Test
	public void test() {
		int[] nums = [8,1,2,2,3];
		
	}
	
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	
    	for (int i=0; i< nums.length; i++ ){
    		int x= 0;
    		for (int j =0; j < nums.length; j++) {
    		
    			if (nums[j] < nums[i] && j != i) {
    				x++;
    			}
    		}
    	}
    	
		return nums;
    }
}
