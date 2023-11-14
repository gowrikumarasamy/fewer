package com.java.teach;


public class Methodoverloading1 {
	
	public void eat() {
		System.out.println("arun");
	}
	public void eat (int a) 
	{
		System.out.println("mannai");
	}

	public static void main(String[] args) 
	{
		Methodoverloading1 m1 = new Methodoverloading1();
		m1.eat(10);
		m1.eat();
		

	}

}
