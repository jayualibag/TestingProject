package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import io.netty.util.Timeout;

public class invocationCount extends TestBase {

LoginPage login = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test (invocationCount = 3,enabled = false)
	public void verifyTitleTest()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test (timeOut = 20)
	public void verifyTitleTest1()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}
}