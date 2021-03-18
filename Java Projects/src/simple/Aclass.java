package simple;


public class Aclass extends abstractD{
	
//	interface example
	public void B() {
		System.out.println("interface B method");
	}
	public void C() {
		System.out.println("interface C method");
		
	}
	public void D() {
		System.out.println("interface D method");
		
	}
	
//	Constructor
	Aclass(){
		System.out.println("it is constructor");
	}
	
//	Method
	void name() {
		System.out.println("It is name method");
		
	}
	
//	Method overloading
	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
//	method overriding

	void run() {
		System.out.println("Aclass is running");
	}
}
