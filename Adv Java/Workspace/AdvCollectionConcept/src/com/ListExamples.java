package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExamples {

	public static void main(String[] args) {
		//List<String> names = new ArrayList<String>();
		List<String> names = new CopyOnWriteArrayList<String>();
		names.add("Ravi");
		names.add("Raj");
		names.add("Ramesh");
		names.add("Lokesh");
		System.out.println("size "+names.size());
		Iterator<String> li = names.iterator();
		while(li.hasNext()) {
			String name = li.next();
			System.out.println(name);
			System.out.println("size is in loop "+names.size());
			names.add("Rahul");
		}
		//names.add("Rahu");
		System.out.println("size "+names.size());
		System.out.println(names);
	}

}
