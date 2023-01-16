package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {

LoginPage login = new LoginPage();
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test  (groups = "Sanity")
	public void Test1()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test  (groups = {"Smoke","Regression"})
	public void Test2()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test (groups = "Smoke")
	public void Test3()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test  (groups = {"Sanity","Regression"})
	public void Test4()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(4000);
		driver.close();
	}
}