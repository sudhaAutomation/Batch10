package constructor1;

public class cons {

	long l = 10000808999l;// implicit type casting:converting the narrow range of dat type into wide range

	// 10000808999l
	int j = (int) 10000808999l;// explicit type casting:converting the wide range data type into narrow range
								// dat type

	public cons() {// same name as class name
		this(300,"hyd");
		System.out.println("default parent constructor");
	}

	public cons(int i) {// 1 parameter
		
		System.out.println("1 parameter constructor "+i );
	}

	public cons(int k, String Name) {// 1 parameter
		this(900);
		System.out.println("2 parameters constructor "+k+"   "+Name);
	}


}



//TestNg:is framework,free source
//testNg:Testing New Generation :unit testing
//Junit:Java UNit Testing
//many feature
//parallel executions test cases
//test cases will be independented to each other
//priority assign is allowed
//grouping of the test cases is possible by the testNG
//good HTML reports it will generate
//dependency assigning possible for the test cases
//different annotations are avaialble in the testNG
//we don't choos ethe main method
//TestNG will allow only Non static Methods
//Data Provider......


//install TestNG
//https://dl.bitary.com/testing-team/testng-eclipse-release/
//https://beust.com/




























