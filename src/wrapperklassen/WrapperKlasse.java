package wrapperklassen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Experimente mit den Wrapperklassen
 * 
 * @author keinmark
 * 
 */
public class WrapperKlasse {

	// Wrapper
	static Byte myByte = new Byte((byte) 2);
	static Short myShort = new Short((short) 3);
	static Integer myInteger = new Integer(30);
	static Long myLong = new Long(90000000);
	static Float myFloat = new Float(9.7);
	static Double myDouble = new Double(10.9);
	static Boolean myBoolean = new Boolean(true);
	static Character myChar = new Character('#');

	// Bekommt einen Wrapper übergeben und gibt einen primitiven Datentyp zurück
	public static boolean getBooleanAsPrimitive(Boolean bool) {
		return bool.booleanValue();
	}

	// Bekommt einen primitiven Datentyp übergeben und gibt einen Wrapper zurück
	public static Boolean getBooleanAsWrapper(boolean bool) {
		return new Boolean(bool);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WrapperKlasse.myBoolean.toString();

		// Funktioniert
		WrapperKlasse.getBooleanAsPrimitive(true);
		WrapperKlasse.getBooleanAsPrimitive(new Boolean(true));

		// Funktioniert
		WrapperKlasse.getBooleanAsWrapper(true);
		WrapperKlasse.getBooleanAsWrapper(new Boolean(true));

		// Collection: ArrayList
		// Repräsentiert eine Liste auf die per Index zugegriffen werden kann
		ArrayList<Integer> integerList = new ArrayList<Integer>(); // Typisiert
																	// auf
																	// Integer
		System.out.println(integerList.isEmpty());

		// Element hinzufügen
		integerList.add(1);

		// Element hinzufügen
		integerList.add(10);

		System.out.println(integerList.size());

		// eine Möglichkeit die ArrayList zu durchlaufen und via Index darauf
		// zuzugreifen
		for (int i = 0; i < integerList.size(); i++) {
			integerList.get(i).byteValue();
		}

		// Iteriert durch die ArrayList
		// i ist das aktuelle Element
		for (Integer i : integerList) {
			i.byteValue();
		}

		// Collection: Map
		// Zugriff auf einen Wert über einen Schlüssel

		// Typisierung: Schlüssel = String, Wert = Integer
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();

		// Wert 5 zu Schlüssel A
		myMap.put("A", 5);

		// Wert 7 zu Schlüssel X
		myMap.put("X", 7);

		System.out.println(myMap.get("A"));

		// Wert zu A wird überschrieben
		myMap.put("A", 3);
		System.out.println(myMap.get("A"));

		// Collection: Set
		// Set = Menge, Elemente kommen nur einmal vor

		// WICHTIG:
		// HashSet: HashSets sind nicht sinnvoll sortiert
		HashSet<Integer> mySet = new HashSet<Integer>();
		mySet.add(10);
		mySet.add(5);
		System.out.println(mySet.size());

		// Die 5 noch einmal hinzugefügen
		// Es passiert nichts
		mySet.add(5);
		System.out.println(mySet.size());

		// Eine Möglichkeit durch ein Set zu iterieren
		for (Integer i : mySet) {
			System.out.println("# " + i);
		}

		// Iterieren durch eine Collection via Iterator
		Iterator<Integer> iterator = mySet.iterator(); // Iterator des Sets
														// holen

		while (iterator.hasNext()) { // solange wie es einen nächsten Eintrag
										// gibt

			// iterator.next() liefert das aktuelle Element zurück
			// und setzt ihn auf das nächste Element
			System.out.println(iterator.next() + " , mit Iterator");
		}

	}
}
