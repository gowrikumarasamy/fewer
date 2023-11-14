package com.java.logesh.batch;

interface Stud1
{
	public void marks();
}
interface Stud2
{
	public void result();
}
class Student implements Stud1,Stud2
{
	public void marks()
	{
		System.out.println("see the mark");
	}
	public void result()
	{
		System.out.println("see the result");
	}
}
public class Multinter 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.marks();
		s.result();

	}

}
