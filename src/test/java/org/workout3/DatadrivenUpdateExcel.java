package org.workout3;

import java.io.IOException;

public class DatadrivenUpdateExcel {
	
	public static void main(String[] args) throws IOException {
		

	FrameworkBaseclass b = new FrameworkBaseclass();
	
	b.launchBrowser();
	b.launchUrl("https://www.facebook.com/");
	String title = b.getpageTitle();
	b.Upadateexcel("Sheet1", 0, 0, title);
	
	}

}
