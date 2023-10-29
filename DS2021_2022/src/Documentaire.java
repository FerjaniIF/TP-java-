import java.util.Scanner;

class Documentaire extends Film{
	String sujet;
	private static float tarif = 2;
	
	public Documentaire(String titre, String r, String pays, int d, String sujet) {
        super(titre, r, pays, d);
        this.sujet = sujet;
    }
	
	@Override
    public String toString() {
        return super.toString() + " - Sujet: " + sujet;
    }
	
	@Override
    public float totalVenteBillets() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de billets etudiants pour le film " + titre + ": ");
        float nbE = scanner.nextFloat();
        if (nbE <= getNbPr())
        	nbE *= tarif;
        
        return nbE;
    }
}
