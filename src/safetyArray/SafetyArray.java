package safetyArray;

/**
 * SafetyArray
 * 
 * @author keinmark
 * 
 */
public class SafetyArray {
	private Object[] elements;
	private int sizingFactor = 5;

	/**
	 * Konstruktor der das Array mit 5 Feldern initialisiert
	 */
	public SafetyArray() {
		elements = new Object[5];
	}

	/**
	 * Gibt das Element an der Stelle "index" zurück
	 * 
	 * @param index
	 * @return
	 * @throws ThereIsNoElementAtThisIndexException
	 */
	public Object getElement(int index)
			throws ThereIsNoElementAtThisIndexException {
		if (index < 0 || elements.length <= index || elements[index] == null) {
			throw new ThereIsNoElementAtThisIndexException();
		}
		return elements[index];
	}

	/**
	 * Fügt Element an einem bestimmten Index ein und überschreibt das Element
	 * das bereits im Feld vorhanden
	 * 
	 * @param index
	 * @param element
	 */
	public void insertElement(int index, Object element) {
		int len = elements.length;
		if (index > (len - 1)) {
			len = resize(index);
		}
		elements[index] = element;
	}

	/**
	 * Vergrößert das Array anhand der Länge die benötigt wird; Vergrößerung =
	 * benötigte Länge + 5
	 * 
	 * @param neededLength
	 * @return
	 */
	private int resize(int neededLength) {
		int newLen = neededLength + sizingFactor;
		Object[] temp = new Object[newLen];
		for (int i = 0; i < elements.length; i++) {
			temp[i] = elements[i];
		}
		elements = temp;
		return elements.length;
	}

	/**
	 * Entfernt Element aus dem Array
	 * 
	 * @param element
	 * @throws ThisObjectDoesNotExistHereException
	 */
	public void removeElement(Object element)
			throws ThisObjectDoesNotExistHereException {
		boolean removed = false;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null && elements[i].equals(element)) {
				elements[i] = null;
				removed = true;
			}
		}
		if (!removed) {
			throw new ThisObjectDoesNotExistHereException();
		}
	}

	/**
	 * Gibt die Länge von Elements zurück
	 * 
	 * @return
	 */
	public int getSize() {
		return elements.length;
	}

}
