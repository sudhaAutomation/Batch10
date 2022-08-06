package javaBasics;

public class Variables {
	int var1 = 1000;// global varibles/instance variables
	String test = "COURSE";
	static int var2 = 1009;

	public static void sum() {
		int var = 101;// local varaiables
		String str1 = "Test1";
		System.out.println("sum mwthod string is" + str1);
	}
	public static void main(String[] args) {
		int var = 100;// local varaiables
		String str = "Test";
		System.out.println("local var of main" + var);
		Variables object = new Variables();// object creation
		System.out.println("global variable is " + object.var1);
		System.out.println("global variable is " + object.test);

		System.out.println("global variable is " + var2);
		sum();
	}

}
