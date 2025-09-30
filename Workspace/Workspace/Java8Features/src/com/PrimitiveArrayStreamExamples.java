package com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveArrayStreamExamples {

	public static void main(String[] args) {
	int num[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("retrieve array element using for each loop");
	for(int n:num) {
		System.out.println(n);
	}
	System.out.println("using stream retreive data from array ");
	Arrays.stream(num).forEach(n->System.out.println(n));
	System.out.println("using filter intermeidate operator to filter even number");
	Arrays.stream(num).filter(n->n%2==0).forEach(n->System.out.println(n));
	System.out.println("using filter intermeidate operator to filter odd number");
	Arrays.stream(num).filter(n->n%2!=0).forEach(n->System.out.println(n));
	System.out.println("using filter intermeidate operator to filter with 5 > number");
		Arrays.stream(num).filter(n->n>5).forEach(n->System.out.println(n));
		System.out.println("using filter intermeidate operator to filter with 5 < number");
	Arrays.stream(num).filter(n->n>5).forEach(n->System.out.println(n));
	System.out.println("using map intermeidate operator to double the value");
	Arrays.stream(num).map(n->n*2).forEach(n->System.out.println(n));
	System.out.println("using map intermeidate filter and map");
	Arrays.stream(num).filter(n->n%2==0).map(n->n*4).forEach(n->System.out.println(n));
	System.out.println("using count terminal operator to count the element");
	long count=Arrays.stream(num).count();
	System.out.println("count is "+count);
	long eventCount = Arrays.stream(num).filter(n->n%2==0).count();
	System.out.println("even count is "+eventCount);
	long oddCount = Arrays.stream(num).filter(n->n%2!=0).count();
	System.out.println("odd count is "+oddCount);
	System.out.println("using sum terminal findAny operator");
	boolean result1 = Arrays.stream(num).anyMatch(n->n>9);
	System.out.println("result is "+result1);
	boolean result2 = Arrays.stream(num).allMatch(n->n>0);
	System.out.println("result is "+result2);
	
	IntStream ii = Arrays.stream(num);
	ii.forEach(n->System.out.println(n));
	}

}
