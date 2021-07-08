package org.projects;

public class Exception_Handling_Throws {
	//throw	
		private static void ageValid(int a) throws Exception {
		
			if (a>18) {
				throw new ArithmeticException("not valid");
				
			}else {
				System.out.println("not eligible");
			}	
			Thread.sleep(2000);                 //2000-2sec to print
			System.out.println("Done...");
			
		}public static void main(String[] args) throws Throwable { 
			ageValid(17);
			System.out.println("Done..");
			
		}
}
