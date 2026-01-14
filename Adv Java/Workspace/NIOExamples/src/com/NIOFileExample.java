package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class NIOFileExample {

	public static void main(String[] args) throws Exception{
	// Old way 
//		File ff = new File("input1.txt");
//		if(ff.exists()) {
//			System.out.println("file present");
//		}else {
//			System.out.println("file not present");
//		}
		
//		Path path = Paths.get("input.txt");
//		if(Files.exists(path)) {
//			System.out.println("file present");
//		}else {
//			System.out.println("file not present");
//		}
		
		// Old way 
//		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		String line;
//		while((line=br.readLine())!=null) {
//			System.out.println(line);
//		}
		
		// using NIO package 
//		Path path = Paths.get("input.txt");
//		Files.lines(path).forEach(e->System.out.println(e));
		
		
		// using NIO package store data 
		Path path = Paths.get("data.txt");
//		
//		Files.write(path,"Hello" , StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		String data = "Welcome to NIo Package";
		Files.write(path, data.getBytes(), StandardOpenOption.CREATE);
	
	}

}
