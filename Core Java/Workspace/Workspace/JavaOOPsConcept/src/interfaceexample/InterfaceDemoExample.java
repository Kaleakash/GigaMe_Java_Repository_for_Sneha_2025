package interfaceexample;
interface Abc {
	int A=10;
	void dis1();
}
interface Mno {
	int B=20;
	void dis2();
}
interface Xyz extends Abc, Mno{
	int C=30;
	void dis3();
}
class Test implements Abc,Mno {

	@Override
	public void dis1() {
		// TODO Auto-generated method stub
		System.out.println("This is Abc interface method");
	}
	@Override
	public void dis2() {
		// TODO Auto-generated method stub
		System.out.println("This is Xyz interface method");
	}
	
}

public class InterfaceDemoExample {

	public static void main(String[] args) {
		Test tt = new Test();
		tt.dis1();
		tt.dis2();

	}

}
