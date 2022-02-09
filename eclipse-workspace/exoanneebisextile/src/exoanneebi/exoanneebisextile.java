package exoanneebi;

import java.util.Scanner;

public class exoanneebisextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION

		//Entier annee
		int annee;

		//SAISIE ET TRAITEMENT

		//Ecrire "annee"
		System.out.println("Donnez moi l'année dont vous voulez savoir si c'est bissextile ou pas?");

		Scanner sc = new Scanner(System.in);

		//Lire annee

		annee = sc.nextInt();

		//Si (annee mod 4 == ("oui"))Alors
		if(annee % 4 == 0){

			//Ecrire ("Annee n'est pas bisextile")
			System.out.println("Annee n'est pas bisextile");

		}
		else
		{
			//Si ("annee mod 100 et mod 400 == "non")Alors
			if ((annee % 100 == 0) && (annee % 400 != 0)){

				//Ecrire ("Annee n'est pas bisextile")
				System.out.println("Annee n'est pas bisextile");
			}
			else
			
		{
				//Ecrire ("Annee est bisextile")
				System.out.println("Annee est  bisextile");		
			}
		}
	}
}

		
