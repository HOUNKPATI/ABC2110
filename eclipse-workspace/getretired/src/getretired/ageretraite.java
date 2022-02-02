package getretired;

import java.util.Scanner;

public class ageretraite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int reponse ;		

			//Ecrire "Quel est votre age?"
			System.out.println("Quel est votre age?");
			
			Scanner sc = new Scanner (System.in);
			
			//Lire reponse
			reponse = sc.nextInt();
			
		
			
			//Ecrire reponse  "Votre age est
			
			System.out.println(getRetired (reponse));
			
			sc.close();
					
	}
	
	public static String getRetired (int age) {
		
		int ageDeLaRetraite = 60;
		
		int resultat;
		
		if (age == ageDeLaRetraite) {
			
			return "Vous êtes à la retraite cette année";
			
		}
		
		else if (age > ageDeLaRetraite) {
			
			resultat = age - ageDeLaRetraite;
			
			return "Vous êtes à la retraite depuis " + resultat + "ans";
			
		}
		else if(age > 0 && age < ageDeLaRetraite ) {
			
			
			resultat = ageDeLaRetraite - age;
			
			return "Il vous reste " + resultat + "ans avant la retraite";
			
		}
		else {
			
			return "Il n'est pas encore né";
		}
			
		
		
	}

}
