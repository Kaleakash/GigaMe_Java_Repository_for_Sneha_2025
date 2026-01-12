package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharacterWiseClasses {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// source - keyboard
		// destination - console 
		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println("Enter the id");
//		int id = Integer.parseInt(br.readLine()); // readLine() method reads the data till user hits enter key
//		System.out.println("Enter the data");
//		String name	= br.readLine();	// readLine() method reads the data till user hits enter key
//		System.out.println("You have entered : "+id);
//		System.out.println("You have entered : "+name);
		// source --> file
		// destination --> file
		FileReader fr = new FileReader("mydata.txt");
		FileWriter fw = new FileWriter("mydata_copy1.txt",true);
		int ch;
		while((ch=fr.read())!=-1) {	// -1 means EOF (End of File)
			fw.write(ch);			// write character wise data into file
			System.out.println(ch+"="+(char)ch);
		}
		fr.close();
		fw.close();
	}

}
