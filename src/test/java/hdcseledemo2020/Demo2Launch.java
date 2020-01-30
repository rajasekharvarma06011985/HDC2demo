package hdcseledemo2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver=	MyDriver99.getDriver("CRM");
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(WebDriveReference,TimeOut);
		
		MyDriver99.getDriver("IEEE");
		driver.get("http://newtours.demoaut.com");
		MyDriver99.getDriver("CRM");

	}

}
