package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreenshotOfFailedTC extends TestBase {

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
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test 
	public void verifyBotLogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test 
	public void verifyTitleTest()
	{
		String expTitle = "qSwag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())
		{
			UtilityMethod.captureScreenshot();
		}
		Thread.sleep(1000);
		driver.close();
	}
}