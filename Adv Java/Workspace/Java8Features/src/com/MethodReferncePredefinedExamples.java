package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("Value using my consumer "+t);
	}
}
public class MethodReferncePredefinedExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ll = new ArrayList<Integer>();
//		ll.add(10);ll.add(20);ll.add(30);ll.add(40);
//		System.out.println("display data using lambda expression");
//		ll.stream().forEach(c->System.out.println("Value is "+c));
//		System.out.println("display data using method reference");
//		ll.stream().forEach(System.out::println);
//		System.out.println("double using map with lambda expression");
//		ll.stream().map(n->n*n).forEach(c->System.out.println(c));
//		System.out.println("double using map with method reference");
		//ll.stream().map(Math::sqrt).forEach(System.out::print);
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);ll.add(20);ll.add(30);ll.add(40);
		ll.stream().forEach(c->System.out.println("Value is "+c));
		
		Consumer<Integer> cc = new MyConsumer();
		ll.stream().forEach(cc::accept);
		ll.stream().forEach(System.out::println);
		
	}

}
