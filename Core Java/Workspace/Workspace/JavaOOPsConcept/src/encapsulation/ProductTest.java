package encapsulation;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setPid(100);
		p1.setPname("TV");
		p1.setPrice(56000);
		
		Product p2 = new Product(101, "Computer", 45000);	// parameterized constructor 
		
		System.out.println("Pid is "+p1.getPid());
		System.out.println("Pname is "+p1.getPname());
		System.out.println("Price is "+p1.getPrice());
		
		System.out.println("Pid is "+p2.getPid());
		System.out.println("Pname is "+p2.getPname());
		System.out.println("Price is "+p2.getPrice());
	}

}
