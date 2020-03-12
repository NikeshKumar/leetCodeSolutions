package com.java.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class IPAddressTest {
	/**
	 * 1108. Defanging an IP Address
	 * **/

	@Test
	public void test() {
		assertEquals(defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
		assertEquals(defangIPaddr("255.100.50.0"), "255[.]100[.]50[.]0");
	}
	
	 public String defangIPaddr(String address) {
		return  address.replace(".", "[.]");
	        
	 }
	
	

}
