package tableau.java;

import java.util.Scanner;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String saisie;
		String[] tableauDeConversion;

		int valeur;
		
		String uniteDeMesure;
		
		double conversion;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez une valeur suivie de MI ou KM:");

		saisie = sc.nextLine().toLowerCase(); 

		tableauDeConversion = saisie.split(" ");

		valeur = Integer.valueOf(tableauDeConversion[0]);

		if(tableauDeConversion.length > 1) 
		{
			uniteDeMesure = tableauDeConversion[1];
		}
		else 
		{
			uniteDeMesure = "km";
		}
			
			
		if(uniteDeMesure.equals("km")) 
		{
			conversion = (valeur/1.609);
				
			System.out.println("La distance de " + valeur + " km est de " + conversion + " mi");
		}
		
		if(uniteDeMesure.equals("mi")) 
		{
			conversion = (valeur/1.609);
				
			System.out.println("La distance de " + valeur + " km est de " + conversion + " mi");
		}
		
	}

}
