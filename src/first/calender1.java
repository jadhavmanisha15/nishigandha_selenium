package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
        // click on date picker so that we can get the calendar in view 
driver.findElement(By.id("datepicker")).click();
	
        // this will find all matching nodes in calendar		
List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));


        // now we will iterate all values and will capture the text. We will select when date is 28
for(WebElement ele:allDates)
{
	
	String date=ele.getText();
	System.out.println(date);
                // once date is 28 then click and break
	if(date.equalsIgnoreCase("28"))
	{
		ele.click();
		break;
	}
	
}


}


}