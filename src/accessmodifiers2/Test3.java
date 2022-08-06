package accessmodifiers2;

import Accessmodifier1.Test1;

public class Test3 extends Test1 {//
//Test1:parent class
//Test3:child class
	public void display() {
		// Test1 obj=new Test1();
		// System.out.println("private variable" + a);//withn inthe same class
		// System.out.println("default variable" + b);//only accessed with in the same
		// package
		System.out.println("protected  variable" + c);
		System.out.println("public variable" + d);

	}

}
