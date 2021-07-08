package org.projects;

public class Student {
	
	public void stuDetails(int Id) {
		System.out.println("Student Id is "+Id);

	}public void stuDetails(String name,char initial) {
		System.out.println("Student name is "+name+" "+initial);

	}public void stuDetails(Byte rollno) {
		System.out.println("Student rollno is "+rollno);

	}public static void main(String[] args) {
		Student stu = new Student();
		stu.stuDetails(12345);
		stu.stuDetails("John", 'A');
		stu.stuDetails(27);
	}

}
