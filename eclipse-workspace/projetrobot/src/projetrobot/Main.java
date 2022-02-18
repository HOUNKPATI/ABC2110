package projetrobot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc = new Scanner(System.in);
		Robot bleu = new Robot(); 
		bleu.arreter();
		bleu.demarer();
		bleu.recupererPositionX();
		System.out.println(bleu.recupererPositionX());
		
	}

}
 