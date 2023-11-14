package com.java.teach;

public class cons
{
   int a = 500 , b = 300;
   public void m1()
   {
    int a1 = 568 , b1 =258;
    int c;
    c = a + b;
   System.out.println(c);
   int g;
   g = this.a + this.b;
   System.out.println(g);
   }
   cons()
   {
	   System.out.println("welcome");
   }

      public static void main(String[] args) 
      {
		cons c = new cons();
		c.m1();

	}

}
