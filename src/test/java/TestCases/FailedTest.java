package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class FailedTest extends TestBase {

LoginPage login = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test 
	public void Test1()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test 
	public void Test2()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, false);
	}
	
	@Test
	public void Test3()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, false);
	}
	
	@Test 
	public void Test4()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(1000);
		driver.close();
	}
}
