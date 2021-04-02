package itestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Test1.class)
public class demo {
	
	
	
	WebDriver driver=null;
	
	
	
	@BeforeClass
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		System.out.println("oooooooo");
	}
	
	
	@Test
	public void m2()
	{
		driver.findElement(By.id("email")).sendKeys("hfsdgjh");
	}
	
	@Test
	public void m3()
	{
		driver.findElement(By.id("jhtghg")).sendKeys("gf");
	}
	
	
}
