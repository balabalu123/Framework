package org.workout3;

public class SamplePojo {

	public static void main(String[] args) {
		
		FrameworkBaseclass b = new FrameworkBaseclass();
		
		b.launchBrowser();
		b.launchUrl("https://www.facebook.com/");
		
		POJOClass p = new POJOClass();
		
		b.type(p.getTextuser(), "bala");
		b.type(p.getTextpass(), "Bala1234");
		b.buttonclick(p.getLoginbtn());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
