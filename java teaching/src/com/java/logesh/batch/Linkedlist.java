package com.java.logesh.batch;
import java.util.*;

public class Linkedlist 
{
  public static void main(String[] args) 
  {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(856);
		ll.add(785);
		ll.add(41);
		ll.add(258);
		ll.add(null);
		ll.add(null);
		ll.add(856);
		ll.add(28);
		System.out.println(ll);
		ll.removeFirstOccurrence(856);
		System.out.println(ll);
		ll.removeLastOccurrence(null);
		System.out.println(ll);
		ll.addFirst(96);
		System.out.println(ll);
		ll.addLast(null);
		System.out.println(ll);

	}

}
