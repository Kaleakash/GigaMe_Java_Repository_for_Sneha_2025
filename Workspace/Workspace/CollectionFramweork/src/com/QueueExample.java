package com;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// PriorityQueue 
		
		Queue q1 = new PriorityQueue();
		q1.add(3);q1.add(1);q1.add(5);q1.add(8);q1.add(6);
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		// LinkedListQueue
		Queue q2 = new LinkedList();
		q2.add(3);q2.add(1);q2.add(5);q2.add(8);q2.add(6);
		System.out.println(q2);
		System.out.println(q2.poll());
		System.out.println(q2);
		// ArrayQueue 

		Queue q3 = new ArrayDeque();
		q3.add(3);q3.add(1);q3.add(5);q3.add(8);q3.add(6);	
		System.out.println(q3);
		System.out.println(q3.poll());
		System.out.println(q3);
	}

}
