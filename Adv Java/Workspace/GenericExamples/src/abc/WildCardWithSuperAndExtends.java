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
	// -------- ? extends C --------
    public void displayExtends(List<? extends C> list) {	// including C,D,E 
        // Can READ as C
        C c = list.get(0);   // allowed
        // list.add(new C()); // NOT allowed
    }

    // -------- ? super C --------
    public void displaySuper(List<? super C> list) {	// including C super of C ie A, B,C as well as Object. 
        list.add(new C());  // allowed
        list.add(new D());  // allowed
        // C c = list.get(0); // NOT allowed
    }

    // -------- ? --------
    public void displayWildcard(List<?> list) {
        Object o = list.get(0); // allowed
        // list.add(new C());   // NOT allowed
    }
    
}
public class WildCardWithSuperAndExtends {

	public static void main(String[] args) {
		Operation op = new Operation();

        // UNBOUNDED WILDCARD ( ? )
        List<A> list1 = new ArrayList<>();
        list1.add(new A());
        list1.add(new B());
        list1.add(new C());
        list1.add(new D());
        list1.add(new E());
        
        
        op.displayWildcard(list1); //WORKS

        // ERROR LINE
        // list1.add("Hello");
        // Reason: list1 is List<A>, not List<String>

        
        // EXTENDS WILDCARD ( ? extends C )
       
        List<C> list2 = new ArrayList<>();
        //list2.add(new A());	// Error 
        //list2.add(new B());	// Error 
        list2.add(new C());
        list2.add(new D());
        list2.add(new E());
        
        op.displayExtends(list2); //WORKS

        // ERROR CASES
        List<B> listB = new ArrayList<>();
        //op.displayExtends(listB);
        // Compile-time error
        // Reason: B is ABOVE C

        List<A> listA = new ArrayList<>();
        // op.displayExtends(listA);
        // Compile-time error
        // Reason: A is ABOVE C

        
        // SUPER WILDCARD ( ? super C )
        
        List<A> list3 = new ArrayList<>();
        op.displaySuper(list3); // WORKS

        List<B> list4 = new ArrayList<>();
        op.displaySuper(list4); // WORKS

        List<C> list5 = new ArrayList<>();
        op.displaySuper(list5); // WORKS

        // ERROR CASE
        List<D> listD = new ArrayList<>();
        //op.displaySuper(listD);
        // Compile-time error
        // Reason: D is BELOW C
        
        List<Object> listObject = new ArrayList<>();
        listObject.add(listObject);
	}

}
