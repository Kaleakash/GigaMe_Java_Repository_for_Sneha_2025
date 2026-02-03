package comparableexmaples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoTest {

	public static void main(String[] args) {
//	List<String> ll = new ArrayList<String>();
//	ll.add("ravi");ll.add("ajay");ll.add("vikash");ll.add("mahesh");
//	System.out.println("Before sort");
//	ll.stream().forEach(v->System.out.print(v+" "));
//	Collections.sort(ll);
//	System.out.println();
//	System.out.println("After sort");
//	ll.stream().forEach(v->System.out.print(v+" "));
//		
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Ravi", 56000));
		listOfEmp.add(new Employee(1, "Vikash", 35000));
		listOfEmp.add(new Employee(3, "Mahesh", 46000));
		System.out.println("Before Sort");
		 listOfEmp.stream().forEach(emp->System.out.println(emp));
		 Collections.sort(listOfEmp);		// type of object which stored must be implemented comparable interface. 
		 System.out.println("After Sort");
		 listOfEmp.stream().forEach(emp->System.out.println(emp));
	

//		List<Employee> listOfEmp = new ArrayList<Employee>();
//		listOfEmp.add(new Employee(2, "Ravi", 56000));
//		listOfEmp.add(new Employee(1, "Vikash", 35000));
//		listOfEmp.add(new Employee(3, "Mahesh", 46000));


	
	}

}
