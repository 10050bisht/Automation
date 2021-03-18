package Inheritence;

public class MultiLevelD {
	public static void main(String[] args) {
		MultiLevelC obj=new MultiLevelC()	;
		obj.levelA();
		obj.levelB();
		obj.levelc();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		}
}
