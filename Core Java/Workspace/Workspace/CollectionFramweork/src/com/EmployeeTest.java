package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("John");
		emp1.setSalary(50000);
		
		Employee emp2 = new Employee(101,"Raju",45000);
		
		System.out.println("Size "+listOfEmp.size());
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(new Employee(103,"Mohan",55000));
		System.out.println("Size "+listOfEmp.size());
		//listOfEmp.remove(1);
		Iterator<Employee> itr = listOfEmp.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			//System.out.println(emp);		// it will call toString method 
			//System.out.println("id is "+emp.getId()+" Name is "+emp.getName()+" Salary is "+emp.getSalary());
			if(emp.getId() == 101) {
				itr.remove();
			}
		}
		System.out.println("After remove Size "+listOfEmp.size());
	}

}
