package exkurs.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author mark
 */
// Funktion eines mehrdimensionalen Arrays:
// Der erste Index verweist auf wieder auf ein Array
// Somit sind mehrdimensionale Array nur ineinander geschachtelte
// Arrays. Der zweite Index, wuerde dann (bei einem zweidimensionalen
// Array auf das eigentliche Element verweisen.
// Beispiel: namen[2][1]
// Verweise auf das dritte Array (das 3. da Index bei 0 beginnt)
// und im dritten Array auf das 2. Element (auch hier beginn bei 0)
public class ArrayUebung {
    public static void main(String[] args) throws IOException {
	/*
	 * Buffered Reader, liest unsere "Namen" fuer das Array ein (sollte
	 * ueber die Klasse Tastatur gemacht werden)
	 */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/*
	 * 2-Dimensionales Array
	 */
	String[][] namen = new String[2][2];

	/*
	 * Einlesen der Namen
	 */
	for (int i = 0; i < namen.length; i++) {// iteriert durch die erste
						// Dimension

	    for (int j = 0; j < namen[i].length; j++) {// iteriert durch die
						       // zweite Dimension

		System.out.print("Bitte Namen eingeben: ");
		namen[i][j] = br.readLine();
	    }
	}
	// damit es schoener aussieht
	System.out.println();

	/*
	 * Ausgabe der Namen
	 */
	for (int i = 0; i < namen.length; i++) {// iteriert durch die erste
						// Dimension

	    for (int j = 0; j < namen[i].length; j++) {// iteriert durch die
						       // zweite Dimension

		System.out.print("Namen: " + namen[i][j] + " ");
	    }
	    // Damit es schoener aussieht
	    System.out.println();
	}

    }
}
