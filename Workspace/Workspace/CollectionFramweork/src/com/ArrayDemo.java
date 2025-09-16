package com;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,6,3,4,1,9,7};
		System.out.println("Array elements before sort");
		for(int n :num ) {
			System.out.println(n);
		}
			Arrays.sort(num);
		System.out.println("Array elements after sort");
		for(int n :num ) {
			System.out.println(n);
		}	
		// in binary search array must be sorted
		System.out.println("Search the element in array and get index position "+Arrays.binarySearch(num, 9));
		System.out.println("Search the element in array and get index position "+Arrays.binarySearch(num, 14));
	}

}
