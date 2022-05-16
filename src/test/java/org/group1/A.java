package org.group1;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups= {"reg","smoke"})
	private void test01() {
		System.out.println("Test 1");

	}
	
	@Test(groups="smoke")
	private void test02() {
		System.out.println("Test 2");

	}
	
	@Test(groups="sanity")
	private void test03() {
		System.out.println("Test 3");

	}
	@Test(groups="E2E")
	private void test04() {
		System.out.println("Test 4");

	}
	
	
	

}
