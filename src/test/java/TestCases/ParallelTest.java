package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	@Test
	public void Test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("www.saucedemo.com/");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void Test2() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.co.in/");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void Test3() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com/");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void Test4() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("www.rediff.com/");
		Thread.sleep(5000);
		driver.close();
	}
}