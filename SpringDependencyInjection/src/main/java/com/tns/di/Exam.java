package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args)
	{
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The File is Executing...");
		Student s=a.getBean("s1",Student.class);
		s.display();
		
		Student s1=a.getBean("s2",Student.class);
		s1.display();
	}

}
