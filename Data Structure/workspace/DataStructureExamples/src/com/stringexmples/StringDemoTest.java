package com.stringexmples;

public class StringDemoTest {

	static boolean isPalindrome(char[] str) {
	    int left = 0;				//Madam
	    int right = str.length - 1;
	    while (left < right) {
	        if (str[left] != str[right]) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

	static char[] reverse(char[] str) {
	    int left = 0;
	    int right = str.length - 1;
	    while (left < right) {
	        char temp = str[left];
	        str[left] = str[right];
	        str[right] = temp;
	        left++;
	        right--;
	    }
	    return str;
	}

	
	static void duplicates(char[] str) {
	    int[] freq = new int[256];

	    for (char c : str) {
	        freq[c]++;		// a,k,a,s,h
	    }

	    for (int i = 0; i < 256; i++) {
	        if (freq[i] > 1) {
	            System.out.println((char)i + " repeated " + freq[i] + " times");
	        }
	    }
	}

	public static void main(String[] args) {
	
		String data = "akasah!!";
		char charData[] = data.toCharArray();
//		System.out.println(isPalindrome(charData));
		
//		System.out.println(data);
//		char reverseChar[] = reverse(charData);
//		System.out.println(reverseChar);
	
		duplicates(charData);
		char ch='A';
		System.out.println((int)ch);
	}

}
