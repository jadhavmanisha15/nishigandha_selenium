package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class first1 {
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://accounts.google.com");
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("sawantnishigandha10@gmail.com");;
		driver.findElement(By.cssSelector("div.VfPpkd-RLmnJb")).click();
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Sign in – Google accounts");
	}

}
