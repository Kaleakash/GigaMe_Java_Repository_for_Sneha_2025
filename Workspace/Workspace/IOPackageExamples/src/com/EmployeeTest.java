package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//	Employee e1=new Employee(101,"John",45000);
//	System.out.println(e1);  // toStrign method called to display information
//	FileOutputStream fos = new FileOutputStream("employee.ser");
//	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	oos.writeObject(e1);
//	oos.close();
//	fos.close();
//	System.out.println("object serialized done successfully");
		
	FileInputStream fis = new FileInputStream("employee.ser");	
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();
	Employee e2 = (Employee)obj;  // downcasting
	System.out.println(e2);
	fis.close();
	ois.close();
	System.out.println("object De-serialized done successfully");
	}

}
