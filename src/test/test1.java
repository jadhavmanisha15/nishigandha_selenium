package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class test1 {
	
	@BeforeSuite
	public void m()
	{
		System.out.println("hiiiiiiiiiiiiiii");
	}
	
	
	
	
	@BeforeTest
	public void m2() 
	{
		System.out.println("Test.......");
	}

}
