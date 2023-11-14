package com.java.logesh.batch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al=new ArrayList();
		
		al.add(100);
		
		al.add("java");
		
		al.add(100);
		al.add(100);
		al.add(100);
		
		al.add('s');
		
		al.add(100);
		al.add(100);
		al.add(null);
		al.add(8964327864783l);
		al.add(null);
		al.add(0, "selenium");
		
		System.out.println(al);
		
		Iterator<Object> i = al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
