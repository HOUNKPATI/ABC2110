package random;

import java.util.*;

public class fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre = 0;
		int nombreAleatoire;
		int borneSup = 100;
		int borneInf = 0;
		int essaie = 0;
		boolean trouve = false;

		Random rand = new Random ();

		Scanner sc = new Scanner(System.in);


		nombreAleatoire = rand.nextInt(101);

		do {

			System.out.println("Veuillez saisir un nombre entre "+borneInf+" et "+borneSup+"");
			nombre = sc.nextInt();

			//System.out.println(essai++);

			if (nombre == nombreAleatoire) {
				//System.out.println("F�licitation "+nombre+" est le bon nombre");

			}else if (nombre < nombreAleatoire){borneInf = nombre;
			//System.out.println("Votre fourchette est de "+nombre" � 100);

			}else {
				System.out.println("Bravo vous avez trouv� le nombre recherch� c'est bien "+nombre);

				System.out.println("avec "+essaie+" essaie");

				trouve = true;

			}

			essaie++;
		}
			while(trouve == false);
			
			System.out.println("jeux termin�");

		sc.close();



	}//fin de main;


} //fin de classe

