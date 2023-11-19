package tp5;

public class PropProfessionnelle extends Propriete{
	protected int nbEmployes;
	protected boolean estEtatique;
	
	public PropProfessionnelle(int cin, Personne r, String adr, double s, int nbE, boolean estEtatique) {
		super(cin,r,adr,s);
		this.nbEmployes = nbE;
		this.estEtatique = estEtatique;
	}
	
	double calculImpot() {
	double m = 0.0;
	if(!this.estEtatique)
		return m = (100/this.surface)+(30* this.nbEmployes);
	return m;
	}
	
}