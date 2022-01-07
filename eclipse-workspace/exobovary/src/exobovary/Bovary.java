package exobovary;

import java.util.Scanner;

public class Bovary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATIONS

		//chaine de charactere ilfaitbeau
		String ilfaitbeau;

		//chaine de charactere bovarydisponibleausalon
		String bovarydisponibleausalon;

		//chaine de charater bovarydisponibledansbiblio
		String bovarydisponibledansbiblio;

		//chaine de charactere bicyclettebonetat
		String bicyclettebonetat;

		//chaine de charactere bicyclettereparee
		String bicyclettereparee;


		//SAISIE ET TRAITEMENT

		//Ecrire "ilfaitbeau"
		System.out.println("ilfaitbeau");

		Scanner sc = new Scanner (System.in);

		//Lire ilfaitbeau
		ilfaitbeau=sc.next();

		//Si(ilfaitbeau == "oui") Alors
		if(ilfaitbeau.equals("oui")){

			//Ecrire ("J'aimerais faire de la bicyclette");
			System.out.println("j'aimerais faire de la bicyclette");

			//Ecrire("bicyclettebonetat oui/non");
			System.out.println("bicyclettebonetat oui/non");

			//lire bicyclettebonetat
			bicyclettebonetat = sc.next();
			
		


			//Si("bicyclettebonetat =="oui")Alors
			if (bicyclettebonetat.equals("oui")){

				//Ecrire("Je fais de la bicyclette")
				System.out.println("Je fais de la bicyclette");

			}
			else

			{
				
				//Ecrire("Je vais chez le garagiste");
				System.out.println("Je vais chez le garagiste");

					//Ecrire ("bicyclettereparee oui/non");
				System.out.println("bicyclettereparee oui/non");
				
				bicyclettereparee = sc.next();
				
				//Si ("bicyclettereparee == "oui") alors
				if (bicyclettereparee.equals("oui")){

					//Ecrire ("Je fais de la bicyclette")
					System.out.println("Je fais de la bicyclette");

				}


				else

				{
					//Ecrire ("Je vais à l'étang");
					System.out.println("Je vais à l'étang");

				}
			}
		}	else {//Si (ilfaitbeau == ("non"))
		
			//Ecrire ("Je vais lire Bovary")
			System.out.println("Je vais lire Bovary");
		
			//Ecrire ("bovarydisponibleausalon ("oui/non"))
			System.out.println("bovarydisponibleausalon oui/non");
			
			 bovarydisponibleausalon = sc.next();
			if (bovarydisponibleausalon.equals ("oui"))  {

				//lire bovarydisponibleausalon
				bovarydisponibleausalon = sc.next();

				//Ecrire ("Je Vais lire Bovary");
				System.out.println("Je vais lire Bovary");

			}

			else
			{
				//Ecrire ("Je vais à la bibliothèque");
				System.out.println("Je vais à la bibliothèque");

				//Ecrire ("bovarydisponibledansbiblio ("oui/non"))
				System.out.println("bovarydisponibledansbiblio oui/non");}
			
			bovarydisponibledansbiblio= sc.next();
			
			//Si (bovarydisponibledansbiblio == ("oui"));
			if (bovarydisponibledansbiblio.equals ("oui")) {

				//Ecrire ("Je m'installe au fauteuil et je lis")
				System.out.println("Je m'installe au fauteuil et je lis");
			}
			else

			{
				//Ecrire ("Je prends un policier, je m'installe au fauteuil et je lis");
				System.out.println("Je prends un policier, je m'installe et je lis");

			}
		}

		//Si (bovarydisponibleausalon == ("oui") Alors
			//FinSI
		
	}
}

//FinSi

			
//FinSI








