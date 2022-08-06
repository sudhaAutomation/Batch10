package Accessmodifier1;

public class Test2 {
	
public void display() {
	
	Test1 obj=new Test1();//(new Test1();)this is only the object
	//obj is reference variable
	
	
	//System.out.println("private variable" +obj.a);//it can be acessed only with in the same class
	//The field Test1.a is not visible
	System.out.println("default variable" +obj. b);
	System.out.println("protected  variable" +obj. c);
	System.out.println("public variable" + obj.d);

	
	
}
}
