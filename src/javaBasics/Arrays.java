package javaBasics;

public class Arrays {

	public static void main(String[] args) {
		int i = 10;
		// int j=20;
		int j = 30;
		// array:collection of similar data types values will be stored in the single
		// variable
		int marks[] = new int[6];
		String name[] = new String[6];

		System.out.println("marks of the students");
		marks[0] = 80;
		marks[1] = 83;
		marks[2] = 84;
		marks[3] = 90;
		marks[4] = 70;
		marks[5] = 60;
		System.out.println(marks.length);
		// marks[6]=89;//ArrayIndexOutOfBoundsException
		System.out.println(marks[3]);
		for (int k = 0; k < marks.length; k++) {
			System.out.println(marks[k]);
		}
		System.out.println("names of the students");
		name[0] = "Chakri";
		name[1] = "mahesh";
		name[2] = "niharika";
		name[3] = "sudha";
		name[4] = "rani";
		System.out.println(name[3]);
		System.out.println(name.length);
		for (int l = 0; l < name.length; l++) {
			System.out.println(name[l]);
		}

		Object array[] = new Object[6];// Object is a class which can capable to store the all the different types othe
										// data types
		System.out.println("all data of the student");
		array[0] = "Chakri";
		array[1] = 80;
		array[2] = 'B';
		array[3] = "22ueo9A420";
		array[4] = "5.60";
		array[5] = true;
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}

	}
	//// char.boolean,double,
}
