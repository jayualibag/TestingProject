package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class AssertKeyword extends TestBase{

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
		System.out.println("This is Title test case");
		Reporter.log("Title of web application = " + actTitle);
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(5000);
		driver.close();
	}
}
