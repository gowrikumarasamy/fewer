package com.java.teach;

public class Notebook //default constructor
{
  public void print()
  {
	  System.out.println("print the notebook");
  }
  Notebook()
  {
	 System.out.println("study well"); 
	 System.out.println("prepare well");
  }
	public static void main(String[] args) 
	{
		Notebook n = new Notebook();
		n.print();// TODO Auto-generated method stub

	}

}
