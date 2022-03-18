package projet2;

public class numero2 {
	
	public static void main(String[]args) {

	for(int i = 0; i < args.length; i++) {
		
		String sentence = String.format("L'argument %d vaut %s.", i, args[i]);
		
		System.out.println(sentence);
		
	}
	
}
}
