package com;

import java.util.Arrays;
import java.util.List;

class Data {
	public void display(List<?> ll ) {
		System.out.println(ll);
	}
}
public class WildCardExamples {

	public static void main(String[] args) {
		Data dd  = new Data();
		List<Integer> llOfInteger = Arrays.asList(10,20,30,40);
		List<Float> llOfFloat = Arrays.asList(10.10f,10.20f,10.20f);
		List<String> llOfString = Arrays.asList("A","B","C");
		
		dd.display(llOfInteger);
		dd.display(llOfFloat);
		dd.display(llOfString);
		
	}

}
