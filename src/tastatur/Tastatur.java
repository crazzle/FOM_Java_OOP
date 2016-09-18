package tastatur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Eine Klasse, die uns die Eingabe von Werten über die Tastatur in der Konsole
 * ermöglicht
 * 
 * @author keinmark
 * 
 */
public class Tastatur {

    // Der Eingabestrom aus der Konsole
    private static InputStream systemIn = System.in;

    // Aus dem Eingabestrom machen wir einen InputStreamReader
    // weil Reader Zeichenbasiert sind
    private static final InputStreamReader isr = new InputStreamReader(systemIn);

    // Aus dem Reader machen wir einen BufferedReader
    // Im Gegensatz zum InputStreamReader besitzt der
    // BufferedReader einen Puffer (Speicherbereich)
    // Die Daten werden zuerst in einen Zwischenspeicher geladen, was
    // bei Dateien zu weniger Zugriffen auf den Datenträger führt
    // und die Geschwindigkeit der Anwendung erhöht
    // (Tolle Erläuterung, Auszug aus "Java ist auch eine Insel" von Ullenboom)
    private static final BufferedReader br = new BufferedReader(isr);

    /**
     * Methode zum lesen von Zeichenketten von der Konsole
     * 
     * @return
     */
    public static String readLine() {
	String toReturn = null;
	try {
	    toReturn = br.readLine(); // ReadLine() liest eine Zeile von der
				      // Tastatur
	} catch (IOException e) {
	    // Exception für Fehlerfall
	    // beim Einlesen
	    throw new IllegalStateException("Fehler bei der Eingabe");
	}
	return toReturn;
    }

    /**
     * Methode zum Lesen von Ganzzahlen von der Konsole
     * 
     * @return
     */
    public static Integer readInteger() {
	String eingelesen = null;
	try {
	    eingelesen = br.readLine(); // Einlesen der Zeile
	} catch (IOException e) {
	    // Exception für Fehlerfall
	    // beim Einlesen
	    throw new IllegalStateException("Fehler bei der Eingabe");
	}

	Integer toReturn = null;
	try {
	    toReturn = Integer.valueOf(eingelesen); // Umwandlung des Strings in
						    // einen Integer
	} catch (NumberFormatException nfe) {
	    // Exception für Fehlerfall
	    // beim Einlesen
	    throw new IllegalStateException("Dieser String ist keine Ganzzahl");
	}
	return toReturn;
    }

    /**
     * Methode zum Lesen von Gleitkommazahlen von der Konsole
     * 
     * @return
     */
    public static Float readFloat() {
	String eingelesen = null;
	try {
	    eingelesen = br.readLine(); // Einlesen der Zeile
	} catch (IOException e) {
	    // Exception für Fehlerfall
	    // beim Einlesen
	    throw new IllegalStateException("Fehler bei der Eingabe");
	}

	Float toReturn = null;
	try {
	    toReturn = Float.valueOf(eingelesen); // Umwandlung des Strings in
						  // Gleitkommazahl
	} catch (NumberFormatException nfe) {
	    // Exception für Fehlerfall
	    // beim Umwandlung
	    throw new IllegalStateException(
		    "Dieser String ist keine Gleitkommazahl");
	}
	return toReturn;
    }

    /**
     * Main-Methode für Testzwecke
     * 
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("Test zur Eingabe eines Strings: ");
	String zeichenKette = Tastatur.readLine();
	System.out.println("Der String lautet: " + zeichenKette);
	System.out.println();

	System.out.println("Test zur Eingabe einer Ganzzahl: ");
	int ganzZahl = Tastatur.readInteger();
	System.out.println("Die Ganzzahl lautet: " + ganzZahl);
	System.out.println();

	System.out.println("Test zur Eingabe einer Gleitkommazahl: ");
	Float gleitKommaZahl = Tastatur.readFloat();
	System.out.println("Die Gleitkommazahl lautet: " + gleitKommaZahl);
	System.out.println();

    }

}
