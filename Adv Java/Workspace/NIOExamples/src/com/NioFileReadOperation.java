package com;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioFileReadOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// FileInputStream
		// FileOutputStream		byte wise 
		//FileReader 	
		//FileWriter 			char 
		// type of character class which help to do read as well as write operation 
		RandomAccessFile file = new RandomAccessFile("input.txt", "r");
		FileChannel channel = file.getChannel();
		
		ByteBuffer buffer =   ByteBuffer.allocate(1024);
		
		channel.read(buffer);
		
		
		buffer.flip();		// switch write - read mode 
		
		while(buffer.hasRemaining()) {
			System.out.print((char)buffer.get());
		}
		channel.close();
		file.close();
	}

}
