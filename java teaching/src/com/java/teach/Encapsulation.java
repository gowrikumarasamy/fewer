package com.java.teach;

public class Encapsulation 
{
	private String name;
	private int rollno;
	private String dept;
	private float percentage;
	
	public void setname(String name)
	{
		this.name = (name + " Nazriya");
	}
	public String getname()
	{
		return name;
	}
	public void setdept(String dept)
	{
		this.dept = dept;
	}
	public String getdept()
	{
		return dept;
	}
	public void setrollno (int rollno) {
		this.rollno =  rollno;
	}
	public int getrollno()
	{
		return rollno;}
	public void setpercentage(float percentage)
	{
		this.percentage =percentage;
	}
	public float getpercentage()
	{
		return percentage;
	}
	
	public static void main(String[] args) 
	{
		Encapsulation e = new Encapsulation();
		e.setname("Arun");
		System.out.println("Name : " + e.getname());
		e.setdept("Mechanical");
		System.out.println("Department : "+ e.getdept());
		e.setrollno (7);
		System.out.println("Rollno:" + e.getrollno());
		e.setpercentage(30.0f);
		System.out.println("Grade :" + e.getpercentage());
		
		

	}

}
