package ParameterPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1
{
  @Test
  @ Parameters("Name")
  public void f(String name) 
  {
	  System.out.println("name is" +name);
	  
  }
}
