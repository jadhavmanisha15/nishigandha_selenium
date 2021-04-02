package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender4 {
	
	
	@Test

    public void dateTimePicker() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.path2usa.com/travel-companions");
       
        driver.findElement(By.cssSelector("#travel_date")).click();
        
       //driver.findElement(By.cssSelector(".active.day")).click();
        
        
        String actual="November 2021";
        
        String s=driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/child::thead/child::tr[1]/child::th[2]")).getText();
        
       // System.out.println(s);
        while(!actual.equalsIgnoreCase(s))
        {
        	driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/child::thead/child::tr[1]/child::th[3]")).click();
        	s=driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/child::thead/child::tr[1]/child::th[2]")).getText();
        }
        
        String acday="1";
        
        List<WebElement> days=driver.findElements(By.xpath("//div[@class='datepicker-days']/child::table/child::tbody"));
        int l=days.size();
       for (int j=0;j<l;j++) {
    	   
    	
    	 WebElement web = null;
		String day=web.getText();
    	 String[] sp=day.split(" ");
    	 System.out.println(day);
    	 for(int i=0;i<sp.length;i++)
    	 {
    		 System.out.println(sp[i]);
		if(acday.equalsIgnoreCase(sp.toString())) {
			
			driver.findElements(By.xpath("//div[@class='datepicker-days']/child::table/child::tbody/child::tr[1]/child::td[1]"));
    		   
    	   }
    	 }
	}
        
        
        
        
      // driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/child::tbody/child::tr[6]/child::td[3]")).click();
       // driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/child::tbody/child::tr[1]/child::td[2]")).click();
      Thread.sleep(5000);
      // driver.close();
	
	}
}
