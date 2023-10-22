
public class Magazine extends Livre {
	int moisP;
	
	public String toString() {
		return super.toString()+", le mois de parution : "+this.moisP;
	}
	
	Magazine(String titre, int id, String domaine, int nbpages,int moisP){
		super(titre,id,domaine,nbpages);
		this.moisP = moisP; 
	}
	
	public double calculPrix(int bonus) {
		return prix = (0.35 * nbpages)*(1+TVA)+bonus; 
	}
}
