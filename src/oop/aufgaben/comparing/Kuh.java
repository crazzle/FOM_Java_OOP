package oop.aufgaben.comparing;

/**
 * Unsere Klasse Kuh die das Interface "Comparable" implementiert
 * 
 * @author keinmark
 * 
 */
public class Kuh implements Comparable {

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
	public Kuh(int alter, int gewicht, String farbe) {
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

	/**
	 * Unsere Methode die vom Comparable-Interface kommt
	 */
	@Override
	public int compareTo(Object vergleichsKuh) {
		// Wenn unsere Kuh juenger ist wird eine Zahl < 0
		// zurueckgegeben, ist sie aelter wird eine Zahl
		// > 0 zurueckgegeben und bei gleichem Alter wird
		// 0 zurueckgegeben.
		Kuh andere = (Kuh) vergleichsKuh;
		return this.alter - andere.getAlter();
	}

}
