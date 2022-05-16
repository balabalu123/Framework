package org.workout3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class A1 {
	
	@Test
	public  void test01() {
		System.out.println("Test 01");

	}
	@Ignore
	@Test
	public  void test02() {
		System.out.println("Test 02");

	}
	@Test
	public  void test03() {
		System.out.println("Test 03");

	}
	@Test
	public  void test04() {
		Assert.assertTrue(false);

	}

}
