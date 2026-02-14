package com.arrayexamples;

public class MatrixArrayDemo {

	public static void main(String[] args) {
		int num1[][]= {	{1,2,3},
						{4,5,6,10},
						{7,8,9,11,12}
						};
		System.out.println(num1[0][0]);
		System.out.println(num1[0][1]);
		System.out.println("-------------");
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1[i].length;j++) {
				System.out.print(" "+num1[i][j]);
			}
			System.out.println();
		}
	}

}
