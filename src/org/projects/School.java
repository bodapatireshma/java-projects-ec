package org.projects;

public class School extends Student {
	
	@Override
	public void stuDetails(int Id) {
		super.stuDetails(Id);
	}@Override
	public void stuDetails(String name, char initial) {
		super.stuDetails(name, initial);
	}@Override
	public void stuDetails(Byte rollno) {
		super.stuDetails(rollno);
		
	}public static void main(String[] args) {
		School sc = new School();
		sc.stuDetails(12345);
		sc.stuDetails("John", 'A');
		sc.stuDetails(27);
	}
	

}
