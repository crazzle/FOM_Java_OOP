package exkurs.bitshift.effizienzvergleich.beispiel;

public class MultiplikationMitBitshift {
    public static void main(String[] args) {
	int a = 20;
	int b = 10;
	int ergebnis = 0;

	while (b != 0) {
	    int cond = b & 1;
	    if (cond != 0) {
		ergebnis += a;
	    }
	    a <<= 1;
	    b >>= 1;
	}

	System.out.println(ergebnis);

	System.out.println();

	System.out.println("Gerade Zahlen?");
	for (int i = 0; i < 100; i++) {
	    if ((i & 1) == 1) {
		System.out.println(i + " ist ungerade");
	    } else {
		System.out.println(i + " ist gerade");
	    }
	}
    }
}
