package org.projects;

public class Loan extends Bank{
	
	@Override
	public void goldloan() {
		System.out.println("gold loan is 12%");
		}
	public static void main(String[] args) {
		Loan l = new Loan();
		l.vehicleloan();
		l.personalloan();
		l.goldloan();
	}
}
