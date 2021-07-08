package org.projects;

import java.util.Scanner;

public class Exception_Runtime {
	public static void main(String[] args) {
//arithmetic exception	
//	int a = 10;
//	System.out.println(a/2);             //will get value
//	System.out.println(a/0);            //error shows-infinity doesnt exists

//null pointer exception
//	String s = null;
//	int length = s.length();
//	System.out.println(length);        //error shows-null has no length
	
//input mismatch exception
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the value");
//	int n = sc.nextInt();
//	System.out.println(n);              //type any word-error shows-given value is int-accecpts only int
	
//array index out of bound exception
//	int a[] = new int[2];
//	a[1]=54;                            //will get value for a[0] and a[1]
//	a[2]=45;                           //error shows-cant add extra values
//	System.out.println(a[3]);         //error shows-cant print extra arrays 
	
//string index out of bound exception
//	String s = "Java";                   //index value is 0-3
//	char charAt = s.charAt(4);          //error shows-cant get values above the index value
//	System.out.println(charAt);
	
//number format exception
	String s = "456ab";     //error comes-cant add int and string      //type 456-below consoles 
	int a = 456;
//	to convert string to int use parseInt
	int s1 = Integer.parseInt(s);
//	System.out.println(s+a);             //console-456456
	System.out.println(s1+a);            //console-912
	
		
		
		
		
		
		
		
		
		
	}}