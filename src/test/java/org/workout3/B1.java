package org.workout3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B1 {
	
	@Test
	public  void test11() {
		System.out.println("Test 11");

	}
	@Test
	public  void test12() {
		Assert.assertTrue(false);

	}
	@Test
	public  void test13() {
		System.out.println("Test 13");

	}
	@Ignore
    @Test
	public  void test14() {
		System.out.println("Test 13");

	}

}
