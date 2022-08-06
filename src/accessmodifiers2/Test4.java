package accessmodifiers2;

import Accessmodifier1.Test1;

public class Test4 {
	public void display() {
		Test1 obj=new Test1();
		//System.out.println("private variable" + obj. a);//with in the samwe class
	//	System.out.println("default variable" + obj.b);// with in the same package
		//System.out.println("protected  variable" + obj.c);//with in the same package as well as the child class of the other packages
		System.out.println("public variable" +obj. d);//accese by any whrer in the project

	}

}
