
public class Livre {
	protected String titre;
	protected int id;
	static final protected double TVA = 0.1;
	protected String domaine;
	protected int nbpages;
	double prix;
	
	public String toString() {
		return "type : "+this.getClass()+", titre : "+this.titre+", identifiant : "+this.id+", domaine : "+this.domaine+", nombre de pages : "+this.nbpages;
	}
	
	
	public Livre(String titre, int id, String domaine, int nbpages){
		this.titre = titre;
		this.id = id;
		this.domaine = domaine;
		this.nbpages = nbpages;
	}
	 
	public double calculPrix() {
		return prix = (0.075 * nbpages)*(1+TVA);
	} 
}
