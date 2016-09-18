package innereKlassen;

import innereKlassen.Haus.Zimmer.Stuhl;

/**
 * Klasse Haus
 * 
 * @author keinmark
 * 
 */
public class Haus {

	private String name = "Haus";

	/**
	 * Innere Klasse Zimmer
	 * 
	 * @author keinmark
	 * 
	 */
	public class Zimmer {

		private String name = "Zimmer";

		// Innere Klasse Stuhl
		class Stuhl {

			private String name = "Stuhl";

			// Ausgaben
			public void ausgabe() {
				System.out.println(Haus.Zimmer.Stuhl.this.name);
				System.out.println(Zimmer.this.name);
				System.out.println(Haus.this.name);
			}

		}

	}

	/**
	 * Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Haus haus = new Haus();
		Zimmer zimmer = haus.new Zimmer();
		Stuhl stuhl = zimmer.new Stuhl();
		stuhl.ausgabe();
	}
}
