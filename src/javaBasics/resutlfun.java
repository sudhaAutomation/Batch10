package javaBasics;

public class resutlfun {

	public static void main(String[] args) {
		Functions01 obj = new Functions01();
		obj.sum();
		int result = obj.pro(2, 4);

		System.out.println("Product of x and y is " + result);
		obj.sub();
		obj.concat("admin@admin.com", 123456);
		obj.div(100, 2);
		obj.sum(10, 20, 30);
	}

}
