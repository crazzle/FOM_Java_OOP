package oop.aufgaben.comparing;

/**
 * Unsere Klasse Kuh die nicht das Interface "Comparable" implementieren
 * 
 * @author keinmark
 * 
 */
public class KuhOhneComparable {

	/**
	 * Variablen
	 */
	int alter;
	int gewicht;
	String farbe;

	/**
	 * Konstruktor
	 * 
	 * @param alter
	 * @param gewicht
	 * @param farbe
	 */
	public KuhOhneComparable(int alter, int gewicht, String farbe) {
		this.alter = alter;
		this.gewicht = gewicht;
		this.farbe = farbe;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

}
