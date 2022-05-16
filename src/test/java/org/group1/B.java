package org.group1;

import org.testng.annotations.Test;

public class B {
	@Test(groups="reg")
	private void test11() {
		System.out.println("Test 11");

	}
	
	@Test(groups="sanity")
	private void test12() {
		System.out.println("Test 12");

	}
	
	@Test(groups="E2E")
	private void test13() {
		System.out.println("Test 13");

	}
	@Test(groups="smoke")
	private void test14() {
		System.out.println("Test 14");

	}
	
	
	
	
	

}
