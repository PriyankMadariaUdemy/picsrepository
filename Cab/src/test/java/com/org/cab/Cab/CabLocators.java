package com.org.cab.Cab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CabLocators {

	
	
	public static WebElement userId(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement uid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginId")));
    //WebElement uid=driver.findElement(By.id("loginId"));
        return uid;
    }
	public static WebElement password(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement pwd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    //WebElement pwd=driver.findElement(By.id("password"));
    return pwd;
    }
	public static WebElement signin(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement loginbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign In']")));
  //  WebElement loginbtn=driver.findElement(By.xpath("//input[@value='Sign In']"));
    return loginbtn;
    }
	
	
	public static WebElement viewchangelocation(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Viewchangelocation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View / Change Landmark")));
    //WebElement Viewchangelocation=driver.findElement(By.linkText("View / Change Landmark"));
    return Viewchangelocation;
    }

	public static WebElement vclselectlocation(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Vclselectlocation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='emplocationId']")));
   // WebElement Vclselectlocation=driver.findElement(By.xpath("//select[@id='emplocationId']"));
    return Vclselectlocation;
    }

	public static WebElement vclarea(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Vclarea=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='CabArea']")));
    //WebElement Vclarea=driver.findElement(By.xpath("//select[@id='CabArea']"));
    return Vclarea;
    }
	
	
	
	public static WebElement vcllandmark(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Vcllandmark=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='CabLandmark']")));
    //WebElement Vcllandmark=driver.findElement(By.xpath("//select[@id='CabLandmark']"));
    return Vcllandmark;
    }
	
	
	public static WebElement savedetails(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Savedetails=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='saveDetails']")));
   // WebElement Savedetails=driver.findElement(By.xpath("//input[@id='saveDetails']"));
    return Savedetails;
    }
	
	
	public static WebElement savepopup(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Savepopup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='popup_ok']")));
  //  WebElement Savepopup=driver.findElement(By.xpath("//input[@id='popup_ok']"));
    return Savepopup;
    }
	
	
	public static WebElement createweeklyroster(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Createweeklyroster=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='WeeklyRoaster']")));
   // WebElement Createweeklyroster=driver.findElement(By.xpath("//a[@id='WeeklyRoaster']"));
    return Createweeklyroster;
    }
	
	
	public static WebElement travelstartdate(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Travelstartdate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='startDate']")));
   // WebElement Travelstartdate=driver.findElement(By.xpath("//input[@id='startDate']"));
    return Travelstartdate;
    }
	
	
	
	
	
	
	
	
	
	//*[@id="rosterStep1Div"]/div[1]/p[2]/span/img
	//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[3]/td[6]/a
	
	//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[3]/td[6]/a
	
	public static WebElement date2jan(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Date2jan=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[6]/a")));
   // WebElement Date2jan=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[6]/a"));
    return Date2jan;
    }
	
	
	public static WebElement selectproject(WebDriver driver)
    {
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Selectproject=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='projAutoCom']")));
		
 //   WebElement Selectproject=driver.findElement(By.xpath("//input[@id='projAutoCom']"));
    return Selectproject;
    }
	
	
	public static WebElement nextbtn(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Nextbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='nextbt']")));
		//WebElement Nextbtn=driver.findElement(By.xpath("//input[@id='nextbt']"));
		return Nextbtn;
	}
	
	
	public static WebElement savebtn(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Savebtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input[@id='saveButtonforIT' and @value='Save Roster']")));
		//WebElement Savebtn=driver.findElement(By.xpath("input[@id='saveButtonforIT' and @value='Save Roster']"));
		return Savebtn;
	}
	
	public static WebElement OneTimeRequest(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Onetime=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='OneTimeRequest']")));
		//WebElement =driver.findElement(By.xpath("//a[@id='OneTimeRequest']"));
		return Onetime;
	}
	
	public static WebElement purposeOfTravel(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement purpose=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='purposeOfTravel']")));
		//WebElement purpose=driver.findElement(By.xpath("//select[@id='purposeOfTravel']"));
		Select selectobj=new Select(purpose);
		selectobj.selectByIndex(1);
		return purpose;
	}
	
	public static WebElement contactNumber(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement contact=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userContactNumber']")));
		
	//	WebElement contact=driver.findElement(By.xpath("//input[@id='userContactNumber']"));
		return contact;
	}
	
	public static WebElement submitOneTime(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement sub=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='saveButtonforIT'and @value='Submit']")));
		//WebElement sub=driver.findElement(By.xpath("//input[@id='saveButtonforIT'and @value='Submit']"));
		return sub;
	}
	
	public static WebElement cancelandContinue(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement CancelandContinue=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='closeAndContinue'and @value='Cancel and Continue']")));
		//WebElement CancelandContinue=driver.findElement(By.xpath("//input[@id='closeAndContinue'and @value='Cancel and Continue']"));
		return CancelandContinue;
	}
	
	
	public static WebElement succesok(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Succesok=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='popup_ok']")));
		//WebElement Succesok=driver.findElement(By.xpath("//input[@id='popup_ok']"));
		return Succesok;
	}

	public static WebElement viewrequestlink(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Viewrequest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Request")));
		//WebElement Viewrequest=driver.findElement(By.linkText("View Request"));
		return Viewrequest;
	}
	
	
	public static WebElement viewreqsearch(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Viewrequest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchButton'and @value='Search']")));
		//WebElement Viewrequest=driver.findElement(By.xpath("//input[@id='searchButton'and @value='Search']"));
		return Viewrequest;
	}
	
	
	
	public static WebElement viewreqapprove(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Viewreqapprove=wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Approved")));
		//WebElement Viewreqapprove=driver.findElement(By.partialLinkText("Approved"));
		return Viewreqapprove;
	}
	
	
	
	public static WebElement closereq(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement Closereq=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='closeID']")));
		//WebElement Closereq=driver.findElement(By.xpath("//input[@id='closeID']"));
		return Closereq;
	}
	
	public static WebElement oneTimeTravelDate(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement date=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='unScheduledTravelDate']")));
		//WebElement date=driver.findElement(By.xpath("//input[@id='unScheduledTravelDate']"));
		return date;
	}
	
	public static WebElement cancelReq(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cancel Request")));
	//	WebElement link=driver.findElement(By.linkText("Cancel Request"));
		return link;
	}
	
	public static WebElement cancelDate(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='startDate']")));
	//	WebElement link=driver.findElement(By.xpath("//input[@id='startDate']"));
		return link;
	}
	
	public static WebElement goNext(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Go Next")));
		return link;
	}
	
	public static WebElement cancelCheckBox(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(3000);
		WebDriverWait wait= new WebDriverWait (driver, 120);
         WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='employeeAndValueData']/tbody/tr/td/div/table/tbody/tr/td[2]/table/tbody/tr/td/input")));
        boolean status=link.isDisplayed();
         System.out.println("checkbox is "+status );
        boolean enablestatus=link.isEnabled();
        System.out.println("enable status is"+enablestatus);
		//WebElement link=driver.findElement(By.xpath("//table[@id='employeeInfo']/tbody/tr/td[2]/table/tbody/tr/td/input"));
      //*[@id="3376311"]
		return link;
	}
	
	public static WebElement cancelReqButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait= new WebDriverWait (driver, 90);
		WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cancelMyRequest']")));
		
		return link;
	}	
	
	
	public static WebElement goback(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Goback=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Go Back")));
		return Goback;
	}
	
	public static WebElement view_updateMobile(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement update=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View / Update Mobile Number")));
		return update;
	}
	
	public static WebElement contact_update(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement update=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='contactNO']")));
		return update;
	}
	
	public static WebElement viewchangemobilenosavebtn(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Viewchangemobilenosavebtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='saveDetails' and @value='Save']")));
		return Viewchangemobilenosavebtn;
	}
	public static WebElement contactslocator(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Contacts=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mainframeid']/aside/div/section/ul/li[2]/a/span")));
	return Contacts;
	}
	//*[@id="userTable"]/thead/tr/th[1]
	public static WebElement city(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement CITY=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='userTable']/thead/tr/th[1]")));
		return CITY;
		
	}
	public static WebElement locationcolumn(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement LOCATIONCOLUMN=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='userTable']/thead/tr/th[2]")));
		return LOCATIONCOLUMN;
	}
	
	public static WebElement email_id(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement EMAIL_ID=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='userTable']/thead/tr/th[3]")));
		return EMAIL_ID;
	}
	
	public static WebElement contact_column(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Contact_column=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='userTable']/thead/tr/th[4]")));
		return Contact_column;
	}
	
	public static WebElement logout(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement logout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainframeid']/aside/div/section/ul/li[3]/a/span")));
		return logout;
	}
	
	public static WebElement edit(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Edit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='editDetails']")));
		return Edit;
	}
	
	public static WebElement viewchangelocnewlocation(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Viewchangelocnewlocation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='newlocationId']")));
		return Viewchangelocnewlocation;
	}
	
	
	public static WebElement viewchangeeffectivedate(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Viewchangeeffectivedate=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='effectiveFromDate']")));
		return Viewchangeeffectivedate;
				
	}
	
	public static WebElement reason(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Reason=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='reason']")));
		return Reason;
	}
	
	public static WebElement approverid(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Approverid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='approverId']")));
		return Approverid;
	}
	
	
	public static WebElement newcabarea(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Newcabarea=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='newCabArea']")));
		return Newcabarea;
	}
	
	public static WebElement Newcablandmark(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement newcablandmark=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='newCabLandmark']")));
		return newcablandmark;
	}
	
	public static WebElement newlocationsavebtn(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Newlocationsavebtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='saveNewDetails']")));
		return Newlocationsavebtn;
	}
	
	public static WebElement lanmarkrequestapproval(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Lanmarkrequestapproval=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Landmark Request Approval")));
		return Lanmarkrequestapproval;
	}
	
	/*public static WebElement landmarkapprovaltitle(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Landmarkapprovaltitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Landmark Approval")));
		return Landmarkapprovaltitle;
	}*/
	
	public static WebElement landmarkapprovaltitle(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Landmarkapprovaltitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myAccordion']/h2/a")));
		return Landmarkapprovaltitle;
	}
	//*[@id="myAccordion"]/h2/a
	
	public static WebElement requestemployeeid(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Requestemployeeid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='EMPLOYEE_ID']")));
		return Requestemployeeid;
	}
	
	public static WebElement approvebtn(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Approvebtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Approve']")));
		return Approvebtn;
	}
	
	public static WebElement landmarkapprovedsuccessfuly(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement Landmarkapprovedsuccessfuly=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='jqi_state0_buttonOk']")));
		return Landmarkapprovedsuccessfuly;
	}
	
	public static WebElement rejectbtn(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 90);
		WebElement rejectbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Reject']")));
		return rejectbtn;
	}
	
	
	
	

	
	
	
	
}
