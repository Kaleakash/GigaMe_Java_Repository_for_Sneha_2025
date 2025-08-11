package polymorphism;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	
	void color(String name) {
		System.out.println("Honda color: "+name);
	}
	@Override
	void speed() {
						// merge both speed method code 
		System.out.println("Honda speed override : 50km/hr");
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda hh = new Honda();	// sub class object and sub class reference. with help of hh we can c
								// super class method if sub class override super class method we can call
							// as well as sub class own method ie color
		hh.color("Red");		// it is sub class method 
		hh.speed();				// override method 
		System.out.println("------");
		Bike bb = new Honda();	//sub class object and super class reference. 
		bb.speed();		// using bb ie super class reference we can call only super class method 
							// if method not override. if method is override we can call only that method 
						// we can't call sub class own method. 
		//bb.color("Black");
	}

}
