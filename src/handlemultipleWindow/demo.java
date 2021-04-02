package handlemultipleWindow;

import java.awt.Container;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class demo {
	
	
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[contains(text(),'Recruiters')]")).click();

		java.util.Set<String> s=driver.getWindowHandles();

		for (String s1 : s) {
            driver.switchTo().window(s1);
            
            System.out.println(driver.getTitle());
            //driver.close();

			if(driver.getTitle().equalsIgnoreCase("HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com"))
			{
				driver.findElement(By.xpath("//*[@id=\"browse\"]/li[1]/a")).click();
				break;
			}
			driver.close();

		}
		
		
		
		
		
		
		
		
		/*java.util.Set<String> s=driver.getWindowHandles();
		
		
		for (String s1 : s) {
			
			
			if(!s1.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(s1);
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);*/
	}

}
