package org.workout3;

import org.testng.annotations.Parameters;

public class TestNGCrossBrowserTesting {
	@Parameters("browserName")
	@org.testng.annotations.Test
	public  void test01(String bName) {
		
		if (bName.equalsIgnoreCase("chrome")) {
			
			System.out.println("chrome");
			}
		
		else if (bName.equalsIgnoreCase("FireFox")) {
			System.out.println("FireFox");
			
		}
		else if (bName.equalsIgnoreCase("IE")) {
			System.out.println("IE");
			
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		//testng.xml file view
		
		
//		<suite name="Suite">
	//	  <test  name="ChromeTest">
		//  <parameter name="browserName" value="chrome"></parameter>
		 // <classes>
		   //   <class name="org.workout3.TestNGCrossBrowserTesting"/>
		    //</classes>
		 // </test> <!-- Test -->
		  //<test  name="FireFoxTest">
		  //<parameter name="browserName" value="FireFox"></parameter>
		  //<classes>
		  //    <class name="org.workout3.TestNGCrossBrowserTesting"/>
		  //  </classes>
		 // </test> <!-- Test -->
		//  <test  name="IETest">
		//  <parameter name="browserName" value="IE"></parameter>
		//  <classes>
		 //     <class name="org.workout3.TestNGCrossBrowserTesting"/>
		 //   </classes>
		 // </test> <!-- Test -->
		  
	//	</suite> <!-- Suite -->

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	

}
