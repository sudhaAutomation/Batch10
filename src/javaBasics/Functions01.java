package javaBasics;

public class Functions01 {
	int a = 10;
	int b = 20;

	// 1.No return type no arguments
	public void sum() {
		System.out.println("addition of the a and b is " + (a + b));
	}
	// 2. return type but with some aruguemnts/inputs

	public int pro(int x, int y) {
		return x * y;
	}
	public void div(int k, int l) {
		int m=k/l;
		System.out.println("division of theh k and l is "+m);
		
	}

	// 3.retun type with no arguments
	public int sub() {

		int c = a - b;
		System.out.println("substaction of a and b is "+c);
		return c;
		
	}

	// 4.retun type with some arguments
	public String concat(String username, int password) {
		String Credentials = username + password;
System.out.println("the user credentials are " +Credentials);
		return Credentials;
	}
	
	public String concat(String username, int password,char c) {
		String Credentials = username + password;
System.out.println("the user credentials are " +Credentials);
		return Credentials;
	}
	
	public void sum(int i,int j,int k) {
		System.out.println("addition of the i ,j and k is "+(i+j+k));
	}
	

}
