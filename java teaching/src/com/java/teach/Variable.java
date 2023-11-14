package com.java.teach;

public class Variable 
{
  int sum1 = 100;
  static int marks = 568;
  public void m1()
  {
	  int a = 65;
	  System.out.println(sum1);
	  System.out.println(marks);
	  System.out.println(a);
  }
  public static void m2()
  {
	  int b = 85;
	  Variable r = new Variable();//reference variable
	  System.out.println(r.sum1);
	  System.out.println(marks);
	  System.out.println(b);
  }
  public void Variable1()
  {
	  System.out.println("variable");
  }
  Variable()
  {
	  System.out.println("this is a constructor");
  }
	public static void main(String[] args) 
	{
		int  var = 10;
		Variable v = new Variable();
		System.out.println(var);
		System.out.println(v.sum1);
		System.out.println("mark");
		v.m1();
		m2();
		v.Variable1();
		// TODO Auto-generated method stub

	}

}
