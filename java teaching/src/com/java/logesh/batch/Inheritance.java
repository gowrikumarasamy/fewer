package com.java.logesh.batch;

class Species
{
	protected String name = "reptiles";
	public void breed()
	{
		System.out.println("come from egg");
	}
}
class Snake extends Species
{
	String breedname = "cobra";
}

public class Inheritance 
{
  public static void main(String[] args) 
  {
		Snake s = new Snake();
		s.breed();
		System.out.println(s.name +" " + s.breedname);
		

	}

}
