package org.projects;

import java.util.Scanner;

public class Scanner_Own_Task {
	
	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
	System.out.println("What is your Name?");
	String s = scan.next();
	System.out.println(s);
	
	System.out.println("What is your age?");
	int i = scan.nextInt();
	System.out.println(i);
	
scan.close();
	}
}
