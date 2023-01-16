package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadData {

	public static String readPropertyFile(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Jp\\Eclipse-workspace\\TestingProject\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(value);
	}
	
	
}
