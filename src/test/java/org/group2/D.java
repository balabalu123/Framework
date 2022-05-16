package org.group2;

import org.testng.annotations.Test;

public class D {
	@Test(groups="E2E")
	private void test31() {
		System.out.println("Test 31");

	}
	
	@Test(groups="smoke")
	private void test32() {
		System.out.println("Test 32");

	}
	
	@Test(groups="reg")
	private void test33() {
		System.out.println("Test 33");

	}
	@Test(groups="smoke")
	private void test34() {
		System.out.println("Test 34");

	}
	

}
