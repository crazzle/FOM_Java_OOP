package liskov;

public class Ellipse {

	protected int dx = 0;
	protected int dy = 0;

	public Ellipse(int x, int y) {
		this.dx = x;
		this.dy = y;
	}

	public void zeichne() {
		// methode zum zeichnen
		// verwendet dx und dy
	}

}
