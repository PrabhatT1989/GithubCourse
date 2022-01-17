package FunctionalInterfaces;

import org.testng.annotations.Test;

@FunctionalInterface
public interface InterfaceOne {
	
	String name ="Prabhat" ;
	public int m1(int a, int b);   // single abstract method
	
	
	  @Test
	default void  test1() 
	{
		System.out.println("Default  method test 1");
	}
	
	
	
	@Test
	default  void  test2() 
	{
		System.out.println("Default  method test 2");
	}
	
	
	static void  staticMethod1()
	{
		System.out.println("Static method 1");
	}
	
	
	static void  staticMethod2()
	{
		System.out.println("Static method 2");
	}

}
