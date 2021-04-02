package NestedClass;

public class nestedclass {
	
	private int s=9;
	 static int h=3;
	
	// Static nested classes are not inner classes. 
	
	static class a{

		int a=9;
		
		
		
	}
	
	
	
	class b
	{
		
	}
	public static void main(String[] args) {
		
		
		/* Static nested classes can be instantiated without instance of outer class.
		A static nested doesnot have access to instance variables and non static methods of outer class.
		*/
		
		nestedclass.a j=new nestedclass.a();
	System.out.println(j.a);

	
		
		
	}
	

}
