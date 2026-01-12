package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListClasses {
	public static void main(String[] args) {
		// ArrayList Example 
//		ArrayList al = new ArrayList();
//		System.out.println("size "+al.size());
//			al.add(10);
//			al.add(50);
//		al.add(20);
//		al.add(70);
//		al.add(90);
//		al.add("Ravi");
//		System.out.println(al);
//		System.out.println(" get the value using index "+al.get(0));
//		System.out.println("get value in 2nd index position "+al.get(2));
//			al.add(2,100);
//		System.out.println("get value in 2nd index position "+al.get(2));
//		System.out.println(al);
//			al.remove(1);		// it remvove using index position 
//		System.out.println(al);
		// linked list 
		
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.add(40);
//		System.out.println(ll);
		
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("Remove top most element "+ss.pop());
		System.out.println(ss);
		System.out.println("To view top most element "+ss.peek());
		System.out.println(ss);
		System.out.println("search "+ss.search(100));  // count start from top
		System.out.println("search "+ss.search(400));  // count start from top
	}
}
