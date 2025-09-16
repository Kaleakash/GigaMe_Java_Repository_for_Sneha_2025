package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetrieveData {

	public static void main(String[] args) {
		Set<Integer> ss = new HashSet<Integer>();	
		ss.add(10);
		ss.add(20);
		ss.add(30);
		ss.add(40);
		System.out.println(ss);
		System.out.println("reterive data one by one using using for each loop");
		for(int n:ss) {
			System.out.println(n);
		}
		System.out.println("reteive data using Iterator interface");
		Iterator<Integer> it = ss.iterator();
		while(it.hasNext()) {
		int n = it.next();
		
		System.out.println(n);
		}
	}

}
