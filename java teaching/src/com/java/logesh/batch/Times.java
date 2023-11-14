package com.java.logesh.batch;

class Time
{
	public void gettingtime()
	{
		System.out.println("getting time in several ways");
	}
	
}
class Watch extends Time
{
	public void gettingtime()
	{
		System.out.println("3 needles rotates");
	}
}

class Digital extends Time
{
	public void gettingtime()
	{
		System.out.println("number changes");
	}
}

class Smart extends Time
{
	public void gettingtime()
	{
		System.out.println("tracking all activities");
	}
}



public class Times //polymorphism
{
  public static void main(String[] args) 
  {
		Time t = new Time();
		Watch w = new Watch();
		Digital d = new Digital();
		Smart s = new Smart();
		t.gettingtime();
		w.gettingtime();
		d.gettingtime();s.gettingtime();

	}

}
