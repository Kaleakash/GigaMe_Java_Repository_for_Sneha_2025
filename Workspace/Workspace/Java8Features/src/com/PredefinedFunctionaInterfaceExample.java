package com;
import java.util.function.Function;
import java.util.function.Supplier;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		// TODO Auto-generated method stub
		return "You pass be number as "+t;
	}	
}
class MySupplier implements Supplier<String>{
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "I am a Supplier";
	}
}
public class PredefinedFunctionaInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st way to call Function interface
		Function<Integer, String> f = new MyFunction();
		System.out.println(f.apply(10));
		
		Supplier<String> s = new MySupplier();
		System.out.println(s.get());
		
		// provide the body for Function interface using lambda expression
		
		Function <String,Integer> f2 = (name)->name.length();
		System.out.println(f2.apply("Hello"));
		Function <String, String> f3 =(name)->name.toLowerCase();
		System.out.println(f3.apply("HELLO"));
		
		Supplier<Double> s2 = ()->Math.random();
		System.out.println(s2.get());
	}

}




