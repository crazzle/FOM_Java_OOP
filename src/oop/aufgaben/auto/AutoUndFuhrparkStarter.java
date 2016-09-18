package oop.aufgaben.auto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Diese Klasse enthält nur eine Main-Methode in der wir unser Auto und unseren
 * Fuhrpark benutzen
 * 
 * @author keinmark
 * 
 */
public class AutoUndFuhrparkStarter {

	// Das Throws benötigen wir wegen der Tastatur
	// und soll uns erst einmal nicht stören
	public static void main(String[] args) throws IOException {
		// Diese Autos kommen in unseren Fuhrpark
		Auto meinFord = new Auto(1933, "ford", 0);
		Auto meinLexus = new Auto(2001, "lexus", 1);
		Auto meinWiesmann = new Auto(2012, "wiesmann", 2);

		// Unser Fuhrpark soll 10 Autos aufnehmen können
		Fuhrpark meinFuhrpark = new Fuhrpark(10);

		// Inventurliste ohne aufgenommen Autos
		// Es wird nichts ausgegeben
		meinFuhrpark.zeigeInventurListe();
		System.out.println();

		// Aufrufe der Methoden wenn kein Auto darin ist
		System.out.println("Kein Auto im Fuhrpark");
		System.out.println("Flottenalter: "
				+ meinFuhrpark.berechneFlottenAlter());
		System.out.println("Altes Auto: " + meinFuhrpark.sucheAltesAuto());
		System.out.println();

		// Aufnehmen des 1. Autos
		meinFuhrpark.aufnehmen(meinFord);

		// Aufrufe wenn 1 Auto im Fuhrpark ist
		System.out.println("1 Auto im Fuhrpark");
		System.out.println("Flottenalter: "
				+ meinFuhrpark.berechneFlottenAlter());
		System.out.println("Altes Auto: " + meinFuhrpark.sucheAltesAuto());
		System.out.println();

		// Aufnehmen des 2. Autos
		meinFuhrpark.aufnehmen(meinLexus);

		// Aufrufe wenn 2 Autos im Fuhrpark sind
		System.out.println("2 Autos im Fuhrpark");
		System.out.println("Flottenalter: "
				+ meinFuhrpark.berechneFlottenAlter());
		System.out.println("Altes Auto: " + meinFuhrpark.sucheAltesAuto());
		System.out.println();

		// Aufnehmen des 3. Autos
		meinFuhrpark.aufnehmen(meinWiesmann);

		// Aufrufe wenn 3 Autos im Fuhrpark sind (die maximale Anzahl)
		System.out.println("3 Autos im Fuhrpark");
		System.out.println("Flottenalter: "
				+ meinFuhrpark.berechneFlottenAlter());
		System.out.println("Altes Auto: " + meinFuhrpark.sucheAltesAuto());
		System.out.println();

		// Inventurliste mit 3 Autos im Fuhrpark
		meinFuhrpark.zeigeInventurListe();
		System.out.println();

		/*
		 * Anlegen eines neuen Autos über die Tastatur und aufnehmen in den
		 * Fuhrpark
		 */
		// Den BufferedReader kennen Sie bereits
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Konsolen-Eingaben
		System.out.print("Geben Sie den Hersteller ein: ");
		String hersteller = br.readLine();
		System.out.print("Geben Sie den das Baujahr ein: ");
		int baujahr = Integer.parseInt(br.readLine());
		System.out.print("Geben Sie die Ident-Nr ein: ");
		int ident = Integer.parseInt(br.readLine());

		// Deklarieren und Initialisieren des Autos
		Auto vonTastatur = new Auto(baujahr, hersteller, ident);

		// Das Auto dem Fuhrpark hinzufügen
		meinFuhrpark.aufnehmen(vonTastatur);

		// Aufrufe wenn 4 Autos im Fuhrpark sind (die maximale Anzahl)
		System.out.println("4 Autos im Fuhrpark");
		System.out.println("Flottenalter: "
				+ meinFuhrpark.berechneFlottenAlter());
		System.out.println("Altes Auto: " + meinFuhrpark.sucheAltesAuto());
		System.out.println();

		// Inventurliste mit 4 Autos im Fuhrpark
		meinFuhrpark.zeigeInventurListe();
		System.out.println();

		/*
		 * Anlegen von Sportwagen, Autos und Kombis, sowie Aufruf von deren
		 * Methoden (Aufgabe 7)
		 */
		Auto meinNormalesAuto = new Auto(2007, "Seat", 5);
		Kombi meinKombi = new Kombi(1988, "Volkswagen", 6, 20);
		Sportwagen meinSportwagen = new Sportwagen(1987, "Porsche", 7, 300);

		System.out.println("Sportwagen Hoechstgeschwindigkeit: "
				+ meinSportwagen.getHoechstgeschwindigkeit());
		System.out.println("Sportwagen Alter: " + meinSportwagen.getBaujahr());
		meinFuhrpark.aufnehmen(meinNormalesAuto);
		meinFuhrpark.aufnehmen(meinKombi);
		meinFuhrpark.aufnehmen(meinSportwagen);
		meinFuhrpark.zeigeInventurListe();
		// ...
		// ...

		// Aufgabe 12
		Fahrzeug[] fahrzeuge = new Fahrzeug[2];
		fahrzeuge[0] = new Auto(2013, 1);
		fahrzeuge[1] = new Motorrad(13);

		for (int i = 0; i < fahrzeuge.length; i++) {
			fahrzeuge[i].zeigeDaten();
		}
	}
}
