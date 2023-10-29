import java.util.Scanner;

public class Film {
	String titre;
	String r;
	String pays;
	int d;
	private int nbPr;
	float tot;
	
	public int getNbPr() {
		return this.nbPr; 
	}
	
	public void setNbPr(int nbPr) {
		this.nbPr = nbPr;
	}
	
	public String toString() {
		return titre+" de "+r+ "("+pays+")"+ " - "+d+"min"; 
	}
	
	public Film(String titre, String r, String pays, int d) {
		this.titre = titre;
		this.r = r;
		this.pays = pays;
		this.d = d;
	}
	
	public float totalVenteBillets() {
        float tarifE = 2;
        float tarifP = 3;
        int nbE = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de billets etudiants pour le film " + titre + ": ");
        nbE = scanner.nextInt();
        
        if (nbE <= nbPr) {
        	tot = (nbE * tarifE) + ((nbPr- nbE) * tarifP);
             
        }
        return tot;
    }
	
	
}
