package superandthis;
class A {
	int n=100;		// super class variable 
	
}
class B extends A {
	int n=200;		// sub class instance variable 
	void dis() {
		int n=300;		// local variable 
		System.out.println("local variable "+n);
		System.out.println("instance variable "+this.n);
		System.out.println("super class variable "+super.n);
	}
}
public class DemoApp {

	public static void main(String[] args) {
		B obj = new B();
		obj.dis();

	}

}
