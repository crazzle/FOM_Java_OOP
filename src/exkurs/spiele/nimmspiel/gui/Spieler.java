package exkurs.spiele.nimmspiel.gui;

/**
 * Repräsentiert einen Spieler
 * 
 * @author Mark Keinhoerster
 * 
 */
public class Spieler {
	// Der Name des Spielers
	private String name;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 */
	public Spieler(String name) {
		this.name = name;
	}

	/**
	 * Getter, der den Namen des Spielers zurückgibt
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
}
