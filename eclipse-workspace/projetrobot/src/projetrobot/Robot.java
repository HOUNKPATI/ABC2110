package projetrobot;

public class Robot{
	
	private String numeroDeSerie;
	private boolean enMarche;
    private String typeDeDeplacement;
    private boolean aDesBras;
    private float positionX;
    private float positionY;
    private float positionZ;
    
    
  //constructeupar default: il donne des valeurs par defaut aux attributs
    public Robot() {
        numeroDeSerie="O";
        enMarche=false;
        typeDeDeplacement="DeplacementPied";
        aDesBras=true;
        positionX=0;
        positionY=0;
        positionZ=0;
        
    }
    
  //constructeur classique: il donne les valeurs passées en parametre aux attributs
    public boolean demarer() {
    	//fonction: il renvoie un boolean, ici true;
    	System.out.println("demarrage du Robot");	
            if(enMarche) {
            	enMarche = true;
            	return true;
			}else {
				return false;
			}
    }
    
    public boolean arreter() {
    System.out.println("arret Du Robot");	
    	if (enMarche) {
    		enMarche = false;
    		return true;
    	} else {
    		return false;
    	}
    	
    }
    
    public boolean seDeplacer(float positionX, float positionY) {
    	return true;
    	
    }
    
    public boolean sauter(float hauteur) {
    	return true;
    	
    }
    	
    public boolean attraperUnObjet(Object objetAAttraper){
    	return true;
    }
    
    public float recupererPositionX() {
    	return this.positionX;
    }
     
    	
   
    
}
    
    	 
  	
  
