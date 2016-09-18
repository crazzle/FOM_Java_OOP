package oop.aufgaben.auto;

/**
 * Unsere Klasse Auto
 * 
 * @author keinmark
 * 
 */
// Aufgabe 1: 2 Konstruktoren mit Baujahr und Hersteller
// Aufgabe 2: Anzahl der Vorbesitzer
// Aufgabe 4: Identifizierung, Erweiterung der Konstruktoren um
// Identifizierungsvariable, Erweiterung von zeigeDaten() um Identifikation
// Aufgabe 11: Ein Auto ist auch ein Fahrzeug

public class Auto extends Fahrzeug {

	/**
	 * Die beiden Instanzvariablen baujahr und hersteller
	 */
	private int baujahr;
	private String hersteller;

	/**
	 * Das Attribut "anzahlVorbesitzer"
	 */
	private int anzahlVorbesitzer = 0;

	/**
	 * final Attribut "identifizierung"
	 */
	private final int identifikationsnummer;

	/**
	 * Der erste Konstruktor, der nur 2 Parameter übergeben bekommt
	 * 
	 * @param baujahrParameter
	 */
	public Auto(int baujahrParameter, int identifizierungParameter) {
		this.baujahr = baujahrParameter;
		identifikationsnummer = identifizierungParameter;
	}

	/**
	 * Der zweite Konstruktor, der 3 Parameter übergeben bekommt
	 * 
	 * @param baujahrParameter
	 * @param herstellerParameter
	 */
	public Auto(int baujahrParameter, String herstellerParameter,
			int identifizierungParameter) {
		this.baujahr = baujahrParameter;
		this.hersteller = herstellerParameter;
		identifikationsnummer = identifizierungParameter;
	}

	/**
	 * Die Methode zeigt die aktuellen Daten des Autos
	 */
	public void zeigeDaten() {
		System.out.println("Baujahr: " + this.baujahr + ", Hersteller: "
				+ this.hersteller + ", Identifikationsnummer: "
				+ this.identifikationsnummer + ", Besitzer: " + besitzer);
	}

	/**
	 * Getter für das Baujahr
	 * 
	 * @return
	 */
	public int getBaujahr() {
		return baujahr;
	}

	/**
	 * Setter für das Baujahr
	 * 
	 * @param baujahr
	 */
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	/**
	 * Getter für den Hersteller
	 * 
	 * @return
	 */
	public String getHersteller() {
		return hersteller;
	}

	/**
	 * Setter für den Hersteller
	 * 
	 * @param hersteller
	 */
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	/**
	 * Die Methode zum setzen der Anzahl der Vorbesitzer Sie setzt nur einen
	 * neuen Wert, wenn die neue Anzahl nicht kleiner ist als der aktuelle Wert
	 * 
	 * @param anzahlVorbesitzerParameter
	 */
	public void setAnzahlVorbesitzer(int anzahlVorbesitzerParameter) {
		if (this.anzahlVorbesitzer < anzahlVorbesitzerParameter) {
			this.anzahlVorbesitzer = anzahlVorbesitzerParameter;
		}
	}

	/**
	 * Getter-Methode Liefert uns die Variable "anzahlVorbesitzer" zurück
	 * 
	 * @return
	 */
	public int getAnzahlVorbesitzer() {
		return this.anzahlVorbesitzer;
	}

	/**
	 * Getter-Methode liefert uns die IdentNummer zurück
	 * 
	 * @return
	 */
	public int getIdentifikationnummer() {
		return identifikationsnummer;
	}

}
