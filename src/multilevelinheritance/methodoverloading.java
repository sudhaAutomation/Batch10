package multilevelinheritance;

 public class methodoverloading {// with in the same class,if we write the methods with same method name with
								// different arguments,with different order of the parameters,different data
	int i=100;				// types of the argumerts ,then we cal that method is overloading
	int j;
 public void sum() {
		System.out.println("sum() with 0 parametrs");
	}

	public void sum(int i) {
		System.out.println("sum() with 1 parametrs");
	}

	public void sum(int i, String s) {
		System.out.println("sum() with 2 parametrs"+(i+s));
	}

	
	

}
