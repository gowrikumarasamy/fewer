package com.java.teach;

public class Constructor 
{
  int a = 60 , b = 90, c = 56 ,d;
  public void m1() 
  {
	  int i = 85, j = 98 ,k;
	  k = i + j;
	  System.out.println(k); 
	  //int e;
	  d = this.a + this.b + this.c;
	  System.out.println(d);
  }
  
	public static void main(String[] args) 
	{
	Constructor c = new Constructor();
	c.m1();// TODO Auto-generated method stub

	}

}
