package com.org.cab.Cab;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CabMainTest {

	WebDriver driver;
	CabMethod methodobject= new CabMethod();
	
		@BeforeTest
		public void chrome()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
            ChromeOptions options=new ChromeOptions();
  	      options.addArguments("disable-infobars");
  		  options.addArguments("--disable-extensions");
  		  Map<String, Object> prefs = new HashMap<String, Object>();
  		  prefs.put("credentials_enable_service", false);
  		  prefs.put("profile.password_manager_enabled", false);

  		  
  options.setExperimentalOption("prefs", prefs);
  		  driver=new ChromeDriver(options);
    	       System.out.println("TEST");
    	     
			
			

		}
		
		
		@Test(priority=1)
		public void login() throws Exception
		{
			methodobject.access(driver);
			System.out.println("Test Case:Login Check functionality - passed");
		    System.out.println("Actual result: User is able to login into Cab");
		    System.out.println("");
			
		}
		
		@Test(priority=2)
		public void viewchangelandmark() throws InterruptedException, IOException
		{
			methodobject.viewchangeLandmark(driver);
			System.out.println("Test Case:View Change Landmark Check functionality - passed");
		    System.out.println("Actual result: Change Landmark functionality is working fine");
		    System.out.println("");
		}
		
		@Test(priority=3)
		public void createOneTimeRequest() throws InterruptedException, IOException, AWTException
		{
			methodobject.oneTimeRequest(driver);
			System.out.println("Test Case:Create One Time Request functionality - passed");
		    System.out.println("Actual result: Create One Time Request functionality is working fine");
		    System.out.println("");
		}
		@Test(priority=4)
		public void viewrequest() throws InterruptedException
		{
			methodobject.viewrequest(driver);
			System.out.println("Test Case:View Request functionality - passed");
		    System.out.println("Actual result: View Request functionality is working fine");
		    System.out.println("");
				
		}
		/*
		@Test(priority=5)
		public void cancelRequest() throws InterruptedException
		{
			methodobject.cancel_Request(driver);
			System.out.println("Test Case:Cancel Request functionality - passed");
		    System.out.println("Actual result: Cancel Request functionality is working fine");
		    System.out.println("");
			
		}*/
		
		@Test(priority=6)
		public void viewUpdateMobileNumber() throws InterruptedException, IOException
		{
			methodobject.update_Mobile_No(driver);
			System.out.println("Test Case:Update Mobile number functionality - passed");
		    System.out.println("Actual result: Update Mobile number functionality is working fine");
		    System.out.println("");
		}
		@Test(priority=7)
		public void contacts()
		{
			methodobject.contactslink(driver);
			System.out.println("Test Case:Contacts functionality - passed");
		    System.out.println("Actual result: Case:Contacts functionality is working fine");
		    System.out.println("");
			
		}
		@Test(priority=10)
		public void spocaccess() throws Exception
		{
			driver.switchTo().defaultContent();
			CabLocators.logout(driver).click();
			methodobject.spocaccess(driver);
			System.out.println("Test Case:Spoc Login Check functionality - passed");
		    System.out.println("Actual result: Spoc User is able to login into Cab");
		    System.out.println("");
		}
		@Test(priority=11)
		public void spocviewchangelandmark() throws InterruptedException, IOException
		{
			methodobject.viewchangeLandmark(driver);
			System.out.println("Test Case:View Change Landmark Check functionality for SPOC_ID - passed");
		    System.out.println("Actual result: Change Landmark functionality for SPOC_ID is working fine");
		    System.out.println("");
		}
		
		@Test(priority=12)
		public void spoccreateOneTimeRequest() throws InterruptedException, IOException, AWTException
		{
			methodobject.oneTimeRequest(driver);
			System.out.println("Test Case:Create One Time Request functionality for SPOC_ID - passed");
		    System.out.println("Actual result: Create One Time Request functionality for SPOC_ID is working fine");
		    System.out.println("");
		}
		@Test(priority=13)
		public void spocviewrequest() throws InterruptedException
		{
			methodobject.viewrequest(driver);
			System.out.println("Test Case:View Request functionality for SPOC_ID - passed");
		    System.out.println("Actual result: View Request functionality for SPOC_ID is working fine");
		    System.out.println("");
		}
		
		@Test(priority=14)
		public void spoccancelRequest() throws InterruptedException
		{
			methodobject.cancel_Request(driver);
			System.out.println("Test Case:Cancel Request functionality for SPOC_ID - passed");
		    System.out.println("Actual result: Cancel Request functionality for SPOC_ID is working fine");
		    System.out.println("");
		}
		
		@Test(priority=15)
		public void spocviewUpdateMobileNumber() throws InterruptedException, IOException
		{
			methodobject.update_Mobile_No(driver);
			System.out.println("Test Case:Update Mobile number functionality for SPOC_ID - passed");
		    System.out.println("Actual result: Update Mobile number functionality for SPOC_ID is working fine");
		    System.out.println("");
		}
		
		@Test(priority=8)
		public void viewchangelocationapproval() throws Exception
		{
			methodobject.viewchangeLandmarkapproval(driver);
		}
		
		
		@Test(priority=9)
		public void viewchangelocationrejection() throws Exception
		{
			driver.switchTo().defaultContent();
			CabLocators.logout(driver).click();
			methodobject.accesstoreject(driver);
			methodobject.viewchangeLandmark(driver);
			Thread.sleep(1000);
			methodobject.viewchangeLandmarkrejection(driver);
			
		}
		
	/*	@Test(priority=16)
		public void createweeklyrosterrequest() throws IOException, InterruptedException, AWTException
		{
			methodobject.createweeklyroster(driver);
		}*/
	/*	
		@Test(priority=17)
		public void cancelrequest() throws Exception
		{
			methodobject.spocaccess(driver);
			methodobject.viewchangeLandmark(driver);
			methodobject.oneTimeRequest(driver);
			methodobject.viewrequest(driver);
			methodobject.cancel_Request(driver);
		}*/
}
