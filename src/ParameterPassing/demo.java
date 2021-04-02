package ParameterPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {

	@Parameters("myName")
	@Test
	public void m(int name )
	{
		System.out.println("hiii"+name);
	}
}
