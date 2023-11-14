package com.java.teach;
interface student1
{
	public void mark1();
	public void mark2();
	public void mark3();
	
}
interface student2
{
	public void mark4();
	public void mark5();
	public void mark6();
	
}
interface student3
{
	public void result();
	public void average();
}
class exam implements student1,student2,student3
{
	public void mark1() {
		System.out.println("98");
	}
	public void mark2()
	{
		System.out.println("93");
	
	}
	public void mark3()
	{
		System.out.println("44");
	}
	public void mark4()
	{
		System.out.println("54");
	}
	public void mark5()
	{
		System.out.println("64");
	}
	public void mark6()
	{
		System.out.println("74");
	}
	public void result()
	{
		System.out.println("all pass");
	}
	public void average()
	{
		System.out.println("85%");
	}
}
public class Multiinterface1 {

	public static void main(String[] args) {
	exam e = new exam();
	e.mark1();
	e.mark2();
	e.mark3();
	e.mark4();
	e.mark5();
	e.mark6();
	e.result();
	e.average();

	} 

}
