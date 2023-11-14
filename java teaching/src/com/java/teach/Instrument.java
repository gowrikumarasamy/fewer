package com.java.teach;

abstract class Instruments
{
	abstract void instrumentname();
	public void instrumenttype()
	{
		System.out.println("check it is stringed instrument or wind instrument");
	}
}
class Flute extends Instruments
{
	public void instrumentname()
	{
		System.out.println("flute is a wind instrument");
	}
}
class Guitar extends Instruments
{
	public void instrumentname()
	{
		System.out.println("guitar is a stringed instrument");
	}
}

class Trumpet extends Instruments
{
	public void instrumentname()
	{
		System.out.println("trumpet is a wind instrument");
	}
}
public class Instrument 
{
  public static void main(String[] args) 
  {
		Flute f = new Flute();
		Guitar g = new Guitar();
		Trumpet t = new Trumpet();
		f.instrumentname();
		f.instrumenttype();
		g.instrumentname();
		g.instrumenttype();t.instrumentname();
		t.instrumenttype();

	}

}
