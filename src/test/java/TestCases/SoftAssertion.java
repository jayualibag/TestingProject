package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;

public class SoftAssertion extends TestBase {

LoginPage login = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test
	public void verifyLoginLogoTest()
	{
		System.out.println("Execution started");
		SoftAssert soft = new SoftAssert();
		boolean result = login.verifyLoginLogo();
		soft.assertEquals(result,false);
		System.out.println("Execution ended");
		soft.assertAll();
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}
}
