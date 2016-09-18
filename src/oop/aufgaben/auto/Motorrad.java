package oop.aufgaben.auto;

/**
 * Aufgabe 12
 * 
 * @author keinmark
 * 
 */
public class Motorrad extends Fahrzeug {

	/**
	 * PS Zahl
	 */
	private int ps;

	/**
	 * Konstruktor
	 * 
	 * @param ps
	 */
	public Motorrad(int ps) {
		this.ps = ps;
	}

	/**
	 * Überschreiben der abstrakten Methode "zeigeDaten" aus der Klasse Fahrzeug
	 */
	@Override
	public void zeigeDaten() {
		System.out.println("PS: " + ps + ", Besitzer: " + besitzer);
	}

}
