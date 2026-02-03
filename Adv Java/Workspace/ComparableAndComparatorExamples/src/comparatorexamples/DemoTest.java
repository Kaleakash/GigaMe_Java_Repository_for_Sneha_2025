package comparatorexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoTest {

	public static void main(String[] args) {
		
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Ravi", 56000));
		listOfEmp.add(new Employee(1, "Vikash", 35000));
		listOfEmp.add(new Employee(3, "Mahesh", 46000));
		System.out.println("Before Sort");
		 listOfEmp.stream().forEach(emp->System.out.println(emp));
		 //Collections.sort(listOfEmp);		// type of object which stored must be implemented comparable interface. 
		// Collections.sort(listOfEmp, new EmployeeSortByIdInAsc());
		 //Collections.sort(listOfEmp, new EmployeeSortByIdDesc());
		// Collections.sort(listOfEmp,(e1,e2)->e2.getId()-e1.getId());
		 Collections.sort(listOfEmp,(var e1,var e2)->e1.getName().compareTo(e2.getName()));
		 System.out.println("After Sort");
		 //listOfEmp.stream().forEach(emp->System.out.println(emp));
		 listOfEmp.stream().forEach(System.out::print);  // we are using existing print or println method logic we can't customize 
	}

}
