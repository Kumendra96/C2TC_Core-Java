package com.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo 
{
	void Display(List <String> list)
	{
		Iterator<String> obj = list.listIterator();
		while (obj.hasNext())
		{
			System.out.println("Element is "+obj.next());
		}
	}
	public static void main(String[] args) 
	{
		List<String> lst = new LinkedList<>();
		lst.add("JAN");
		lst.add("FEB");
		lst.add("MARCH");
		lst.add("APREL");
		lst.add("MAY");
		System.out.println("Element is "+lst);
		
		IteratorDemo id = new IteratorDemo();
		lst.sort(null);
		id.Display(lst);
		System.out.println("************************");
		Collections.reverse(lst);
		id.Display(lst);
	}
}
