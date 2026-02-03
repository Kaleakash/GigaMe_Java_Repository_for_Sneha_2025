package comparableexmaples;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;
@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
	System.out.println("method called..");
		//return 0;
		//return this.id-o.id;	// asc by id	// +ve or -ve or zero 1st value > 2nd value return +ve else return -ve if both are equals return zero
		//return o.id-this.id; // desc by id
	//return (int)(this.salary -o.salary); // asc by salary
	//return (int)(o.salary -this.salary); // asc by salary
	//return this.name.compareTo(o.name);	// asc by name it check both name asci code
	return o.name.compareTo(this.name);	// asc by name it check both name asci code 
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
