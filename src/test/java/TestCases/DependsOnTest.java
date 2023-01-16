package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependsOnTest extends TestBase {

	LoginPage login = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test
	public void verifyTitleTest()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test(dependsOnMethods = "verifyTitleTest")
	public void loginToAppTest()
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp();
		Assert.assertEquals(expResult,actResult);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		driver.close();
	}
}
