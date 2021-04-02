package Select1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
	

	@Test
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?rs=3&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjA3MDc0MzQ0LCJjYWxsc2l0ZV9pZCI6NzMxOTQxNDIwNzMyOTEwfQ%3D%3D");

		/*List<WebElement> list=driver.findElements(By.cssSelector("#day"));


	System.out.println(list.get(0).getText());
		 */


		WebElement ele=driver.findElement(By.cssSelector("#day"));

		Select s=new Select(ele);
		s.selectByValue("3");
		//Thread.sleep(5000);
		
        List<WebElement> list=s.getOptions();
        for (WebElement web : list) {
        	System.out.println(web.getText());
			
		}
       
	}

}
