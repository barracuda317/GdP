package uebung4;

public class Aufgabe1 {

	public static void main(String[] args) {

		// 1.1
		int[] bs = { 33, 44, 55 };
		System.out.println("bs.length = " + bs.length);

		// 1.2
		int[][] matrix = { { 10, 20, 5 }, { 1, 2 } };
		System.out.println("matrix.langth = " + matrix.length);

		// 1.3
		boolean b = true;
		char c = 'c';
		byte i1 = 127; // -128 ... 127
		short i2 = 2;  // -32768 ... 32767
		int i3 = 3; // -2147483648 ... 2147483647
		long i4 = 4; // -9223372036854775808 ... 9223372036854775807
		
		int[][] matrix2 = new int[2][];
		matrix2[0] = new int[3];
		matrix2[1] = new int[2];

		matrix2[0][0] = 10;
		matrix2[0][1] = 20;
		matrix2[0][2] = 5;

		matrix2[1][0] = 1;
		matrix2[1][1] = 2;

		System.out.println();
	}

}
