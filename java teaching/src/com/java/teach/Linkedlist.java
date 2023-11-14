package com.java.teach;

import java.util.*;

public class Linkedlist 
{
  public static void main(String[] args) 
  {
	  LinkedList<Integer> ll = new LinkedList<>();
	  ll.add(25);
	  ll.add(null);
	  ll.add(25);
	  ll.add(28);
	  ll.add(96);
	  ll.add(null);
	  ll.add(52);
	  ll.add(63);
	  ll.add(85);
	  ll.add(78);
	  ll.add(79);
	  ll.add(86);
	  ll.add(23);
	  ll.add(null);
	  System.out.println(ll);
	  ll.removeFirstOccurrence(25);
	  System.out.println(ll);
	  ll.removeLastOccurrence(null);
	  System.out.println(ll);
	  ll.addFirst(120);
	  System.out.println(ll);
	  ll.addLast(111);
	  System.out.println(ll);
	  ll.remove(5);
	  System.out.println(ll);

	}

}
