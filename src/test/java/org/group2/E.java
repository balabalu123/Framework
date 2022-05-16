package org.group2;

import org.testng.annotations.Test;

public class E {
	@Test(groups="smoke")
	private void test41() {
		System.out.println("Test 41");

	}
	
	@Test(groups="reg")
	private void test42() {
		System.out.println("Test 42");

	}
	
	@Test(groups="E2E")
	private void test43() {
		System.out.println("Test 43");

	}
	
}
