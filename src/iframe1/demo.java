package iframe1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	
	
	
	
	@Test
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		 Alert a=driver.switchTo().alert();
		 a.accept();*/
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		 Alert a=driver.switchTo().alert();
		
		 System.out.println( a.getText());
		 a.sendKeys("fdhgfghf");
		 Thread.sleep(5000);
		 a.accept();
		 
		 
		
		
	}

}
