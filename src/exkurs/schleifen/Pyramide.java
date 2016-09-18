package exkurs.schleifen;

public class Pyramide {

    public static void main(String[] args) {
	int anzahl = 10;

	for (int i = 0; i <= anzahl; i++) {
	    for (int k = anzahl; k > i; k--) {
		System.out.print(" ");
	    }

	    for (int j = 0; j <= i; j++) {
		System.out.print("*");
	    }

	    for (int l = 0; l < i; l++) {
		System.out.print("*");
	    }

	    System.out.println();

	}
    }
}