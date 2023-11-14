package com.java.teach;

class Mango 
{
	protected String name = "fruit";
	private String fruitname;
	public void Seed() {
		System.out.println("Tree");
	}

	
	class Fruit extends Mango{
		
		 String fruitname = "Malgova";
	}
	
	public class inheritance
	{
	
	}
		public static void main(String[] args) 
	{
	
	Mango f = new Mango();
	f.Seed();
	System.out.println(f.name +""+f.fruitname);
		
	}
}
	
			

	



