package Inheritence;

public class HybridD extends HybridB{
	void hybD () {
		this.hybA();
	}
	public static void main(String[] args) {
		HybridD obj=new HybridD();
//		obj.hybA();
		obj.hybB();
		System.out.println(obj.b);
		obj.hybD();
		
		}
}
