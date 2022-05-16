package org.workout3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRerun {
	@Test
	private void tc01() {
		System.out.println("Test 01");
	}
	@Test
	private void tc02() {
		Assert.assertTrue(false);
	}
	@Test
	private void tc03() {
		Assert.assertTrue(false);
	}
	@Test
	private void tc04() {
		System.out.println("Test 04");
	}
	

	


}
