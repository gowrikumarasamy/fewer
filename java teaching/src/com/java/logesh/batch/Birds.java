package com.java.logesh.batch;

interface Bird
{
	public void birdcolor();
	public void birdsound();
}
class Crow implements Bird
{
	public void birdcolor()
	{
		System.out.println("crow is black in color");
	}
	public void birdsound()
	{
		System.out.println("crow says KAWKAW");
	}
}
class Parrot implements Bird
{
	public void birdcolor()
	{
		System.out.println("parrot is green color");
	}
	public void birdsound()
	{
		System.out.println("parrot says KIKI");
	}
}
public class Birds 
{

	public static void main(String[] args) 
	{
		Crow c = new Crow();
		Parrot p =new Parrot();
		c.birdcolor();
		c.birdsound();
		p.birdcolor();
		p.birdsound();

	}

}
