package com;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionWithStreamAPI {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby","Java","C++");
		
		list.stream().filter(s -> s.startsWith("J")).forEach(n->System.out.println(n));
		list.stream().filter(s -> s.contains("P")).forEach(n->System.out.println(n));
		list.stream().filter(s -> s.length() > 3).forEach(n->System.out.println(n));
		System.out.println("dispay all names in upper case");
		list.stream().map(s -> s.toUpperCase()).forEach(n->System.out.println(n));
		System.out.println("display all names");
		list.stream().forEach(n->System.out.println(n));
		System.out.println("distinct names");
		list.stream().distinct().forEach(n->System.out.println(n));
		
		List<Integer> numbers = Arrays.asList(1, 2,2, 3, 4,4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20);
		List<Integer> eventNumbers1 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		Set<Integer> eventNumbers2 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());
		System.out.println("Even Numbers in List: " + eventNumbers1);
		System.out.println("Even Numbers in Set: " + eventNumbers2);
	}

}
