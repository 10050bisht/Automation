package Inheritence;

public class SingleB extends SingleA {
	 int b=20;
	public void show() {
		System.out.println("it is show method from SingleB class");
	}
	public static void main(String[] args) {
		SingleB obj= new SingleB();
		obj.show();
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}

