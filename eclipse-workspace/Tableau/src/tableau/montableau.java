package tableau;
public class montableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		String[] monTableau;
		
		a = 4;
		 
		for (int i = 0; i <args.length ; i++) {
			String sentence = String.format("L'argument %d vau %s.", i, args[i]);
		System.out.println(sentence);
		}
		
	}

}
