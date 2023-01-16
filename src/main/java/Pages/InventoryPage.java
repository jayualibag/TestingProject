package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class InventoryPage extends TestBase {
	
	@FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo;
	@FindBy(xpath = "//img[@alt='Swag Bot Footer']") private WebElement swagBotLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortProductDropdown;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement bagpack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLight;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleeceJacket;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement productCount;
	
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed(); 
	}
	
	public boolean verifySwagBotLogo()
	{
		return swagBotLogo.isDisplayed();
	}
	
	public String addProduct() throws Exception
	{
		Select s = new Select(sortProductDropdown);
		s.selectByVisibleText("Name (A to Z)");
		Thread.sleep(5000);

		bagpack.click();
		bikeLight.click();
		fleeceJacket.click();
		
		Thread.sleep(5000);
		productCount.click();
		return productCount.getText();
	}
}