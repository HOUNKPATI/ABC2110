
package jeune.java;

import java.util.Arrays;
import java.util.Scanner;

public class ageInferieur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbrJeunes = 0;
		int nbrVieux = 0;
		int nbVingtenaires = 0;
		int[] tableau = new int [20];

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez entrer 20 nombres");

		for (int compteur = 0; compteur < tableau.length; compteur++) {
			tableau [compteur] = sc.nextInt();
			if (tableau[compteur] < 20) {
				nbrJeunes++;
			}
			else if (tableau[compteur] > 20) {
				nbrVieux++;
			} else {
				nbVingtenaires++;
			}
		}

		System.out.println("il y a " +nbrJeunes+ " personnes de - de 20 ans et "+nbrVieux+" "
				+ "personnes de + de 20 ans");

		Arrays.sort(tableau);

		sc.close();

	}

}
