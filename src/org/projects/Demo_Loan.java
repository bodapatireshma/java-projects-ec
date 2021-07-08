package org.projects;

public class Demo_Loan extends Demo_Bank {
	
	@Override
	public void goldLoan() {
		System.out.println("gold loan");
	}
	public static void main(String[] args) {
		Demo_Loan l = new Demo_Loan();
		l.bikeLoan();
		l.goldLoan();
	}
}
