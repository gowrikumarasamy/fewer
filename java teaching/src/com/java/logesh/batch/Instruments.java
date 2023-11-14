package com.java.logesh.batch;

abstract class Instrument
{
	abstract void instrumentname();
	public void instrumenttype()
	{
		System.out.println("check whether it is stringed instrument or wind instrument");
	}
}
class Flute extends Instrument
{
	public void instrumentname()
	{
		System.out.println("flute is wind instrument");
	}
}
class Guitar extends Instrument
{
	public void instrumentname()
	{
		System.out.println("guitar is stringed instrument");
	}
}
class Trumpet extends Instrument
{
	public void instrumentname()
	{
		System.out.println("trumpet is wind instrument");
	}
}

public class Instruments 
{
  public static void main(String[] args) 
  {
	  Trumpet t = new Trumpet();
	  Guitar g = new Guitar();
	  Flute  f = new Flute();
	  t.instrumentname();
	  t.instrumenttype();
	  g.instrumentname();
	  g.instrumenttype();
	  f.instrumentname();f.instrumenttype();
	  

	}

}
