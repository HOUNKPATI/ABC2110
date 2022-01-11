package structure_alternative9;

import java.util.Scanner;

public class exo1aetb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATION
		
		//Reel a
		float a;
		
		//Reel b
		float b;
		
		
		//SAISIE ET TRAITEMENT
		
		//Ecrire "a"
		System.out.println("saisire a");
		
		Scanner sc = new Scanner(System.in);
		
		
		//Lire"a"
		a = sc.nextFloat();
		
		//Ecrire"b"
		System.out.println("saisire b");
		
		//Ecrire"b"
		b = sc.nextFloat();
		

		
		//Si (a>b) Alors
		if ( a > b ){
			
			//Ecrire ("b < a")
			System.out.println("a > b");
			
		}
		else if(a < b) {
			
		 
		
		//Ecrire ("b > a")
		System.out.println("b > a");
		
		}
		
		else if(a == b){
			
			//Ecrire("a == b")
			System.out.println("a = b");
		}
	}	

}
			
		
			
		
		
			
	


