package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// collection without generics 
	List ll1 = new ArrayList();
	ll1.add(10);
	ll1.add(10.10);
	ll1.add("Ravi");
	ll1.add(true);
	System.out.println(ll1);
	
	Object obj = ll1.get(0);	// get in object 
	Integer i = (Integer)obj;	// do type casting base upon type of object. 
	int n = i.intValue();		// get the primitive value 
	System.out.println(n);
	
	// collection with generics 
	List<Integer> ll2 = new ArrayList<Integer>();
	ll2.add(10);  // auto-boxing : converting primitive to object. 
	ll2.add(20);
	ll2.add(30);
	
	int m = ll2.get(0);   // auto-unboxing : converting object to primitive 
	System.out.println(m);
	
	List<Object> ll3 = new ArrayList<Object>();
	ll3.add(1);
	ll3.add(10.20);
	ll3.add("Ravi");
	}

}
