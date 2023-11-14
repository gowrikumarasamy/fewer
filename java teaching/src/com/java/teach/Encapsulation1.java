package com.java.teach;

public class Encapsulation1
{
	private String name;
	private String surname;
	private int IDno;
	private char batchno;
	
	public void setname (String name) {
		this.name = name;
	}
	public String getname () {
		return name;
	}
	public void setsurname (String surname) {
		this.surname = surname;
	}
	public String getsurname()
	{
		return surname;
	}
	public void setIDno (int IDno)
	{
		this.IDno = IDno;
	}
	public int getIDno ()
	{
		return IDno;
	}
	public void setbatchno (char batchno)
	{
		this.batchno= batchno;
	}
	public char getbatchno ()
	{
		return batchno;
	}
		
	
	

	public static void main(String[] args) 
	{
		Encapsulation1 e1 = new Encapsulation1();
		e1.setname("Manager");
		System.out.println("Name : " + e1.getname());
		e1.setsurname("Ravi");
		System.out.println("Surname : "+ e1.getsurname() );
		e1.setIDno(6);
		System.out.println("IDno :" + e1.getIDno());
		e1.setbatchno('j');
		System.out.println("BATCHNO :" + e1.getbatchno());
		
		

	}

}
