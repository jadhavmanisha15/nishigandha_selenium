package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticTable {

	
	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Hp\\Desktop\\webtable.html");
		
		
		/*List<WebElement> list=driver.findElements(By.xpath("//tbody/tr"));
		
		for (WebElement tr : list) {
			
			List<WebElement> td=tr.findElements(By.xpath("//tbody/tr/td"));
			
			for (WebElement td1 : td) {
				
				System.out.print(td1.getText()+" ");
				
			}
			System.out.println();
			break;
		}*/
		
		/*List<WebElement> list=driver.findElements(By.tagName("tr"));
		for (WebElement tr : list) {
			List<WebElement> td1=tr.findElements(By.tagName("td"));
			for (WebElement td : td1) {
				
				System.out.print(td.getText()+" ");
				
			}
			System.out.println();
		}*/
		
		
		List<WebElement> list=driver.findElements(By.tagName("tr"));
		for (WebElement tr : list) {
			
			
			System.out.println(tr.getText());
					}
		
		
		
		
		
		//driver.findElement(by.)
		
		
		
		
		
	}
}
