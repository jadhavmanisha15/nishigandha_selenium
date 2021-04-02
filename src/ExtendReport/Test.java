package ExtendReport;

import org.testng.Assert;
import org.testng.annotations.Listeners;



@Listeners(Extend.class)
public class Test {
	
	@org.testng.annotations.Test
	  public void testMethodOne() {
	     Assert.assertTrue(true);
	     
	     System.out.println("Hi");
	  }
	


}
