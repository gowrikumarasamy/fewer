package com.java.teach;

class Vegetables
{
	public void vegetabletaste()
	{
		System.out.println("vegetable tastes differ");
	}
}

class Carrot extends Vegetables
{
	public void vegetabletaste()
	{
		System.out.println("carrot is sweet in taste");
	}
}

class Bitterguard extends Vegetables
{
	public void vegetabletaste()
	{
		System.out.println("bitterguard is bitter in taste");
	}
}

class Lemon extends Vegetables
{
	public void vegetabletaste()
	{
		System.out.println("lemon is sour in taste");
	}
}

public class Vegetable 
{
  public static void main(String[] args) 
  {
		Vegetables v = new Vegetables();
		Carrot c = new Carrot();
		Bitterguard b = new Bitterguard();
		Lemon l = new Lemon ();
		v.vegetabletaste();
		c.vegetabletaste();
		b.vegetabletaste();
		l.vegetabletaste();

	}

}
