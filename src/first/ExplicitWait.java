package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	WebDriver driver;
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 
			driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219764%7Ce%7Cfacebook%20create%20new%20account%7C&placement=&creative=355887219764&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066386563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311595197486%26loc_physical_ms%3D9062118%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIldXh19zW7AIVCiUrCh2pjQMgEAAYASAAEgKARvD_BwE");

	}
	@Test
	public void m6()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		/*WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
 */
		
		wait.until(ExpectedConditions.alertIsPresent());
	}

}