package hdcseledemo2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver99 {

	public static WebDriver getDriver (String Brw) 
	{
		if (Brw.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver();
		}
	
		if (Brw.equals("IEEE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
	
		if (Brw.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			return new FirefoxDriver ();
		}
		else
		{
			return null;
		}
	}

}
