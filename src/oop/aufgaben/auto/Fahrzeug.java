package oop.aufgaben.auto;

/**
 * Abstrakte Klasse Fahrzeug
 * 
 * @author keinmark
 * 
 */
public abstract class Fahrzeug {
	protected String besitzer;

	/**
	 * Konstruktor mit Besitzer als Parameter
	 * 
	 * @param besitzer
	 */
	public Fahrzeug(String besitzer) {
		this.besitzer = besitzer;
	}

	/**
	 * Konstruktor ohne Besitzer, der Besitzer ist daher "Anonym"
	 */
	public Fahrzeug() {
		this.besitzer = "Anonym";
	}

	/**
	 * Getter für besitzer
	 * 
	 * @return
	 */
	public String getBesitzer() {
		return besitzer;
	}

	/**
	 * Setter für besitzer
	 * 
	 * @param besitzer
	 */
	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}

	/**
	 * Diese Methode ist nur als Kopf vorhanden und daher abstrakt. Sie muss von
	 * einer Kind-Klasse implementiert werden
	 */
	public abstract void zeigeDaten();

}
