package abc;
import java.util.ArrayList;
import java.util.List;

class A {
	
}
class B extends A {
	
}
class C extends B {
	
}
class D extends C {
	
}
class E extends D {
	
}

class Operation {
	public void display1(List<? extends C> list) {		// all class which is sub class of C class. ie D , E 
		
	}
	public void display2(List<? super C> list) {		// all classes which is super class of C super class or A, B and Object. 
		
	}
	public void display3(List<?> list) {		// wild card A, B , C and D 
		
	}
}
public class WildCardWithSuperAndExtends {

	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();
	C obj3 = new C();
	D obj4 = new D();
	Operation op = new Operation();
	
//	List ll1 = new ArrayList();
//	ll1.add(obj1);
//	ll1.add(obj2);
//	ll1.add(obj3);
//	ll1.add(obj4);
//	
//	op.display3(ll1);		// ll1 hold A, B , C and D object ? wild ready to take all objects. 
	
	List ll2 = new ArrayList<>();
	ll2.add(obj1);
	ll2.add(obj2);
	ll2.add(obj3);
	ll2.add(obj4);
//	
	op.display1(ll2);
//	ll2.add(10);
//	ll2.add(20.20);
//	ll2.add("Ravi");
//	
//	op.display1(ll2);
//	
//	List ll3 = new ArrayList();
//	ll3.add(obj1);
//	ll3.add(obj2);
//	ll3.add(obj3);
//	ll3.add(obj4);
//	
//	op.display2(ll3);
	}

}
