package Utility;

import java.io.File;
import java.lang.StackWalker.Option;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityMethod extends TestBase{

	public static void selectClass(WebElement ele, String option)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(option);
	}
	public static void captureScreenshot()
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Jp\\Eclipse-workspace\\TestingProject\\Screenshot\\1.jpeg");
		//FileHandler.copy()
	}

}
