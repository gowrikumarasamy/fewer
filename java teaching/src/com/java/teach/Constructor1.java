package com.java.teach;

public class Constructor1 {
	private int a;
	private int b;

	public void m1() {
		int a = 45, b = 56, c;
		c = a +b;
		System.out.println(c);
		
		c = this.a + this.b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
		c.m1();

	}

}
