package Pages;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Object Repository
	
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usernameTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//span[@class='title']") private WebElement productLabel;
	
	//Constructor
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();
	}
	
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public String loginToApp() 
	{
		usernameTextbox.sendKeys("standard_user");
		passwordTextbox.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String verifyLabelOfInventory()
	{
		loginToApp();
		return productLabel.getText();
	}
}