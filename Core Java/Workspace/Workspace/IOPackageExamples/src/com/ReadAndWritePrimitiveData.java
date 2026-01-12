package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	// store primitive data 
//		int id =100;
//		String name ="John";
//		float salary = 25000.5f;
//		boolean result = true;
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.writeBoolean(result);
//		System.out.println("Stored primitive data in file system");
		
		// read primitive data
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id1 = dis.readInt();
		String name1 = dis.readUTF();
		float salary1 = dis.readFloat();
		boolean result1 = dis.readBoolean();
		System.out.println("id is "+id1);
		System.out.println("name is "+name1);
		System.out.println("salary is "+salary1);
		System.out.println("result is "+result1);
	}

}
