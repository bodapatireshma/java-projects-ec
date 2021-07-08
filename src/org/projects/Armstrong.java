package org.projects;

public class Armstrong {

	public static void main(String[] args) {
		 
		int rem=0,ans=0;
				
		for (int i = 1; i < 1000; i++) {
			int t;
			t=i;
			
		while (t>0) {
			rem = t%10;
			ans = ans + (rem*rem*rem);
			t=t/10;
		}
			if (i==ans) {
				System.out.println("It is an Armstrong number" +ans);	
	
		}ans=0;
	}}}

