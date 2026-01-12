package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stdnames = new ArrayList<String>();
		stdnames.add("John");
		stdnames.add("Alice");
		stdnames.add("Bob");
		stdnames.add("Eve");
		stdnames.add("Diana");
		System.out.println("Retrieve all elements one by one before sorting:");
		for(String name:stdnames) {
			System.out.println(name);
		}	
		Collections.sort(stdnames);
		System.out.println("Retrieve all elements one by one after sort in asc order:");
		for(String name:stdnames) {
			System.out.println(name);
		}
		Collections.reverse(stdnames);
		System.out.println("Retrieve all elements one by one after sort in desc order:");
		for(String name:stdnames) {
			System.out.println(name);
		}
	}

}
