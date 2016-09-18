package sortieren;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/**
 * Visualisierung von Sotieralgorithmen
 * 
 * @author keinmark
 * 
 */
public class SortVisualizerFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int SIZE = 800;

	SortVisualizerPanel p;

	/**
	 * Konstruktor
	 */
	public SortVisualizerFrame() {
		p = new SortVisualizerPanel(SIZE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(SIZE, SIZE);
		setLocation(100, 100);
		p.addMouseListener(new MeinListener());
		getContentPane().add(p);
	}

	/**
	 * Mauslistener
	 * 
	 * @author keinmark
	 * 
	 */
	class MeinListener extends AbstractMouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			new Thread() {
				public void run() {
					p.quickSort();
				}
			}.start();
		}
	}

	/**
	 * Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SortVisualizerFrame f = new SortVisualizerFrame();
		f.setVisible(true);
	}

}
