package org.workout3;

public class SAMPLE extends FrameworkBaseclass {
	
	public static void main(String[] args) {
		
		FrameworkBaseclass b = new FrameworkBaseclass ();
		
		
		b.launchBrowser();
		b.launchUrl("https://www.facebook.com/");
		POJOClass p = new POJOClass();
		b.type(p.getTextuser(), "balu");
		b.type(p.getTextpass(), "123");
		b.buttonclick(p.getLoginbtn());
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
