package grafik;

import javax.swing.JFrame;

public class MeinErstesFenster extends JFrame {

	/**
	 * Konstruktor
	 */
	public MeinErstesFenster() {
		super("Mein erstes Fenster");
		this.setSize(200, 200);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MeinErstesFenster f = new MeinErstesFenster();
	}

}
