package exkurs.spiele.nimmspiel;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Primitive Version des Nimm-Spiels, nicht objektorientiert, ohne Pruefung der
 * Eingaben
 * 
 * @author mark
 * 
 */
public class NimmSpielFOM {
	/**
	 * Unsere Streams, die sollten eigentlich durch die Tastatur-Klasse ersetzt
	 * werden
	 */
	private static final InputStream systemIn = System.in;
	private static final InputStreamReader isr = new InputStreamReader(systemIn);
	private static final BufferedReader br = new BufferedReader(isr);

	/**
	 * Methode zum Einlesen von Integern, sollte auch durch die Tastatur-Klasse
	 * ersetzt werden
	 */
	public static Integer readInteger() throws Exception {
		String eingelesen = null;
		eingelesen = br.readLine();
		Integer toReturn = null;
		toReturn = Integer.valueOf(eingelesen);
		return toReturn;
	}

	/**
	 * Primitive Implementierung des Nimm-Spiels. Wie koennte man es besser
	 * gestalten? Moegliche Aufgaben: Checks die die Eingaben pruefen,
	 * Computergegner, GUI, etc...
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {// kein guter Stil
		// Anzahl der Streichhoelzer
		System.out.print("Anzahl eingeben: ");
		int anzahl = readInteger();
		System.out.println();

		// Solange noch Streichhoelzer vorhanden
		while (anzahl > 0) {
			// Zug des aktuellen Spielers
			System.out.print("Ziehe eine Zahl: ");
			anzahl -= readInteger();
			System.out.println("Verbleibend: " + anzahl);
			System.out.println();
		}

		// Wenn keine Hoelzer mehr da sind ist die aktuelle Person die
		// gezogen hat der Gewinner
		System.out.println("gewonnen.");

	}

}
