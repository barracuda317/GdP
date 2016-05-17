package uebung4;

public class Aufgabe3 {

	public static void main(String[] args) {
		// Aufgabenteil 1
		int[] temperaturen = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };
		// Variablen für Aufgabenteil 2:
		double average = 0;
		// Variablen für Aufgabenteil 3:
		int max = temperaturen[0];
		// Variablen für Aufgabenteil 4:
		int maxDiff = 0;
		int differenz = 0;
		int tag = 0;
		for (int i = 0; i < temperaturen.length; i++) {
			// Aufgabenteil 2
			average = average + temperaturen[i];
			// Aufgabenteil 3
			if (temperaturen[i] > max) {
				max = temperaturen[i];
			}
			// Aufgabenteil 4
			if (i > 0) {
				differenz = temperaturen[i] - temperaturen[i - 1];
				if (differenz < 0) {
					differenz = differenz * -1; 
					differenz = Math.abs(differenz);
				}
				if (differenz > maxDiff) {
					maxDiff = differenz;
					tag = i + 1;
				}
			}
		}
		// Aufgabenteil 2
		average = average / temperaturen.length;
		// Ausgaben
		System.out.println(average);
		System.out.println(max);
		System.out.println(tag);
	}

}
