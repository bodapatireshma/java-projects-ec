package org.projects;

public class Variable_Types {
	
	static int a = 20;                       //static variable

	public static void add() {               //static method,local variable
		int a = 10;
		System.out.println(a);
		
   }public static void add1() {
	   System.out.println(a);
   
   }public static void main(String[] args) {
	   add();
	   add1();
	   System.out.println(a);
}	}