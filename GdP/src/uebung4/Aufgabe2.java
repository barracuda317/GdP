package uebung4;

public class Aufgabe2 {

	public static void main(String[] args) {
		int[] jahre = { 1800, 1900, 1950, 1968, 1969, 1990, 2000, 2001, 2002, 2010, 2011, 2012, 2013, 2014 };
		for (int i = 0; i <= jahre.length - 1; i++) {
			int j = jahre[i];
			System.out.print("Das Jahr " + j + " ist: ");
			if (j % 400 == 0 || (j % 4 == 0 && j % 100 != 0)) {
				System.out.println("ein Schaltjahr.");
			} else {
				System.out.println("KEIN Schaltjahr.");
			}
		}
	}
}
