package com.java.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReduceNumberToZeroTest {
	
	
	/**
	 * 1342. Number of Steps to Reduce a Number to Zero
	 * **/

	@Test
	public void test() {
		int num = numberOfSteps (14);
		assertEquals(num, 6);
		
		int num1 = numberOfSteps (8);
		assertEquals(num1, 4);
		
		int num2 = numberOfSteps (123);
		assertEquals(num2, 12);
		
	}
	
	
	 public int numberOfSteps (int num) {
	        int steps = 0; // 
	        while (num != 0) { // true
	        	
	            if(num % 2 != 0) { //
	                steps++;     //1
	                num = num-1;      
	            } else {
	            	num = num / 2;
		            steps++;
	            } 
	            
	        }
	        return steps;
	        
	    }

}
