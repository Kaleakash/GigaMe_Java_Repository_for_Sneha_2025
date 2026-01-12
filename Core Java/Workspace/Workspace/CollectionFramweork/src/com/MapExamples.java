package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap hm = new HashMap();
		//LinkedHashMap hm = new LinkedHashMap();
		TreeMap hm = new TreeMap();
		hm.put(2, "ravi");
		hm.put(1, "raju");
		hm.put(5, "ram");
		hm.put(3, "rajesh");
		//hm.put("a", "b");
		System.out.println(hm);
	}

}
