package hdcseledemo2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver;
		
		driver=	MyDriver99.getDriver("CRM");
		
		driver.get("http://demowebshop.tricentis.com");

		
		driver.findElements(By.tagName("Register"));
		
	}

}
