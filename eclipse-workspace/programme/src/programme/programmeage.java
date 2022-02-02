package programme;

public class programmeage {
	
	public static void main(String[] args) {
		
		int ageATester = 18;
		
		String resultat = estIlMajeur(ageATester);
		
		//Ecrire resultat;
		System.out.println(resultat);
		
	}
	
	public static String estIlMajeur(int age) {
		if(age >= 18) {
				return "Majeur!";
		}
		else {
		
		return "Mineur !";
		
		}
		
	}
}
