package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {

	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
		Thread.sleep(2000);
	}
	
	@Test (enabled = true)
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result,true);
		Reporter.log("Verify Peek logo = " + result);
	}
	
	@Test (enabled = true)
	public void verifySwagBotLogoTest()
	{
		boolean result = invent.verifySwagBotLogo();
		Assert.assertEquals(result,true);
	}
	
	@Test
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		Assert.assertEquals(result, "5");
		Reporter.log("Total product added = " + result);
	}	
	
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		driver.close();
	}
}
 