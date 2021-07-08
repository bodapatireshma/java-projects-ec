package org.projects;

public class Constructor_Type {
	
	public Constructor_Type() {                              //default constructor
		System.out.println("Constructor...");
	
	}public Constructor_Type(int a) {                      //parameterized constructor
		System.out.println(a);
		
	}public Constructor_Type(String a){
		System.out.println(a);
	
	}
	public static void main(String[] args) {
		Constructor_Type ct = new Constructor_Type();
		Constructor_Type ct1 = new Constructor_Type(50);
		Constructor_Type ct2 = new Constructor_Type("Constructor......");
	}
		
	}