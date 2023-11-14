package com.java.logesh.batch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionDemo {
	
	public static void add(int a,int b)
	{
	System.out.println(Integer.sum(a, b));
	System.out.println(Integer.max(a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(34234,23342);
		int a[]= {1,2,3,4,5465,67,78,8};
		
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
		
		String num="10";
		
		Integer.sum(5264, 75232);
		
		int numnew=Integer.valueOf(num);
		
		System.out.println(numnew);
		
		
		Vector<Object> al=new Vector();
		
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
		
		System.out.println(al);
		
		System.out.println(a);
		
		int size=al.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("===================");
		for(Object aa:al)
		{
			System.out.println(aa);
		}
	}

}
