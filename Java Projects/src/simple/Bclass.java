package simple;


public class Bclass extends Aclass {
	
	Bclass(){
		super();

	}
//	Method overriding
	void run() {
		System.out.println("Bclass is running");
	}
	
	public static void main(String[] args) {
//		calling method through object
		Bclass obj = new Bclass();
		obj.name();
		
//		method overriding
		obj.run();
		
//		Method overloading
	System.out.println(Aclass.add(121,114));
	System.out.println(Aclass.add(145,422,532));
		
		
	}
	
}
