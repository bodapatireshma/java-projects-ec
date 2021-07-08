package org.projects;

import java.util.Scanner;

public class Armstrong_One {
	
	public static void main(String[] args) {
		 
		int rem=0,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for (int i = 1; i < 1000; i++) {
			int t;
			t=n;
			
		while (t>0) {
			rem = t%10;
			ans = ans + (rem*rem*rem);
			t=t/10;
		}
			if (i==ans) {
				System.out.println("It is an Armstrong number" +ans);	
			}ans=0;
	}sc.close();
	}
	}
