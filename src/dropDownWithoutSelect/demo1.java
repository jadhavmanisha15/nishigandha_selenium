package dropDownWithoutSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
	
	
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php");
		driver.findElement(By.id("username")).sendKeys("iamaniket007");
		driver.findElement(By.id("password")).sendKeys("aniket123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"location\"]/option[2]")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='location']/option"));
		System.out.println(list.size());
		
		
		for (WebElement web : list) 
		{
			
			if(web.getText().equalsIgnoreCase("London"))
			{
				web.click();
			}
			
		}
		
	}


}
