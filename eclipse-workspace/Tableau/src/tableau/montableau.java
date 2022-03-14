package tableau;
public class montableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		String[] monTableau;
		
		//instacier/affecter une valeur dans le tableau
		
		a = 3;
		monTableau = new String[4];
		
		monTableau[0] = "café";
		monTableau[1] = "thé";
		monTableau[2] = "tisane";
		monTableau[3] = "décoction";
		
		System.out.println(monTableau[monTableau.length-1]);
		
		for (int i = 0; i < monTableau.length ; i++) {
			
			monTableau[i] = monTableau[i] + "s";
			
			System.out.println(monTableau[i] + monTableau[i].length());
		}
		
		float [] lab = new float[4];
		
		lab [0] = 10;
		lab [1] = 25;
		lab [2] = 32;
		lab [3] = 50;
		
		float sommeLab = 0;
		for (int i = 0; i < lab.length; i++) {
			sommeLab += lab[i];
		}
		
		System.out.println();
		System.out.println(sommeLab/lab.length);
	}

}
