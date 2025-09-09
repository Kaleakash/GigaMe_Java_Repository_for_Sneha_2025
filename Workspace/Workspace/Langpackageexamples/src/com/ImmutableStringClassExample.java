package com;

public class ImmutableStringClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Raj";
		System.out.println(name);
			System.out.println(name.toUpperCase());
		System.out.println(name);
		StringBuffer sb  = new StringBuffer("Raj");
		System.out.println(sb);
			System.out.println(sb.append(" Deep"));
			sb.reverse();
			
		System.out.println(sb);
		
		String s1 = "Raj";
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		
		String s2 = sb.toString();
		System.out.println(s2);
	}

}
