package com.tns.di1;


public class Student1 {
		
		//Dependency in objects
		Cheat c;
		
		
		public void setC(Cheat c) {
			this.c = c;
		}
		public void cheating() {
			
			c.mathCheat2();
		}
}
