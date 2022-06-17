package com.tns.di;

public class Student 
{
	private int id;
	private String StudentName;
	
	//using constructor injection
	public Student(int id, String studentName) {
		super();
		this.id = id;
		StudentName = studentName;
	}


	/*//using setters injection
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}*/


	public void display()
	{
		System.out.println("Name of the student is: " +StudentName + " and ID is: " +id);
	}

}
