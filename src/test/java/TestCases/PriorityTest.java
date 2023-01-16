package TestCases;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase {

	LoginPage login = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test (priority = 3) 
	public void verifyTitleTest1()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test (priority = -343) 
	public void verifyTitleTest2()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test (priority = 4) 
	public void verifyTitleTest3()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test (priority = 1) 
	public void verifyTitleTest4()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(4000);
		driver.close();
	}
}