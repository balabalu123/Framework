package org.group1;

import org.testng.annotations.Test;

public class C {
	@Test(groups="sanity")
	private void test21() {
		System.out.println("Test 21");

	}
	
	@Test(groups="E2E")
	private void test22() {
		System.out.println("Test 22");

	}
	
	@Test(groups="smoke")
	private void test23() {
		System.out.println("Test 23");

	}
	@Test(groups="reg")
	private void test24() {
		System.out.println("Test 24");

	}
	
	

}
