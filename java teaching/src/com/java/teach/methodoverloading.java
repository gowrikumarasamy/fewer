package com.java.teach;

public class methodoverloading 
{
	static int add(int a , int b)
	{
		return a + b;
	}
	
	static int add(int a , int b , int c)
	{
		return a + b + c;
	}
  public static void main(String[] args) 
  {
		System.out.println("adding parameters a & b");
		System.out.println(add(963 , 568));
		System.out.println("adding parameters a, b & c");
		System.out.println(add(799 , 741 ,369));

	}

}
