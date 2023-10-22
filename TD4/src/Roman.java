
public class Roman extends Livre{
	String nomA;
	String nomE;
	
	public String toString() {
		return super.toString()+ ", nom d'auteur : "+this.nomA+", nom d'editeur : "+this.nomE;
	}
	
	Roman(String titre, int id, String domaine, int nbpages, String nomA, String nomE){
		super(titre,id,domaine,nbpages);
		this.nomA = nomA;
		this.nomE = nomE;
	}
	
	public double calculPrix() {
		return prix = (0.05 * nbpages)*(1+TVA);
	}
}
