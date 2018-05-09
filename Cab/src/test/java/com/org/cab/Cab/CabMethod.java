package com.org.cab.Cab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CabMethod {
	
	String newlocationapproverpwd="1";

	String Cabfile="D:\\Maddy\\2017\\CAB\\CAB Transport application.xlsx";
	
	
	 

		  public void getScreenshot(WebDriver driver, String name) throws Exception 
		        { 
		    	      String ScreenshotPath="D:\\Maddy\\2017\\CAB\\Screenshots\\";
		    		  TakesScreenshot ts=((TakesScreenshot)driver);
		    		  File source=ts.getScreenshotAs(OutputType.FILE);
		    		  FileUtils.copyFile(source, new File(ScreenshotPath+name+".png"));
		    		  System.out.println("Screenshot taken");    		  
		    	}
		    	    
		
	
	public void robotAccess(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void access(WebDriver driver) throws Exception
	{
		//String name=new Object(){}.getClass().getEnclosingMethod().getName();
		driver.get("http://10.51.104.60:8090/cabtransport/Login.htm");
		driver.manage().window().maximize();
		
		File file1 = new File(Cabfile);
		FileInputStream fis=new FileInputStream(file1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(1);
		String user_id=sh1.getRow(1).getCell(0).getStringCellValue();
		String password=sh1.getRow(1).getCell(1).getStringCellValue();
		
		CabLocators.userId(driver).sendKeys(user_id);
		CabLocators.password(driver).sendKeys(password);
		CabLocators.signin(driver).click();
	
		/*System.out.println("Test Case:Login Check functionality - passed");
	    System.out.println("Actual result: User is able to login into Cab");
	    System.out.println("");*/
		//Thread.sleep(1000);
		//this.getScreenshot(driver, name);
		

		
	}
	
	public void accesstoreject(WebDriver driver) throws Exception
	{
		driver.get("http://10.51.104.60:8090/cabtransport/Login.htm");
		driver.manage().window().maximize();
		
		File file1 = new File(Cabfile);
		FileInputStream fis=new FileInputStream(file1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(1);
		String user_id=sh1.getRow(3).getCell(0).getStringCellValue();
		String password=sh1.getRow(3).getCell(1).getStringCellValue();
		
		CabLocators.userId(driver).sendKeys(user_id);
		CabLocators.password(driver).sendKeys(password);
		CabLocators.signin(driver).click();
		

		
	}
	
	
	
	public void spocaccess(WebDriver driver) throws Exception
	{
		driver.get("http://10.51.104.60:8090/cabtransport/Login.htm");
		driver.manage().window().maximize();
		
		File file1 = new File(Cabfile);
		FileInputStream fis=new FileInputStream(file1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(1);
		String user_id=sh1.getRow(2).getCell(0).getStringCellValue();
		String password=sh1.getRow(1).getCell(1).getStringCellValue();
		
		CabLocators.userId(driver).sendKeys(user_id);
		CabLocators.password(driver).sendKeys(password);
		CabLocators.signin(driver).click();
		/*System.out.println("Test Case:Spoc Login Check functionality - passed");
	    System.out.println("Actual result: Spoc User is able to login into Cab");
	    System.out.println("");*/
		

		
	}
	
	public void viewchangeLandmark(WebDriver driver) throws InterruptedException, IOException
	{
		int i=1,j=0;
		CabLocators.viewchangelocation(driver).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cabMenu");
		Thread.sleep(2000);
		File file1 = new File(Cabfile);
		FileInputStream f=new FileInputStream(file1);
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet s=w.getSheetAt(2);
		String selectlocation=s.getRow(i).getCell(j).getStringCellValue();
		j++;
		String area=s.getRow(i).getCell(j).getStringCellValue();
		j++;
		String landmark=s.getRow(i).getCell(j).getStringCellValue();
		
		
		try{
		CabLocators.vclselectlocation(driver).sendKeys(selectlocation);
		Thread.sleep(2000);
		CabLocators.vclarea(driver).sendKeys(area);
		Thread.sleep(2000);
		CabLocators.vcllandmark(driver).sendKeys(landmark);
		CabLocators.savedetails(driver).click();
		CabLocators.savepopup(driver).click();
		}catch(Exception e){
			System.out.println("location details already saved");
		}
		/*System.out.println("Test Case:View Change Landmark Check functionality - passed");
	    System.out.println("Actual result: Change Landmark functionality is working fine");
	    System.out.println("");*/
	}
	
	public void createweeklyroster(WebDriver driver) throws IOException, InterruptedException, AWTException
	{
		int i=1,j=0;
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		CabLocators.createweeklyroster(driver).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cabMenu");
		Thread.sleep(2000);
		
		File file1 = new File(Cabfile);
		FileInputStream f=new FileInputStream(file1);
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet createweeklyroster=w.getSheetAt(3);
		
		j++;
		j++;
		String project=createweeklyroster.getRow(i).getCell(j).getStringCellValue();
		
			
			driver.findElement(By.xpath("//div[@id='rosterStep1Div']/div[1]/p[2]/span/img")).click();
			
			
			//selecting future date in Travel date
			
			DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
			Date date=new Date();
			String sysdate=dateformat.format(date);
			
			System.out.println("Current system date is "+sysdate);
			String currentdatenumb=sysdate.substring(3, 5);
			int currentdatenumbint=Integer.parseInt(currentdatenumb);
			System.out.println(currentdatenumb);
		int 	futuredatenumb=6+currentdatenumbint;
		System.out.println(futuredatenumb);
		String futuredatenumbstring=Integer.toString(futuredatenumb);
			
		try{
		if(futuredatenumb<29)
		{
			driver.findElement(By.linkText(futuredatenumbstring)).click();
		}
		else{
			 driver.findElement(By.linkText("8")).click();
		}
		}catch(Exception e){System.out.println("Travel date already selected");};
		
		
		
		
			
		Thread.sleep(4000);
		
		try{
		CabLocators.selectproject(driver).sendKeys(project);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		}catch(Exception e){System.out.println("project is already selected");}
		
		
		
		
		
		try{
		 WebElement AvailableArrivalTime=driver.findElement(By.xpath("//select[@id='cabArrTimeId']"));
		Select select=new Select(AvailableArrivalTime);
		select.selectByIndex(1);
		
		WebElement AvailableDropTime=driver.findElement(By.xpath("//select[@id='cabDeptTimeId']"));
		Select select2=new Select(AvailableDropTime);
		
		select2.selectByIndex(1);
		
	
		
		
		
		
	/*	
		WebElement AvailableArrivalTime=driver.findElement(By.xpath("//select[@id='cabArrTimeId']"));
		Select select=new Select(AvailableArrivalTime);
	int	 arrivesize =select.getOptions().size();
	
	WebElement AvailableDropTime=driver.findElement(By.xpath("//select[@id='cabDeptTimeId']"));
	Select select2=new Select(AvailableDropTime);
	
	
	int k=1;
	for (int p=1;p<arrivesize;p++)
	 {
		 select.selectByIndex(p);
			//String text=select2.getFirstSelectedOption().getText();
			//System.out.println("value of text is "+text);
			List <WebElement> allOptions=select2.getOptions();
			Object[] arr=allOptions.toArray();
			
				
			 //try{
				while ((arr[k])!="Select Time") {
					 select2.selectByIndex(k);
					 ;
					 break;
				}
			//}catch(Exception e)
			//{
				System.out.println("script hi nahi chal rha hai");;
			//}
	 }
	
	/*int k=1, p=1;
	List <WebElement> allOptions=select2.getOptions();
	Object[] arr=allOptions.toArray();
	while((arr[k])!="Select Time")
	//for (int p=1;p<arrivesize;p++)
	 {
		 select.selectByIndex(p);
			
			//List <WebElement> allOptions=select2.getOptions();
			//Object[] arr=allOptions.toArray();
		
			try{
				while ((arr[k])!="Select Time") {
					 select2.selectByIndex(k);
					 k++;
				}
			}catch(Exception e)
			{
				continue;
			}
			
	 }p++;
	
	
	
	
	
	
	
	
	
	
	
	/*List <WebElement> allOptions=select2.getOptions();
	Object[] arr=allOptions.toArray();
	int k=1;
	int p=1;
	while((arr[k])!="Select Time")
	 {
		 select.selectByIndex(p);
			 for(k=1; k<arr.length;k++) 
			 {
				
				try{ 
			       if ("Select Time"!=(arr[k])) {
				  select2.selectByIndex(k);
				  break;
			     } 
			    }
				
				catch(Exception e){continue;}
	     
			}
	}p++;
	
	*/
	
		
		try{
		WebElement  PurposeofTravel=driver.findElement(By.xpath("//select[@id='purposeOfTravel']"));
		Select select3=new Select(PurposeofTravel);
		select3.selectByIndex(1);}catch(Exception e){System.out.println("purposeOfTravelNA");}
		Thread.sleep(2000);
		
		CabLocators.nextbtn(driver).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cabMenu");
		Thread.sleep(5000);
		
		CabLocators.savebtn(driver).click();}catch(Exception e){System.out.println("");}
	 }
	
	
	
	public void oneTimeRequest(WebDriver driver) throws IOException, AWTException, InterruptedException
	{
		//String name=new Object(){}.getClass().getEnclosingMethod().getName();
	    driver.switchTo().defaultContent();
		CabLocators.OneTimeRequest(driver).click();
		
		
		driver.switchTo().frame("cabMenu");
		
		int i=1, j=0;
		File file1 = new File(Cabfile);
		FileInputStream f=new FileInputStream(file1);
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet createweeklyroster=w.getSheetAt(3);
		j=j+2;
		
		String project=createweeklyroster.getRow(i).getCell(j).getStringCellValue();
		Thread.sleep(4000);
		try{
			CabLocators.selectproject(driver).sendKeys(project);
			Thread.sleep(2000);
		this.robotAccess(driver);}catch(Exception e){System.out.println("Project already selected for create one request");}
		j++;
		String contactNo=createweeklyroster.getRow(i).getCell(j).getStringCellValue();
		
		try{		
		CabLocators.contactNumber(driver).sendKeys(contactNo);
		}catch(Exception e){System.out.println("contact number not needed");}
		try{
		CabLocators.purposeOfTravel(driver);
		//this.getScreenshot(driver, name);
		}catch(Exception e){System.out.println("purpose of travel already selected");}
		
		CabLocators.submitOneTime(driver).click();
		try
		{CabLocators.succesok(driver).click();
			//Alert alertobject=driver.switchTo().alert();
		//alertobject.accept();
		}catch(Exception e){System.out.println("no successok pop up");}
		 
	//Thread.sleep(3000);
		try{
		//this.getScreenshot(driver, name);
		CabLocators.cancelandContinue(driver).click();
		Thread.sleep(2000);
	//Alert alertobject=driver.switchTo().alert();
	//alertobject.accept();
		
	CabLocators.succesok(driver).click();}catch(Exception e){System.out.println("no cancel and continue btn needed");};
	/*System.out.println("Test Case:Create One Time Request functionality - passed");
    System.out.println("Actual result: Create One Time Request functionality is working fine");
    System.out.println("");*/
		
	}
	
	public void viewrequest(WebDriver driver) throws InterruptedException
	{
		driver.switchTo().defaultContent();
		CabLocators.viewrequestlink(driver).click();
		
		driver.switchTo().frame("cabMenu");
		
		Thread.sleep(2000);
		CabLocators.viewreqsearch(driver).click();
		CabLocators.viewreqapprove(driver).click();
		Thread.sleep(2000);
		CabLocators.closereq(driver).click();
		/*System.out.println("Test Case:View Request functionality - passed");
	    System.out.println("Actual result: View Request functionality is working fine");
	    System.out.println("");*/
			
	}
		
	
	
	public void cancel_Request(WebDriver driver) throws InterruptedException
	{
		
		DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
		Date date=new Date();
		String sysdate=dateformat.format(date);
		
		System.out.println("Current system date is "+sysdate);
		
		driver.switchTo().defaultContent();
		CabLocators.cancelReq(driver).click();
		driver.switchTo().frame("cabMenu");
		Thread.sleep(1000);
		CabLocators.cancelDate(driver).sendKeys(sysdate);
		CabLocators.goNext(driver).click();
		try{
			WebDriverWait wait= new WebDriverWait (driver, 120);
	         WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='employeeAndValueData']/tbody/tr/td/div/table/tbody/tr/td[2]/table/tbody/tr/td/input")));
	         JavascriptExecutor js = (JavascriptExecutor)driver;
	         js.executeScript("arguments[1].click();", link);
		}catch(Exception e){System.out.print("checkbox not present");};
	

		//CabLocators.goNext(driver).click();
		//Thread.sleep(2000);
	
		/*System.out.println("Test Case:Cancel Request functionality - passed");
	    System.out.println("Actual result: Cancel Request functionality is working fine");
	    System.out.println("");*/
		
		
	}
	
	
	public void update_Mobile_No(WebDriver driver) throws IOException
	{
		int j=0, i=1;
		driver.switchTo().defaultContent();
		CabLocators.view_updateMobile(driver).click();
		driver.switchTo().frame("cabMenu");
		CabLocators.contact_update(driver).clear();
		File file1 = new File(Cabfile);
		FileInputStream f=new FileInputStream(file1);
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet createweeklyroster=w.getSheetAt(3);
		j=j+3;
		String contactNo=createweeklyroster.getRow(i).getCell(j).getStringCellValue();
		CabLocators.contact_update(driver).sendKeys(contactNo);
		CabLocators.viewchangemobilenosavebtn(driver).click();
		
		CabLocators.succesok(driver).click();
		
		/*System.out.println("Test Case:Update Mobile number functionality - passed");
	    System.out.println("Actual result: Update Mobile number functionality is working fine");
	    System.out.println("");*/
		
	}
	
	public void contactslink(WebDriver driver)
	{
		driver.switchTo().defaultContent();
		CabLocators.contactslocator(driver).click();
		driver.switchTo().frame("cabMenu");
		boolean citystatus=CabLocators.city(driver).isDisplayed();
		//System.out.println("city status is"+citystatus);
		if(citystatus==true){
			System.out.println("City column is present");
		}else{System.out.println("Test Case:Contacts functionality - failed");
	    }
		boolean locationstatus=CabLocators.locationcolumn(driver).isDisplayed();
		//System.out.println("locationcolumn status is"+locationstatus);
		if(locationstatus==true){
			System.out.println("location column is present");
		}else{System.out.println("Test Case:Contacts functionality - failed");
	    }
		boolean email_idstatus=CabLocators.email_id(driver).isDisplayed();
		//System.out.println("email_id status is"+email_idstatus);
		if(email_idstatus==true){
			System.out.println("email_idstatus column is present");
		}else{System.out.println("Test Case:Contacts functionality - failed");
	    }
		boolean contactcolumnstatus=CabLocators.contact_column(driver).isDisplayed();
		//System.out.println("contactcolumnstatus status is"+contactcolumnstatus);
		if(contactcolumnstatus==true){
			System.out.println("contactcolumnstatus column is present");
		}else{System.out.println("Test Case:Contacts functionality - failed");
	    }
		
	}
	public void viewchangeLandmarkapproval(WebDriver driver) throws Exception
	{
		driver.switchTo().defaultContent();
		CabLocators.viewchangelocation(driver).click();
		driver.switchTo().frame("cabMenu");
		CabLocators.edit(driver).click();
		CabLocators.viewchangelocnewlocation(driver).sendKeys("Bangalore-PSN");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		CabLocators.viewchangeeffectivedate(driver).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		CabLocators.reason(driver).sendKeys("relocation");
		String approverid=CabLocators.approverid(driver).getText();
		System.out.println("approverid is "+approverid);
		
		//New Landmark
		CabLocators.newcabarea(driver).click();
		CabLocators.newcabarea(driver).sendKeys("Agara");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		CabLocators.Newcablandmark(driver).click();
		CabLocators.Newcablandmark(driver).sendKeys("Agara");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		CabLocators.newlocationsavebtn(driver).click();
		CabLocators.succesok(driver).click();
		
		driver.switchTo().defaultContent();
		CabLocators.logout(driver).click();
		
		driver.get("http://10.51.104.60:8090/cabtransport/Login.htm");
		driver.manage().window().maximize();
		
		CabLocators.userId(driver).sendKeys(approverid);
		CabLocators.password(driver).sendKeys(newlocationapproverpwd);
		CabLocators.signin(driver).click();
		this.locationapprove(driver);
		
		/*System.out.println("Test Case:New Location approver functionality - passed");
	    System.out.println("Actual result: Useris able to add new location and getting approved successfuly");
	    System.out.println("");*/
		
		
		
		
		
		
		
		
	}
	
	public void viewchangeLandmarkrejection(WebDriver driver) throws Exception
	{
		driver.switchTo().defaultContent();
		CabLocators.viewchangelocation(driver).click();
		driver.switchTo().frame("cabMenu");
		CabLocators.edit(driver).click();
		CabLocators.viewchangelocnewlocation(driver).sendKeys("Bangalore-PSN");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		CabLocators.viewchangeeffectivedate(driver).click();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		CabLocators.reason(driver).sendKeys("relocation");
		String approverid=CabLocators.approverid(driver).getText();
		System.out.println("approverid is "+approverid);
		
		//New Landmark
		CabLocators.newcabarea(driver).click();
		CabLocators.newcabarea(driver).sendKeys("Agara");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		CabLocators.Newcablandmark(driver).click();
		CabLocators.Newcablandmark(driver).sendKeys("Agara");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		CabLocators.newlocationsavebtn(driver).click();
		CabLocators.succesok(driver).click();
		
		driver.switchTo().defaultContent();
		CabLocators.logout(driver).click();
		
		driver.get("http://10.51.104.60:8090/cabtransport/Login.htm");
		driver.manage().window().maximize();
		
		CabLocators.userId(driver).sendKeys(approverid);
		CabLocators.password(driver).sendKeys(newlocationapproverpwd);
		CabLocators.signin(driver).click();
		this.locationrejection(driver);
		
		/*System.out.println("Test Case:New Location rejection functionality - passed");
	    System.out.println("Actual result: Useris able to add new location and getting rejected successfuly");
	    System.out.println("");*/
		
		
		
		
		
		
		
		
	}
	
	
	
	public void locationapprove(WebDriver driver) throws Exception
	{
		//String name=new Object(){}.getClass().getEnclosingMethod().getName();
		CabLocators.lanmarkrequestapproval(driver).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cabMenu");
	   // this.getScreenshot(driver, name);
		Thread.sleep(2000);
		
		CabLocators.landmarkapprovaltitle(driver).click();
		Thread.sleep(2000);
		CabLocators.requestemployeeid(driver).click();
		Thread.sleep(2000);
		CabLocators.approvebtn(driver).click();
		Thread.sleep(2000);
		CabLocators.landmarkapprovedsuccessfuly(driver).click();
	}
	public void locationrejection(WebDriver driver) throws Exception
	{
		//String name=new Object(){}.getClass().getEnclosingMethod().getName();
		CabLocators.lanmarkrequestapproval(driver).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cabMenu");
		//this.getScreenshot(driver, name);
		Thread.sleep(2000);
		
		CabLocators.landmarkapprovaltitle(driver).click();
		Thread.sleep(2000);
		CabLocators.requestemployeeid(driver).click();
		Thread.sleep(2000);
		CabLocators.rejectbtn(driver).click();
		Thread.sleep(2000);
		CabLocators.landmarkapprovedsuccessfuly(driver).click();
	}
	
	
	
	}
	
		
		
		

		
		

	
	 

