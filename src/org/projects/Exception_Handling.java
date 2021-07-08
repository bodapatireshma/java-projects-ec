package org.projects;

public class Exception_Handling {
	
	public static void main(String[] args) {
//try and catch 
		try {
			int a = 10;
			System.out.println(a/0);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}System.out.println("Rest of the code");
	
//finally	
		try {
			int a = 10;
			System.out.println(a/0);
		}catch (Exception e) {
			int b = 10/0;
		}finally{
			System.out.println("Finally block always execute");
			System.out.println("Rest of the code");
		}
		}
}