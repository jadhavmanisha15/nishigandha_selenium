package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextOnTextbox {
	
	
	
	WebDriver driver;
	@Test
	public void m1()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement s=driver.findElement(By.cssSelector("#email"));
	s.sendKeys("hgfhgdsjkh");
	String f=s.getAttribute("value");
	System.out.println(f);
	String a=s.getAttribute("placeholder");
	System.out.println(a);
	
	
	
	}
	
	
	
	
	
	

}
