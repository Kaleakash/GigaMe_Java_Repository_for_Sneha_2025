package com;

import java.util.*;

public class SetClasses {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		//LinkedHashSet hs = new LinkedHashSet();
		TreeSet hs = new TreeSet();
		System.out.println("size "+hs.size());
//		hs.add(10);	// auto-boxing : converting primitive to object. 
//		int a=20;	// primitive 
//		Integer b = new Integer(a); //converting primitive to object. 
//		hs.add(b);
//		hs.add(10.10);
//		hs.add("Ravi");
//		hs.add(true);
		hs.add(4);
		hs.add(1);
		hs.add(8);
		hs.add(3);
		hs.add(9);
		System.out.println("size "+hs.size());
		System.out.println(hs); // display as string format separated by , 
	}

}
