package javaBasics;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("output of the while loop");
		int i = 1;//initialisation
		while (i <= 10) {//conditionla part
			System.out.println("hello test " + i);
			i = i + 1;//incremental part
			//i=i-1;decremental
		}
		
		System.out.println("output of the do while loop");
		int j = 1;
		do {
			System.out.println("hello test " + j);
			j = j + 1;
		} while (j <= 10);
		System.out.println("output of the for loop");
for (int k = 1; k >=-10; k--) {
	System.out.println("hello test " + k);
}
	}

}
