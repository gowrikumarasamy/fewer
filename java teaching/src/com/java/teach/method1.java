package com.java.teach;

public class method1 
{
	int a = 400 , b = 600,c;
	public void m1()
	{
		c = a + b;
        System.out.println(c);
    }   
    public void m1(int a , int b) 
    {
    int c;
    c = a + b;
    System.out.println(c);
   }
    public void m2 (int a , int b)
    
    {
    	int c;
    	c = a - b;
    	System.out.println(c);
    }
    public void m3(int a , int b)
    {
    			
     int c;
     c = a * b;
     System.out.println(c);
    }
    public void m4(int a , int b)
    {
      int c;
      c = a / b;
     System.out.println(c);
    }
   public static void main(String[] args)
    {
    			method1 m = new method1();
    			m.m1();
    			m.m1(400 , 300);
    			m.m2(500 , 600);
    			m.m1();
    			m.m1(2000 , 5000);
    			m.m2(7000 , 4000);
    			m.m3(6000 , 8000);
    	 		m.m3(40 , 400);
    	 		m.m4(2500 , 2000);
    		}
    		
}
    	 		
    	 		
    	 		
    	 		
    	 		
    	 		
    	 		
    	 		
    	 		