package passobject;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;		// add is type of Address reference. 
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
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.add = add;
}


}
