package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseClasses {

	public static void main(String[] args) throws Exception {
	// Source --> Keyboard 
	// Destination --> Console 
//	DataInputStream dis = new DataInputStream(System.in);
//	PrintStream ps = System.out;
//	ps.println("Enter the data:");
//	int ch;
//	while((ch=dis.read())!='\n') {   // Read byte wise data till hit enter key
//		ps.println(ch+"="+(char)ch);
//	}
		// source --> keyboard
		// destination --> file
//		DataInputStream dis = new DataInputStream(System.in);
//		//FileOutputStream fos = new FileOutputStream("mydata.txt");	// override the data 
//		FileOutputStream fos = new FileOutputStream("mydata.txt",true);	//append the data
//		System.out.println("Enter the data:");
//		int ch;
//		while((ch=dis.read())!='\n') {
//			fos.write(ch);  // write byte wise data into file
//		}
//		fos.close();
		
		// source --> file
		// destination --> file 
		FileInputStream fis = new FileInputStream("mydata.txt");
		FileOutputStream fos = new FileOutputStream("mydata_copy.txt",true);
		int ch;
		while((ch = fis.read())!=-1) {			// -1 mean EOF (End of File)
			fos.write(ch);					// write byte wise data into file
			System.out.println(ch+"="+(char)ch);
		}
		fis.close();
		fos.close();
		System.out.println("file copied successfully...");
	}

}
