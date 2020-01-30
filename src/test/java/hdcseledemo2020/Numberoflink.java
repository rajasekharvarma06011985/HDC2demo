package hdcseledemo2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Numberoflink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver;
		
		driver=	MyDriver99.getDriver("CRM");
		
		driver.get("http://demowebshop.tricentis.com");
		List<WebElement> T_lnk= driver.findElements(By.tagName("a"));
		int N_lnks = T_lnk.size();
		System.out.println("the total no of link available are :"+N_lnks);
		for (int i= 0; i<=N_lnks;i++)
		{
			String L_text = T_lnk.get(i).getText();
		System.out.println(i +"th link is :" +L_text);
			}
		}

}
