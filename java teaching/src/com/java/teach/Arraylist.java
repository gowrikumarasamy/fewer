package com.java.teach;

//import java.util.ArrayList;

import java.util.*;

public class Arraylist 
{
  public static void main(String[] args) 
  {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(85);
		al.add(15);
		al.add(25);
		al.add(65);
		al.add(28);
		al.add(15);
		al.add(78);
		al.add(15);
		al.add(28);
		al.add(25);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(25);
		System.out.println(al);
		System.out.println(al.get(7));
		System.out.println(al.size());
		al.remove(3);
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		/*Collections.sort(al);
		System.out.println(al);
		//al.set(0, null);
		//System.out.println(al);
		/*Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(35);
		al1.add(38);
		al1.add(45);
		al1.addAll(al);
		System.out.println(al1);


	}

}
