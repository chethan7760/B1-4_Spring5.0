package com.tns.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart h;
	//default constructor
	public Human() 
	{
		this.h = h;
	}
	
	
	public Human(Heart h) {
		super();
		this.h = h;
	}
	
	@Autowired
	@Qualifier("o")
	
	//using setter method
	public void setH(Heart h) {
		this.h = h;
	} 

	public void display()
	{
		h.pump();
		System.out.println("the name of animal is" +h.getNameofAnimal()+ "and name of the heart is" +h.getNameofHeart());
	}
}
