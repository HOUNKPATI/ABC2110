package exomoyenne;

import java.util.Scanner;

public class moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en code Java
		
		// DECLARATIONS DES VARIABLES
		//R�el nombre1
		float nombre1;
		//R�el nombre2
		float nombre2;
		//R�el moyenne
		float moyenne;
		
		//SAISIR
		//ecrire "Donnez moi svp le premier nombre:"
		System.out.println("Donnez-moi svp le premier nombre");
		//lire nombre1
		Scanner sc = new Scanner(System.in); //creer un outil scanner
		nombre1 = sc.nextFloat();
		//System.out.println("vous avez saisi nombre1="+nombre1);
		
		System.out.println("Donnez moi svp le deuxieme nombre");
		nombre2 = sc.nextFloat();
		//System.out.println("vous avez saisi nombre2="+nombre2);
		
		
		//Traitement
		
		moyenne = (nombre1+nombre2)/2;
		
		//Affichage
		//ecrire "la valeur moyenne est :",moyenne
		System.out.println("la moyenne des 2 nombres est :"+moyenne);
		
	}
}
