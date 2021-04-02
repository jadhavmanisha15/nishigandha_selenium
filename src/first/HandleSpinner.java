package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleSpinner {
	
	
	WebDriver driver;
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 
	        driver.get("file:///C:/Users/Hp/Desktop/Spinner.html");
	       driver.findElement(By.cssSelector("#showspinner")).click();;
	       WebElement spin=driver.findElement(By.cssSelector("#myDiv"));
	       HandleSpinner.waitTillSpinnerDisable( driver, spin);
	       driver.findElement(By.xpath("//th[contains(text(),'Lastname')]"));
	       driver.close();
	       
	        }
public static boolean waitTillSpinnerDisable(WebDriver driver, WebElement sp)
	 {
	WebDriverWait wt=new WebDriverWait(driver, 20);
	wt.until(ExpectedConditions.visibilityOf(sp));
	
	
	
	return sp.isDisplayed();
		
	 }

}
