package extendreportTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Listeners.IMethod1;
import Listeners.Itest1;

public class extentreporttest 
{
	
	WebDriver driver;
	
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 Itest1.test.log(LogStatus.PASS, "Initialization of Browser");
	
	}
	
	@Test
	public void test2() {
		driver.get("https://accounts.google.com/login");
		Itest1.test.log(LogStatus.PASS, "Open Gmail ");
		
		driver.close();
		Itest1.test.log(LogStatus.PASS, "Close Gmail ");
		
	}
	

}
