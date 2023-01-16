package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage login = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test (enabled = false)
	public void verifyLoginLogoTest()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled = true)
	public void verifyBotLogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
		Reporter.log("BotLogo = " + result);
	}
	
	@Test (enabled = true)
	public void verifyTitleTest()
	{
		String expTitle = "Swa g Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Title of web application = " + actTitle);
	}
	
	@Test
	public void loginToAppTest()
	{
		String expResult = "https://www.saucedemo.com/inventory.html";
		String actResult = login.loginToApp();
		Assert.assertEquals(expResult,actResult);
	}
	
	@Test (enabled = false)
	public void verifyLabelOfInventoryTest()
	{
		String expResult = "PRODUCTS";
		String actResult = login.verifyLabelOfInventory();
		Assert.assertEquals(expResult,actResult);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		//Thread.sleep(5000);
		driver.close();
	}
}