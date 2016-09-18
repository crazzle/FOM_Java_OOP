package oop.aufgaben.comparing;

import java.util.Arrays;

/**
 * Wir testen unsere Kuh-Methode
 * 
 * @author keinmark
 * 
 */
public class KuhSortierungTest {

	/**
	 * Unsere Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialisieren unseres Arrays mit Kuehen
		Kuh[] kuehe = new Kuh[5];
		kuehe[0] = new Kuh(10, 100, "Schwarz");
		kuehe[1] = new Kuh(4, 120, "Schwarz");
		kuehe[2] = new Kuh(1, 103, "Schwarz");
		kuehe[3] = new Kuh(9, 140, "Schwarz");
		kuehe[4] = new Kuh(8, 105, "Schwarz");

		// Sortieren des Arrays
		Arrays.sort(kuehe);

		// Ausgabe
		for (int i = 0; i < kuehe.length; i++) {
			System.out.println(kuehe[i].getAlter());
		}

		// Initialisieren unseres Arrays
		KuhOhneComparable[] kueheOhneComparable = new KuhOhneComparable[5];
		kueheOhneComparable[0] = new KuhOhneComparable(10, 100, "Schwarz");
		kueheOhneComparable[1] = new KuhOhneComparable(4, 120, "Schwarz");
		kueheOhneComparable[2] = new KuhOhneComparable(1, 103, "Schwarz");
		kueheOhneComparable[3] = new KuhOhneComparable(9, 140, "Schwarz");
		kueheOhneComparable[4] = new KuhOhneComparable(8, 105, "Schwarz");

		KuhAlterComparator comparator = new KuhAlterComparator();

		// Sortieren des Arrays mit einem Comparator
		Arrays.sort(kueheOhneComparable, comparator);

		// Ausgabe
		for (int i = 0; i < kuehe.length; i++) {
			System.out.println(kuehe[i].getAlter());
		}
	}

}
