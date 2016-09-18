package sortieren;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Panel in dem die Sortierung visualisiert wird
 * 
 * @author keinmark
 * 
 */
public class SortVisualizerPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// zu sortierende Liste
	// Liste soll aufsteigend sortiert werden
	int[] liste;

	/**
	 * Konstruktor
	 * 
	 * @param _anzahl
	 */
	public SortVisualizerPanel(int _anzahl) {
		// initialisieren der Liste
		liste = new int[_anzahl];

		// Größe des Panels setzen
		setPreferredSize(new Dimension(_anzahl, _anzahl));

		// Liste mit zufallswerten initialisieren
		for (int i = 0; i < liste.length; i++) {
			liste[i] = (int) Math.round(Math.random() * _anzahl);
		}
	}

	/**
	 * Paint-Methode die unsere Liste zeichnet. Der Index selbst ist der X-Wert
	 * für den zu zeichnenden Punkt. Der Wert an der Stelle des Index im Array
	 * ist der Y-Wert für den zu zeichnenden Punkt. Weiter unten liegende Pixel
	 * werden nach rechts sortiert, weiter oben liegende Pixel folglich nach
	 * link
	 */
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < liste.length; i++) {
			g.drawOval(i, liste[i], 1, 1);
		}
	}

	/**
	 * Selectsort
	 */
	public void selectSort() {
		int tempj = 0;
		for (int i = 0; i < liste.length; i++) {
			tempj = i;
			for (int j = i + 1; j < liste.length; j++) {
				if (liste[tempj] > liste[j]) {
					tempj = j;
				}
			}
			swapWithSleepAndRepaint(i, tempj);
		}
	}

	/**
	 * Bubblesort
	 */
	public void bubbleSort() {
		for (int i = liste.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (liste[j] > liste[j + 1]) {
					swapWithSleepAndRepaint(j, j + 1);
				}
			}
		}
	}

	/**
	 * Einstiegsmethode in den Quicksort
	 */
	public void quickSort() {
		quickSort(0, liste.length - 1);
	}

	/**
	 * Quicksort
	 * 
	 * @param lo
	 * @param hi
	 */
	public void quickSort(int lo, int hi) {
		int i = lo;
		int j = hi;
		int x = liste[(hi + lo) / 2];

		while (i <= j) {
			while (liste[i] < x) {
				i++;
			}
			while (liste[j] > x) {
				j--;
			}
			if (i <= j) {
				swapWithSleepAndRepaint(i, j);
				i++;
				j--;
			}
		}
		if (lo < j) {
			quickSort(lo, j);
		}
		if (i < hi) {
			quickSort(i, hi);
		}
	}

	/**
	 * SWAP- Tauscht 2 Elemente, wartet anschließend und macht dann ein repaint
	 * um die Änderung auch visuell zu zeigen
	 * 
	 * @param i
	 * @param j
	 */
	private void swapWithSleepAndRepaint(int i, int j) {
		int o = liste[i];
		liste[i] = liste[j];
		liste[j] = o;

		try {
			Thread.currentThread();
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
	}
}
