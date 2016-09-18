package oop.aufgaben.comparing;

import java.util.Comparator;

/**
 * Unser Comparator der Kühe aufsteigend nach dem Alter sortiert
 * 
 * @author keinmark
 * 
 */
public class KuhAlterComparator implements Comparator {

	/**
	 * Implementiert die Methode aus dem Interface "java.util.Comparator" aus
	 */
	@Override
	public int compare(Object o1, Object o2) {
		KuhOhneComparable kuh1 = (KuhOhneComparable) o1;
		KuhOhneComparable kuh2 = (KuhOhneComparable) o2;
		return kuh1.getAlter() - kuh2.getAlter();
	}

}
