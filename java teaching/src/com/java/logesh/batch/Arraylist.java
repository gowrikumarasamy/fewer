package com.java.logesh.batch;

//import java.util.ArrayList;
import java.util.*;

public class Arraylist 
{
  public static void main(String[] args) 
  {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(78);
		al.add(56);
		al.add(85);
		al.add(25);
		//al.add(null);
		//al.add(null);
		al.add(95);
		al.add(25);
		al.add(56);
		al.set(0, 58);
		System.out.println(al);
		System.out.println(al.get(2));
		al.remove(2);
        System.out.println(al);
        Collections.sort(al);
		System.out.println(al);
        System.out.println(al.size());
        //al.clear();
        //System.out.println(al);
        ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(74);
		al1.add(65);
		al1.add(87);
		al1.addAll(al);
		System.out.println(al1);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
