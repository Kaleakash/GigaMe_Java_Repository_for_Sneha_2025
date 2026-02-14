package com.arrayexamples;

public class ReversArrayExmaples {

	static void reverse(int[] arr) {
	    int left = 0, right = arr.length - 1;			//2	100,200	200,100

	    while (left < right) {			// left 0, right 1 
	        int temp = arr[left];		//temp = 100		
	        arr[left] = arr[right];		// 200, 
	        arr[right] = temp;			// 100 

	        left++;
	        right--;
	    }
	}

	public static void main(String[] args) {
		int num[]= {100,200,300,11,15,89,90};
		System.out.println("Before reverse");
		for(int n:num) {
			System.out.print(" "+n);
		}
		reverse(num);
		System.out.println();
		System.out.println("After reverse");
		for(int n:num) {
			System.out.print(" "+n);
		}
	}

}
