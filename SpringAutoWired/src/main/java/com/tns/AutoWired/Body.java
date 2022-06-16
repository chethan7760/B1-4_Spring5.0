package com.tns.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	public static void main(String[] args) 
	{
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The File is Executing...");
		
		Human h=a.getBean("human", Human.class);
		h.display();
		
		

	}

}
