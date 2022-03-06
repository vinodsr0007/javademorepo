package StepDefinition;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.cuctomerpageobject;
import PageObject.loginpage;

public class Baseclass{
	
	public WebDriver driver;  // we initialise this driver variable in steps.java
	public  loginpage lp;     // variable used for creating object of loginpageobject
	public cuctomerpageobject Addcust;   // variable used for creating object of cuctomerpageobject
	public static Logger logger;     // 
	
	
	//created for generating random string for unique class//
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return  (generatedString1);
		
	}

}
