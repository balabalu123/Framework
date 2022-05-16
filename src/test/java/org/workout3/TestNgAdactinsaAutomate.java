package org.workout3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class TestNgAdactinsaAutomate extends FrameworkBaseclass {
	
	@Parameters({"UserName","password","datepickin", "datepickout","firstname",
		"lastname","address","ccno","cvvno"})
	
	@org.testng.annotations.Test
	public void test1(String  s1,  String s2  , String s3, String s4, String s5
			,String s6,String s7, String s8, String s9) throws InterruptedException {
		
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue( driver.getCurrentUrl().contains("adactinhotelapp"),"verify url");
		WebElement textuser = idvalue("username");
		type(textuser, s1);
		WebElement textpass = idvalue("password");
		type(textpass, s2);
		s.assertEquals(textpass.getAttribute("value"),"12B3WP","verify password");
		WebElement loginbutton = idvalue("login");
		buttonclick(loginbutton);
		WebElement location = idvalue("location");
		selectbyindex(location, 4);
		WebElement hotels = idvalue("hotels");
		selectbyvalue(hotels, "Hotel Hervey");
		WebElement roomtype = idvalue("room_type");
		selectbyvisibletext(roomtype, "Double");
		WebElement roomnumber = idvalue("room_nos");
		selectbyindex(roomnumber, 2);
		WebElement datepickin = idvalue("datepick_in");
		type(datepickin, s3);
		WebElement datepickout = idvalue("datepick_out");
		type(datepickout, s4);
		WebElement adultsperroom = idvalue("adult_room");
		selectbyindex(adultsperroom, 3);
		WebElement childroom = idvalue("child_room");
		selectbyindex(childroom, 3);
		WebElement submitbtn = idvalue("Submit");
		buttonclick(submitbtn);
		WebElement radiobtn = idvalue("radiobutton_0");
		buttonclick(radiobtn);
		WebElement continuebtn = idvalue("continue");
		buttonclick(continuebtn);
		WebElement firstname = idvalue("first_name");
		type(firstname, s5);
		WebElement lastname = idvalue("last_name");
		type(lastname, s6);
		WebElement address = idvalue("address");
		type(address, s7);
		WebElement ccno = idvalue("cc_num");
		type(ccno, s8);
		WebElement cctype = idvalue("cc_type");
		selectbyvalue(cctype, "VISA");
		WebElement ccexpmonth = idvalue("cc_exp_month");
		selectbyindex(ccexpmonth, 6);
		WebElement expyr = idvalue("cc_exp_year");
		selectbyindex(expyr, 11);
		WebElement ccvno = idvalue("cc_cvv");
		type(ccvno, s9);
		WebElement booknowbtn = idvalue("book_now");
		buttonclick(booknowbtn);
		sleep(7000);
		WebElement orderno = xpathvalue("(//input[@type='text'])[16]");
		getAttribute(orderno, "value");
	
		
		//testng.xml file

//		   <test name="Test">
	//	   <parameter name="UserName" value="balagood123"></parameter>
	//
		
	//	<parameter name="password" value="12B3WP"></parameter>
		//   <parameter name="datepickin" value="24/04/2022"></parameter>
		  // <parameter name="datepickout" value="25/04/2022"></parameter>
		   //<parameter name="firstname" value="bala"></parameter>
		//   <parameter name="lastname" value="subramaniyam"></parameter>
		//   <parameter name="address" value="No.16,Solaiyappan street,old washermenpet chennai-21"></parameter>
		 //  <parameter name="ccno" value="2789 9999 0000 8987"></parameter>
		 //  <parameter name="cvvno" value="234"></parameter>
		   
		//    <classes>
		 //     <class name="org.workout3.TestNgAdactinsaAutomate"/>
		//    </classes>
		
	
		
	
	
	
	
	
	
	
	
	
	
	
		
	
	}
	

}
