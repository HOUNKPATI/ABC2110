package exoroaireetvolume;

import java.util.Scanner;

public class HOUNKPATI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATION DES VARIABLES
		
		//R�el rayon;
		double rayon;
		//R�el surface;
		double surface;
		//R�el volume;
		double volume;
		
		//SAISIR
		
		//ecrire "Donner moi SVP le rayon"
		System.out.println("Donnez moi SVP le rayon");
		//lire rayon
		Scanner sc = new Scanner(System.in); //cree un outil scanner
		rayon = sc.nextFloat();
		System.out.println("le rayon de la sph�re est "+rayon);
		
		
		//TRAITEMENT
		
		//<--(aire+volume);
		surface = 4*Math.PI*Math.pow(rayon,2);
		volume = 4d/3*Math.PI*Math.pow(rayon,3);
		
		//Affichage
		
		//ecrire"la surface est", 4pi r�"
		System.out.println("la surface="+surface);
		//ecrire "le volume est :"4/3 pi r)
		System.out.println("le volume="+volume);
	}

}
