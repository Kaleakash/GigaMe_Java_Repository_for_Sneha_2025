package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
class MyConsumer implements Consumer<String>{
	public void accept(String s) {
		System.out.println(s);
	}
}
public class CollectionWithLambdaExpression {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("John");
	names.add("Jane");
	names.add("Jack");
	names.add("Doe");
	System.out.println(names);
	System.out.println("Display all names one by one using Iterator");

//	Iterator<String> it = names.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
//	System.out.println("Display all names one by one using forEach with consumer interface without lambda expression");
//	Consumer<String> consumer = new MyConsumer();
//	names.forEach(consumer);
	System.out.println("Display all names one by one using forEach with lambda expression");
	names.forEach((name)->System.out.println(name));
	}
}
