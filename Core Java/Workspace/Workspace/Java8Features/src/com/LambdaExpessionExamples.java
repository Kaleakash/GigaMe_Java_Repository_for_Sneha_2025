package com;

@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
interface LargestNumber{
	public String findLargest(int x, int y);
}
public class LambdaExpessionExamples {

	public static void main(String[] args) {
	// 1st way 
	Operation op1 = (x,y)->x+y;	
	System.out.println(op1.add(10, 20));
	// 2nd way 
	Operation op2 = (int x, int y)->x+y;	
	System.out.println(op2.add(100, 200));
	// 3rd 
	Operation op3 = (a,b)->a+b;	
	System.out.println(op3.add(1000, 2000));
	//4th 
	Operation op4 = (a,b)-> {
		int sum = a+b;
		return sum;
	};
	System.out.println(op4.add(10000, 20000));
	
	LargestNumber ln = (a,b)-> {
		if(a>b) {
			return "1st Number is Largest";
		}else {
			return "2nd Number is Largest";
		}
	};
	System.out.println(ln.findLargest(1000, 200));
	}

}



