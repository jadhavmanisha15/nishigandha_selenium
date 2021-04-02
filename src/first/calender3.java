package first;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class calender3 {

	@Test

    public void dateTimePicker() throws ParseException{

		
		
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        
       /* WebElement prev=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
    //prev.click();
        WebElement Next=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        //Next.click();
*/        //String month="May";
           int year=1998;
        String date="May 2019";
        
      String title=  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        
        System.out.println(title);
       String[] sp= title.split(" ");
       
       int s=Integer.parseInt(sp[1]);
       System.out.println(s);
       if(year<=s)
       {
    	   while (!date.equalsIgnoreCase(title)) 
    	   {
    		   WebElement prev=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
    		    //prev.click();
    		   prev.click();
    		    title=  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
    	        
		}
       }
       else
       {
    	   while (!date.equalsIgnoreCase(title)) 
    	   {
    		   WebElement Next=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
    	        //Next.click();
    		   Next.click();
    		    title=  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
    	        
			//break;
		}
    	   
    	   
    	   
       }
       driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();
       driver.close();
        
        }
		
	
	
	
	
}
