package org.projects;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println(s);
		
		System.out.println("Enter an Integer");
		int n = sc.nextInt();
		System.out.println(n);

		System.out.println("Enter a String");
		String s1 = sc.next();
		System.out.println(s1);

	sc.close();
	}
}
