public class TestDict {

    public static void main(String[] args) {
        Dictionnaire larousse = new Dictionnaire("larousse");

        MotDico[] dico = larousse.dico;

        dico[0] = new MotDico("cuisiniere", "Une personne qui fait la cuisine");
        dico[1] = new MotDico("canard", "Un animal");
        dico[2] = new MotDico("ordinateur", "Machine electronique capable de traiter des donnees");
//        dico[3] = new MotDico("canard", "Un animal");


        larousse.listerDico(); 
        
        String m = "canard";
        if(larousse.chercherMot(m) == -1) {
        	System.out.println("\n---------------\nMot introuve");
        }
        else {
        	int pos = larousse.chercherMot(m);
        	MotDico motTrouve = larousse.dico[pos];
        	System.out.println("\n---------------\nMot trouve : " + motTrouve.getMot() + ", Definition : " + motTrouve.getDef());
        }
        
        
        System.out.println("\n---------------\nNombre de synonymes : "+larousse.nbSynonymes(dico[1]));
        
        larousse.supprimerMot(m);
        System.out.println("\n---------- Larousse apres suppression ---------\n");
        larousse.listerDico();
       
        	
        	
    }
}
