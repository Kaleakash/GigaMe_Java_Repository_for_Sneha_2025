package com;

import java.util.stream.IntStream;

public class StreamingAndParallelStreamingExamples {

	public static void main(String[] args) {
		//IntStream.range(1, 10).sequential().forEach(c->System.out.println(c));
		//IntStream.range(1, 10).parallel().forEach(c->System.out.println(c));
		//IntStream.range(1, 10).forEach(c->System.out.println(c));
		//IntStream.range(1, 10).filter(n->n%2==0).forEach(c->System.out.println(c));
		//IntStream.range(1, 100).parallel().filter(n->n%2==0).forEach(c->System.out.println(c));
		
//		IntStream.range(1, 100).sequential().filter(n->n%2==0).forEach(c->{
//			Thread t = Thread.currentThread();
//			System.out.println(t+" "+c);
//		});
		
		IntStream.range(1, 100).parallel().filter(n->n%2==0).forEach(c->{
			Thread t = Thread.currentThread();
			System.out.println(t+" "+c);
		});
	}

}
