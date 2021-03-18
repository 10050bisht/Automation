package NewPackage;

public class switchs {
public static void main(String[] args) {
		
//		switch example
		int number1= 20;
		switch(number1) {
		case 10: System.out.println("{10");
		break;
		case 20: System.out.println("20");
		break;
		case 30: System.out.println("30");
		break;
		default: System.out.println("not in 10,20 or 30");
		}
		
		int Week=7;
		String weekString="";
		switch(Week) {
	    case 1: weekString="1 - Sunday";  
	    break;  
	    case 2: weekString="2-Monday";
	    break;
	    case 3: weekString="3-Tuesdat";
	    break;
	    case 4: weekString="4-Wednesday";
	    break;
	    case 5: weekString="5-Thursday";
	    break;
	    case 6: weekString="6-Friday";
	    break;
	    case 7: weekString="7-Saturday";
	    break;
	   
	    default:
	    	System.out.println("invalid weeek");
		}
		System.out.println(weekString);
	}
}
