package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class test111 {
	
	
	@Test
	public void m()
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
