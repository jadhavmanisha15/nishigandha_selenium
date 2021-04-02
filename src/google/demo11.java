package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo11 {
	
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		/*driver.findElement(By.cssSelector("input#identifierId")).sendKeys("sawantnishigandha10@gmail.com");;
		driver.findElement(By.cssSelector("div.VfPpkd-RLmnJb")).click();
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Sign in – Google accounts");*/
		
		
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("java");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		
		/*List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());*/
		
		//driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']")).click();
	}

}
