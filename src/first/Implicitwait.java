package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicitwait {
	
	WebDriver driver;
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 
	        driver.get("http://www.learn-automation.com");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        }
	@Test
	public void m2()
	{
		
        // Specify implicit wait of 30 seconds                                   
       

      // No login id is present on Webpage so this will fail our script.
        driver.findElement(By.id("login")).sendKeys(" Selenium Webdriver");

	}

}
