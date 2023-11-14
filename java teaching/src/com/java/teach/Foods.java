package com.java.teach;

abstract class Food1
{
	abstract void Foodname();
	public void Foodtype()
	{
		System.out.println("check it is veg or non-veg");
	}
}
class Chicken extends Food1
{
	public void Foodname()
	{
		System.out.println("This food is the non-veg");
	}
}
class paneer extends Food1
{
	public void Foodname()
	{
		System.out.println("This food is the veg");
	}
}

class Mutton extends Food1
{
	public void Foodname()
	{
		System.out.println("This food is the non-veg");
	}
}
public class Foods {

	public static void main(String[] args) {
		Chicken c = new Chicken();
		paneer p = new paneer();
		Mutton M = new Mutton();
	    c.Foodname();
		c.Foodtype();
		p.Foodname();
		p.Foodtype();M.Foodname();
		M.Foodtype();


	}

}
