

import java.util.Scanner;

public class Int�r�t {

	public static void main(String[] args) {
		//Traduction du pseudo code en code java
		// TODO Auto-generated method stub
	
		
		//DECLARATION DES VARIABLES
		//R�el rayon
		float rayon;
		//R�el angle
		float angle;
		//R�el aire
		float aire;
		
		
		//SAISIR
		//ecrire "Entrer SVP le rayon"
		System.out.println("Entrer SVP raoyon");
		
		//lire rayon
		Scanner sc = new Scanner(System.in);  //creer un util Scanner 
		rayon = sc.nextFloat();
		System.out.println("rayon du cercle="+rayon);
		
		//TRAITEMENT
		//Aire<--- Math.PI*rayon2*angle/360 air="Math.PI*pow(rayon2)*angle/360;
		
		//AFFICHAGE
		//ecriree"aire est" PI*rayon2*aire /360 system.out.println(aire est:+aire);

	}

}
