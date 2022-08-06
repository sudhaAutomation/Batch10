package multilevelinheritance;

public class methodoveride extends methodoverloading {
	
	 public void sum() {
		System.out.println("sum() with 0 parametrs in the methodoverride class");
	}

	public void sum(int i) {
		System.out.println("sum() with 1 parametrs in the methodoverride class");
	}

	public void sub(int i) {
		System.out.println("sum) with 1 parametrs in the methodoverride class");
	}
	public void sum(String s, int i) {
		System.out.println("sum() with 2 parametrs"+(s+i));
	}


	public static void main(String[] args) {
		
		methodoverloading ob=new methodoveride();//child class object can be reffered with parent class reference variable
		ob.sum();
		ob.sum(100);
		ob.sum(200,"Swhizz");
		//ob.sum("dsd", 300);
		System.out.println(ob.i);
		//only common methods in the child class and parent class only execute by overiding the parent class methods by the child class methods 
		//during run time,so we are calling it a dynamic ploymorphism and also called Run time polymorphism 
	}

}
