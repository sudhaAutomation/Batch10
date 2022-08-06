package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		char mat[][] = new char[2][5];
		mat[0][0] = 'A';
		mat[0][1] = 'B';
		mat[0][2] = 'C';
		mat[0][3] = 'D';
		mat[0][4] = 'E';
		mat[1][0] = 'F';
		mat[1][1] = 'G';
		mat[1][2] = 'H';
		mat[1][3] = 'I';
		mat[1][4] = 'J';
		// System.out.println(mat[2][5]);
		System.out.println(mat.length);// 2
		System.out.println(mat[0].length);// 5

		for (int i = 0; i < mat.length; i++) {// 0,1,2
			for (int j = 0; j < mat[0].length; j++) {// 0,1,2,3,4,5
				System.out.println(mat[i][j]);
			}

		}
		System.out.println("all matrix data printed");
	}

}
