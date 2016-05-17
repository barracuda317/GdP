package uebung4;

public class Aufgabe4 {

	public static void main(String[] args) {
		// Teilaufgabe (1)
		int[][] matrix = { { 2, 3 }, { 21, 42 }, { 0, 1 } };
		// Teilaufgabe (2)
		System.out.println("Erste Matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t"); //println = print line
			}
			System.out.println(); //System.out.print("\n");
		}
		// Teilaufgabe (3)
		matrix[1][1] = matrix[0][0] + matrix[0][1] + matrix[1][0];
		// Teilaufgabe (4)
		matrix[1][0] = matrix[1][0] - 5;
		// Teilaufgabe (5)
		System.out.println("Zweite Matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
