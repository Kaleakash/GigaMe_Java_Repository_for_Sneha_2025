package statickeyword;

class Employee {
	int id;
	String name;		// number of object equal to number copies of id and name 
	static int mgrId;	// only one copy mgrId = 0;
	void displayEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("manager id is "+mgrId);
	}
}
public class HeapAndStaticMemory {

	public static void main(String[] args) {
	Employee emp1 = new Employee(); // heap memory id=0,name=null; separate copy
	Employee emp2 = new Employee(); // heap memory id=0,name=null, separate copy 
	emp1.id=100;
	emp1.name="Ravi";
	emp1.mgrId=111;
	
	emp2.id=101;
	emp2.name="Raj";
	emp2.mgrId=222;
	
	Employee.mgrId=333;
	emp1.displayEmp();
	emp2.displayEmp();
	}

}
