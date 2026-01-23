package com;

class Calculator<T extends Number> {

    void add(T a, T b) {
        System.out.println(a+" "+b);
    }
}


public class GenericUnboundExamples {

	public static void main(String[] args) {
		Calculator<Integer> c1 = new Calculator<>();
		c1.add(100, 200);
		
		Calculator<Double> c2 = new Calculator<>();
		c2.add(100.10, 200.20);
		
//		Calculator<String> c3 = new Calculator<>();
//		c3.add("Raj", "Deep");
//		
//		Calculator<Boolean> c4 = new Calculator<>();
//		c4.add(true, false);

	}

}
