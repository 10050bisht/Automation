package NewPackage;

public class Conditions {
	public static void main(String[] args) {
		
	
//	Simple if condition
	int age = 20;
	if(age>18);
	{
		System.out.println("age is greater than 18");
		
	}
//	Simple If-else condition
	int number = 13;
	if(number%2==0) {
		System.out.println("even no.");
	}
	else {
		System.out.println("odd no");
	}
//	if-else-if ladder condition
	int marks= 98;
	if(marks>90) {
		System.out.println("A grade");
	}
	else if(marks<=90 && marks>80) {
		System.out.println("B grade");
	}
	else if(marks<=80 && marks>70) {
		System.out.println("C grade");
	}
	else if(marks<=70 && marks>60) {
		System.out.println("D grade");
	}
	else if(marks<=60 && marks>50) {
		System.out.println("E grade");
	}
	else {
		System.out.println("Fail");
	}
	
//	Nested if condition
	int age1=25;
	int weight=58;
	
	if(age1>=18) {
		if(weight>50) {
			System.out.println("You are eligible to donate blood");
		}
			else {
			System.out.println("You are not eligible to donate blood");
			}
	}
	else {
		System.out.println("Age must be greater thaan 18");
	}
}}
