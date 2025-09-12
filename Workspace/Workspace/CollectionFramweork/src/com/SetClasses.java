package com;

import java.util.*;

public class SetClasses {

	public static void main(String[] args) {
//		//HashSet hs = new HashSet();
//		//LinkedHashSet hs = new LinkedHashSet();
//		TreeSet hs = new TreeSet();
//		System.out.println("size "+hs.size());
////		hs.add(10);	// auto-boxing : converting primitive to object. 
////		int a=20;	// primitive 
////		Integer b = new Integer(a); //converting primitive to object. 
////		hs.add(b);
////		hs.add(10.10);
////		hs.add("Ravi");
////		hs.add(true);
//		hs.add(4);
//		hs.add(1);
//		hs.add(8);
//		hs.add(3);
//		hs.add(9);
//		System.out.println("size "+hs.size());
//		System.out.println(hs); // display as string format separated by , 
		
		HashSet hs = new HashSet();
		System.out.println("Size is "+hs.size());
		System.out.println("empty "+hs.isEmpty());
		hs.add(2);
		hs.add(1);
		hs.add(6);
		hs.add(3);
		hs.add(9);
		hs.add(7);
		System.out.println(hs);
		System.out.println("remove "+hs.remove(1));
		System.out.println("remove "+hs.remove(10));
		System.out.println("search "+hs.contains(6));
		System.out.println("search "+hs.contains(10));
		System.out.println("Size is "+hs.size());
		System.out.println("empty "+hs.isEmpty());
		System.out.println(hs);
	}

}
