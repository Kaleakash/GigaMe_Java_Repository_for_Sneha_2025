package com;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class NioWriteFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RandomAccessFile file = new RandomAccessFile("output.txt", "rw");
		
		FileChannel channel = file.getChannel();
		
		//String data = "Welcome to Nio Package, this file created using NIO concept";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		String data = sc.nextLine();
		
		ByteBuffer buffer =   ByteBuffer.allocate(1024);
		
		buffer.put(data.getBytes());			// data.getBytes convert string to byte format 
		
		
		buffer.flip();		// switch write - read mode 
		
		channel.write(buffer);
		
		channel.close();
		file.close();
		
		System.out.println("Data stored in file system");
	}

}
