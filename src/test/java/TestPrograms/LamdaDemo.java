package TestPrograms;

import java.util.HashMap;

import FunctionalInterfaces.InterfaceOne;

public class LamdaDemo {

	//static String name = "Prabhat" ;
	public static void main(String args[]) {
		
		InterfaceOne ione = 	(a,b) -> { 

			int  c=  a*b;  return c; }  ; 
		
		System.out.println(ione.m1(10, 5));
		
		
		
		HashMap<String, String> hm= new HashMap<String ,String>();
		
		
		hm.put("Name", "Rame");
		hm.put("Address", "Panvel");
		
		hm.put("Designation", "Assit. Manager");
		
		
		
		
		
	}
	
}
