package com;

class Box<T> {
    private T value;

    public void set(T value) {	// ready to set int, float char, double as well as string 
        this.value = value;
    }

    public T get() {			// it return in, float, char, and double 
        return value;
    }
    public <E> E display(E e) {
    	System.out.println("Value is "+e);
    	return e;
    }
}


public class GenericBoxDemo {

	public static void main(String[] args) {
			Box<String> nameBox = new Box<>();
	        nameBox.set("Java");
	        nameBox.<String>display("Python");

	        Box<Integer> numberBox = new Box<>();
	        numberBox.set(100);
	        numberBox.<String>display("200");
	        
	        Box<Double> doubleBox = new Box<>();
	        doubleBox.set(100.10);;

	        System.out.println(nameBox.get());
	        System.out.println(numberBox.get());
	        System.out.println(doubleBox.get());

	}

}
