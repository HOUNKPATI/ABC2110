package revisionboucle;

import java.util.Scanner;

public class boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION
		
		//Reel bonjourmonsieur
		float bonjourmonsieur;
		
		//Reel lundi
		String lundi;
		
		//Chaine charactere sommesNousLundi
		String sommesNousLundi = null;
		
		//Saisir
		
		Scanner sc = new Scanner (System.in);
		
		//Ecrire "Bonjour Monsieur"
		System.out.println("Bonjour Monsieur");
		
		//Ecrire "lundi"
		System.out.println("Sommes nous lundi?");
		
		//Lire lundi
		lundi = sc.nextLine();
		
		//Si(lundi == "oui")Alors
		if(lundi.equals("oui")){
			
			//Ecrire "Je vais au CRM"
			System.out.println("Je vais au CRM");
		}
			else {
				
				//Si ("lundi == "non")Alors
				if(lundi.equals("non")){
					
					//Ecrire "Je retourne au foot"
					System.out.println("Je retourne au foot");
				}
		}
			
	}
	
}

