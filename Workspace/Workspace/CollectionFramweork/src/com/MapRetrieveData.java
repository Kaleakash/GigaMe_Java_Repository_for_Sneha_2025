package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mm = new HashMap<Integer,String>();
		mm.put(1, "One");
		mm.put(2, "Two");
		mm.put(3, "Three");
		mm.put(4, "Four");
		System.out.println(mm);
		System.out.println(mm.get(3));
		System.out.println(mm.get(30));
		System.out.println("Size of map is: "+mm.size());
		Set<Integer> ss = mm.keySet();  // converting map to set and all keys. 
		Iterator<Integer> li  = ss.iterator();
		while(li.hasNext()) {
			Integer i = li.next();
			System.out.println("Key is: "+i+" Value is: "+mm.get(i));
		}
	}

}
