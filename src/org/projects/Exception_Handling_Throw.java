package org.projects;

public class Exception_Handling_Throw {
//throw	
	private static void ageValid(int a) {
	
		if (a>18) {
			throw new ArithmeticException("not valid");
			
		}else {
			System.out.println("not eligible");
//		throw new ArithmeticException("not valid");
		}	
		System.out.println("Done...");
		
	}public static void main(String[] args) {
		ageValid(19);
		System.out.println("Done..");
		
	}
}