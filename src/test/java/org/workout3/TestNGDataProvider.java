package org.workout3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	@Test(dataProvider="result")
	private void test01(String s1 , String s2) {
		System.out.println(s1);
		System.out.println(s2);

	}
	@DataProvider(name="result")
	@Test
	private Object[][] test02() {
		Object obj[][]= new Object[][] {{"arul","arul@123"},{"suhail","suhail@123"},{"madan","madan@123"}};
		return obj;

	}
	
	
	
	

}
