package exoadressemail;

import java.util.Scanner;

public class adressemail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	//DECLARATION
	
		//Reel prenom
		String prenom;
	
		//Reel nom
		String nom;
	
		//Reel un numero de departement
		String unNumeroDeDepartement;
	
		//Reel adresse mail
		String adresseMail;
		
		Scanner sc = new Scanner(System.in);
	//Saisir
		
		//Ecrire "Donnez-moi s'il vous plaît un prenom"
		System.out.println("Donnez-moi s'il vous plaît un prenom");
		
		//Lire "prenom"
		prenom = sc.next();
		
		//Ecrire "nom"
		System.out.println("Donnez-moi s'il vous plaît un nom");
		
		//Lire "nom"
		
		nom = sc.next();
		
		
		//ecrire "Donnez-moi SVP un N° de Département"
		System.out.println("Donnez-moi SVP un N° de Département");
		
		//Lire "unNumeroDeDepartement"
		
		unNumeroDeDepartement = sc.next();
		
		//ecrire "Donnez-moi SVP une adresseMail"
		System.out.println("Donnez-moi SVP une adresse mail");
				
		//Lire "adresseMail"
		
		adresseMail = sc.next();
				
	}
	
}
