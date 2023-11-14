package com.java.teach;

class Vehicle
{
	protected String name = "TVS";
	public void sound()
	{
		System.out.println("vrrrrrrrrrrr");
	}
}
class Bike extends Vehicle
{
	String modelname = "WEGO";
}


public class Inheritance 
{
 public static void main(String[] args) 
 {
	Bike b = new Bike();
	b.sound();
	System.out.println(b.name + " " + b.modelname);

	}

}
