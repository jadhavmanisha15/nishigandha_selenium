package dependanceOnMethod;

import org.testng.annotations.Test;

public class demo1 {
	
	
	@Test
	public void c() {
		System.out.println("c");
	}
	
	
	@Test(dependsOnMethods="z")
	public void m() 
	{
		System.out.println("m");
	}
	
	
	@Test
	public void z() {
		System.out.println("z");
	}
	
}
