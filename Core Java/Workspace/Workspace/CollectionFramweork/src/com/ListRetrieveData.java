package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListRetrieveData {

	public static void main(String[] args) {
	List<String> ll = new ArrayList<String>();
	ll.add("java");
	ll.add("python");
	ll.add("c++");
	ll.add("ruby");
	System.out.println(ll);
	ListIterator<String> li = ll.listIterator();
	System.out.println("forward direction");
	while(li.hasNext()) {
		String s = li.next();
		System.out.println(s);	
	}
	System.out.println("backward direction");
	while(li.hasPrevious()) {
		String s = li.previous();
		System.out.println(s);	
	}
	}
}
