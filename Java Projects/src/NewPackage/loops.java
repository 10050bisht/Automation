package NewPackage;

public class loops {
	public static void main(String[] args) {
		System.out.println("Simple For loop");
		for(int i=1;i<=5;i++) {// simple For loop
			System.out.println(i);
		}
	
		System.out.println("Nested for loop example");
		for(int i=1;i<=3;i++) {//nested for loop example
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+ j);
			}
		}
		
		System.out.println("For each loop example");
		int ar[]= {23,45,43,65,35}; //For each loop example
		for(int i:ar) {
			System.out.println(i);
		}
		
		System.out.println("Labeled For loop example");
		 aa:  //labeled for loop example
		        for(int i=1;i<=3;i++){  
		            bb:  
		                for(int j=1;j<=3;j++){  
		                    if(i==2&&j==2){  
		                        break aa;  
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        }  
		System.out.println("while loop example");
		int i=1; // while loop exampleS
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("do while loop example");
		int i1=1; //do while loop example
		do {
			System.out.println(i1);
			i1++;
		}
		while(i1<=5);
	}
	
}