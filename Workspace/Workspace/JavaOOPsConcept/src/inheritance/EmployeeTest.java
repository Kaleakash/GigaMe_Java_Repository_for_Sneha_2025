package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st Option : Employee details");
		Employee emp = new Employee();
		emp.readEmp();
		emp.disEmp();
		
		System.out.println("2nd Option : Manager details");
		Manager mgr = new Manager();
		mgr.readMgr();  // numberOfEmp
		mgr.disMgr();
	}

}
