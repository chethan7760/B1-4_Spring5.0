package com.tns.AutoWired;

public class Heart 
{
	private String nameofAnimal;
	private String nameofHeart;
	
	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public String getNameofHeart() {
		return nameofHeart;
	}

	public void setNameofHeart(String nameofHeart) {
		this.nameofHeart = nameofHeart;
	}

	public void pump() 
	{
		System.out.println("The program is executing");
		System.out.println("I am alive");
	}


}
