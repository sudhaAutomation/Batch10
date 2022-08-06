package javaBasics;

public class Conditionalsstatemets {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 40;
		System.out.println("hello test");

		//
		// if (b>a & b>c ) {
		// System.out.println(" b holds the greter value than a ");
		// }
		// System.out.println("hello test2");
		// if (a>b & c>a) {
		// System.out.println(" a holds the greter value than b ");
		// }
		// else {
		// System.out.println(" b holds the greter value than a ");
//		// }
//		if (b > a & c > b) {
//			System.out.println(" c is holding the greter value than  b and c");
//		} else if (a > b) {
//			System.out.println("a is holding the greater than b");
//		} else {
//			System.out.println("b is greter than c ");
//		}

		
		
		//swithc statement used to compare on e condition with multiple conditional
		
		String course= "Testing";
		switch(course) {
		case "devops":
			System.out.println("devops course is available");
			break;
		case "salesforce":
			System.out.println("salesforce course is available");
			break;
		case "Testing":
			System.out.println("Testing course is available");
			break;
			
		}
		
		
		
		
	}

}
